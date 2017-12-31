package sistema.controlers;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sistema.dao.PessoaDAO;
import sistema.models.Pessoa;

public class AnchorPaneTelaConsultaControler implements Initializable{

	@FXML
	private TableView<Pessoa> tablePessoa;
	@FXML
	private TableColumn<Pessoa, Integer> columnId;
	@FXML
	private TableColumn<Pessoa, String> columnNome;
	@FXML
	private Label lblId;
	@FXML
	private Label lblNome;
	@FXML
	private Label lblCpf;
	@FXML
	private Label lblRg;
	
	private ArrayList<Pessoa> listaPessoas;
	private ObservableList<Pessoa> observableListPessoas; //Serve para tornar visível a lista para a tableView
	//Serve para "setar" os componentes da tableView através do ObservableList]
	private PessoaDAO pessoaDAO = new PessoaDAO();
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		carregarTabelaPessoas();
		
		//Listen acionado diante de quaisquer alterações na seleção de itens do TableView
		tablePessoa.getSelectionModel().selectedItemProperty().addListener(
				(observable, oldValue, newValue) -> selecionarItemTableViewPessoa(newValue));
	}
	
	public void selecionarItemTableViewPessoa(Pessoa pessoa) {
		if (pessoa != null) {
			lblId.setText(String.valueOf(pessoa.getId()));
			lblNome.setText(pessoa.getNome());
			lblCpf.setText(String.valueOf(pessoa.getCpf()));
			lblRg.setText(String.valueOf(pessoa.getRg()));
		}

	}

	public void carregarTabelaPessoas() {
		//estes métodos abaixo estão basicamente dizendo que estão carregando e irão exibir
		//o valor dos respectivos campos do objeto na table
		columnId.setCellValueFactory(new PropertyValueFactory<>("id"));
		columnNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		
		listaPessoas = pessoaDAO.findAll();
		observableListPessoas = FXCollections.observableArrayList(listaPessoas);
		
		tablePessoa.setItems(observableListPessoas);
	}
	
	public boolean showDialogCadastroPessoa(Pessoa pessoa) throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(AnchorPaneTelaCadastroControler.class.getResource("/sistema/views/AnchorPaneTelaCadastro.fxml"));
		AnchorPane page = loader.load();
		
		Stage dialogStage = new Stage();
		Scene scene = new Scene(page);
		dialogStage.setScene(scene);
		
		AnchorPaneTelaCadastroControler controller = loader.getController();
		controller.setDialogStage(dialogStage);
		controller.setPessoa(pessoa);
		
		controller.getDialogStage().showAndWait();
		
		return controller.isBtnGravarChecked();
	}
	
	@FXML
	public void handleBtnCadastrar() throws IOException {
		Pessoa pessoa = new Pessoa();
		
		if(showDialogCadastroPessoa(pessoa)){
			Alert dialogAlert = new Alert(Alert.AlertType.INFORMATION);
			dialogAlert.setContentText(pessoa.toString());
			dialogAlert.showAndWait();
		}
			
	}
	
}
