package br.edu.ifsp.regesc.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Optional;
import java.util.ResourceBundle;

import br.edu.ifsp.regesc.dao.StudentDAO;
import br.edu.ifsp.regesc.models.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AnchorPaneAlunosController implements Initializable{
	//Sempre que for preciso associar um elemento grafico ou um evento do botao da view 
	//para o controler, manter o mesmo nome atribuido no fx:id do elemento e colocar a 
	//notação @FXML no controler
	@FXML
	private TableView<Student> tableViewAlunos;
	@FXML
	private TableColumn<Student, Long> tableColumnId;
	@FXML
	private TableColumn<Student, String> tableColumnNome;
	@FXML
	private Label labelId;
	@FXML
	private Label labelNome;
	@FXML
	private Label labelIdade;
	
	
	
	
	private ArrayList<Student> studentList;
	private ObservableList<Student> studentObservableList;
	private StudentDAO dao;
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("POOOOOOOOOOOOOOOOOOO");
		this.dao = new StudentDAO();
		
		
		loadTableViewAlunos();
		
		//
		tableViewAlunos.getSelectionModel().selectedItemProperty().addListener(
				(observable, oldValue, newValue) -> selectItemTableViewAlunos(newValue));
	}
	
	public void loadTableViewAlunos() {
		this.studentList = this.dao.findAll();
		
		//A string é o nome do atributo da classe do objeto
		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
		tableColumnNome.setCellValueFactory(new PropertyValueFactory<>("name"));
		
		//converte um arraylist para um ObservableList
		System.out.println("kldaljskfsd");
		this.studentObservableList = FXCollections.observableArrayList(this.studentList);
		this.tableViewAlunos.setItems(this.studentObservableList);
//		for (Student student : studentObservableList) {
//			System.out.println(student.getName());
//		}
	}
	
	public void selectItemTableViewAlunos(Student student) {
		//Imprime "setando" o campo de cada label
		if(student != null){
			this.labelId.setText(String.valueOf(student.getId()));
			this.labelNome.setText(student.getName());
			this.labelIdade.setText(String.valueOf(student.getAge()));
		}
		
	}
	
	@FXML
	public void handleBtnCadastrar() throws IOException {
		Student student = new Student(); //Cria-se um objeto Student e
		//É passado a referência deste objeto Student para a tela que será chamada para cadastro
		boolean btnConfirmarClicked = showAnchorPaneCadastroAlunos(student);
		
		if (btnConfirmarClicked) { //verifica se a janela foi confirmado o cadastro, ou se foi cancelado pelo usuario
		//***Este Bloco só irá executar se o usuário realmente confirmar o cadastro***//
			
			//Após alterar os dados do objeto pela tela chamada, o objeto é gravado no banco
			this.dao.insert(student);
			//Logo apos, chamamos o método para carregar novamente os dados na table
			loadTableViewAlunos();
		}
		
	}
	
	@FXML
	public void handleBtnEditar() throws IOException {
		Student student = this.tableViewAlunos.getSelectionModel().getSelectedItem(); //retorna o objeto selecionado da tabela
		
		if(student == null){ //caso o usuário não seleciona nenhum aluno
			Alert errorAlert = new Alert(Alert.AlertType.ERROR);
			errorAlert.setContentText("Por favor, escolha um estudante na tabela!");
			errorAlert.setTitle("Atenção");
			errorAlert.show();
		}else {
			
			boolean btnConfirmarClicked = showAnchorPaneCadastroAlunos(student);
			
			if (btnConfirmarClicked) { //verifica se a janela foi confirmado o cadastro, ou se foi cancelado pelo usuario
				//***Este Bloco só irá executar se o usuário realmente confirmar o cadastro***//
					
				//Após alterar os dados do objeto pela tela chamada, o objeto é gravado no banco
				this.dao.update(student);
				//Logo apos, chamamos o método para carregar novamente os dados na table
				loadTableViewAlunos();
				
			}
		}
	}
	
	@FXML
	public void handleBtnApagar() {
		Student student = this.tableViewAlunos.getSelectionModel().getSelectedItem(); //retorna o objeto selecionado da tabela
		
		if(student == null){
			Alert errorAlert = new Alert(Alert.AlertType.ERROR);
			errorAlert.setContentText("Por favor, escolha um estudante na tabela!");
			errorAlert.setTitle("Atenção");
			errorAlert.show();
		}else {
			Alert confirmationAlert = new Alert(Alert.AlertType.CONFIRMATION);
			confirmationAlert.setTitle("Confirmação de exclusão");
			confirmationAlert.setHeaderText("Exclusão de estudantes");
			confirmationAlert.setContentText("Deseja realmente apagar o estudante?");
			
			Optional<ButtonType> result = confirmationAlert.showAndWait();//este método showAndWait retorna o botão que o usuario pressionou
			if (result.get() == ButtonType.OK) {
				
				this.dao.delete(student);
				loadTableViewAlunos();
				
			}
			
		}
		
	}

	public boolean showAnchorPaneCadastroAlunos(Student student) throws IOException {
		FXMLLoader loader = new FXMLLoader();
		//É passado o Controler da Tela de CadastroAlunos (a tela que será chamada pelo botão)
		loader.setLocation(AnchorPaneCadastroAlunosController.class.getResource("/br/edu/ifsp/regesc/views/AnchorPaneCadastroAlunos.fxml"));
		AnchorPane page = loader.load(); //atribui a tela ao page (carrega a tela ao page)
		
		Stage dialogStage = new Stage(); //Cria o "palco"
		dialogStage.setTitle("Cadastro de Alunos");  //Atribui o nome ao 'palco'
		Scene scene = new Scene(page); //Cria uma cena que contenha a tela (page)
		dialogStage.setScene(scene); //Importa-se a cena ao palco
		
		AnchorPaneCadastroAlunosController controller = loader.getController(); //carrega o controller que havia sido criado acima
		controller.setDialogStage(dialogStage);
		controller.setStudent(student);	
//		controller.getDialogStage().showAndWait();
		
		dialogStage.showAndWait();
		
		return controller.isBottonConfirmarClicked(); //retorna se o cadastro foi confirmado ou cancelado pelo usuário
	}

}
