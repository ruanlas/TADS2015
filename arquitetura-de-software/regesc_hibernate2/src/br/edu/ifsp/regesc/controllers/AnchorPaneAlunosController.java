package br.edu.ifsp.regesc.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
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
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class AnchorPaneAlunosController implements Initializable {
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
	@FXML
	private Button buttonInserir;
	@FXML
	private Button buttonEditar;
	@FXML
	private Button buttonApagar;
	
	
	private ArrayList<Student> studentList;
	private ObservableList<Student> studentObservableList;
	private StudentDAO dao;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaa");
		this.dao = new StudentDAO();
		loadTableViewStudent();
		
		
		// Listen acionado diante de quaisquer alterações na seleção de itens do TableView
        this.tableViewAlunos.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> selectItemTableViewAlunos(newValue));
	}

	

	private void loadTableViewStudent() {
		this.studentList = this.dao.all();
		
		// a string é o nome do atributo da classe do objeto
		this.tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
		this.tableColumnNome.setCellValueFactory(new PropertyValueFactory<>("name"));
		
		// conversão de ArrayList para ObservableList
		this.studentObservableList = FXCollections.observableArrayList(this.studentList);
		this.tableViewAlunos.setItems(this.studentObservableList);
	}

	
	public void selectItemTableViewAlunos(Student student) {
		System.out.println(student);
		
		if (student != null) {
			this.labelId.setText(String.valueOf(student.getId()));
			this.labelNome.setText(student.getName());
			this.labelIdade.setText(String.valueOf(student.getAge()));
		}
	}
	
	
	@FXML
	public void handleButtonInserir() throws IOException {
		Student student = new Student();
		boolean buttonConfirmarClicked = showAnchorPaneCadastroAlunosDialog(student);
		
		if (buttonConfirmarClicked) {
			this.dao.insert(student);
			loadTableViewStudent();
		}
	}
	
	
	@FXML
	public void handleButtonEditar() throws IOException {
		Student student = this.tableViewAlunos.getSelectionModel().getSelectedItem();
		
		if (student == null) {
			Alert errorAlert = new Alert(Alert.AlertType.ERROR);
			errorAlert.setContentText("Por favor, escolha um estudante na Tabela!");
			errorAlert.show();
		}
		else {
			boolean buttonConfirmarClicked = showAnchorPaneCadastroAlunosDialog(student);
			
			if (buttonConfirmarClicked) {
				this.dao.update(student);
				loadTableViewStudent();
			}
		}
	}

	
	@FXML
	public void handleButtonApagar() {
		Student student = this.tableViewAlunos.getSelectionModel().getSelectedItem();
		
		if (student == null) {
			Alert errorAlert = new Alert(Alert.AlertType.ERROR);
			errorAlert.setContentText("Por favor, escolha um estudante na Tabela!");
			errorAlert.show();
		}
		else {
			Alert confirmationAlert = new Alert(Alert.AlertType.CONFIRMATION);
			confirmationAlert.setHeaderText("Remoção de Estudantes");
			confirmationAlert.setContentText("Deseja realmente apagar o estudante?");
			
			Optional<ButtonType> result = confirmationAlert.showAndWait();
			if (result.get() == ButtonType.OK) {
				this.dao.delete(student);
				loadTableViewStudent();
			}
		}
	}

	

	public boolean showAnchorPaneCadastroAlunosDialog(Student student) throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(AnchorPaneCadastroAlunosDialogController.class.getResource("/br/edu/ifsp/regesc/views/AnchorPaneCadastroAlunosDialog.fxml"));
		AnchorPane page = (AnchorPane) loader.load();
		
		Stage dialogStage = new Stage();
		dialogStage.setTitle("Cadastro de Clientes");
		Scene scene = new Scene(page);
		dialogStage.setScene(scene);
		
		AnchorPaneCadastroAlunosDialogController controller = loader.getController();
		controller.setDialogStage(dialogStage);
		controller.setStudent(student);
		
		dialogStage.showAndWait();
		
		return controller.isButtonConfirmarClicked();
	}
}







