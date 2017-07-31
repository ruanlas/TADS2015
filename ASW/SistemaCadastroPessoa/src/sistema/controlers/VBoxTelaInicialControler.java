package sistema.controlers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sistema.models.Pessoa;

public class VBoxTelaInicialControler implements Initializable{
	@FXML
	private Label lblMsg;
	@FXML
	private AnchorPane anchorPane;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}
	
	@FXML
	public void handleBtnNovoCadastro() throws IOException{
//		lblMsg.setText("Você clicou no botão de novo cadastro");
//		AnchorPane a = FXMLLoader.load(getClass().getResource("/sistema/views/AnchorPaneTelaCadastro.fxml"));
//		anchorPane.getChildren().setAll(a);
		Pessoa pessoa = new Pessoa();
		
		if(showDialogCadastroPessoa(pessoa)){
			Alert dialogAlert = new Alert(Alert.AlertType.INFORMATION);
			dialogAlert.setContentText(pessoa.toString());
			dialogAlert.showAndWait();
		}
	}
	@FXML
	public void handleBtnConsultarCadastro() throws IOException {
		lblMsg.setText("Você clicou no botão de consultar cadastro");
		AnchorPane a = FXMLLoader.load(getClass().getResource("/sistema/views/AnchorPaneTelaConsulta.fxml"));
		anchorPane.getChildren().setAll(a);
	}
	@FXML
	public void handleBtnEditarCadastro() {
		lblMsg.setText("Você clicou no botão de editar cadastro");
	}
	@FXML
	public void handleBtnAbout() {
		lblMsg.setText("Você clicou no botão de About");
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

}
