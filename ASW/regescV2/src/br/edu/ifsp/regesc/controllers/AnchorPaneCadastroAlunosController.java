package br.edu.ifsp.regesc.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import br.edu.ifsp.regesc.models.Student;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AnchorPaneCadastroAlunosController implements Initializable{

	@FXML
	private Label labelId;
	@FXML
	private TextField textFieldNome;
	@FXML
	private TextField textFieldIdade;
	@FXML
	private Button btnCancelar;
	@FXML
	private Button btnConfirmar;
	
	//Servirá para abrir uma outra janela/pop up simultânea em nossa aplicação
	private Stage dialogStage; //"Palco"
	
	//Irá mostrar se o botão "Confirmar" foi clicado ou nao
	private boolean bottonConfirmarClicked = false;
	
	private Student student;
	
	
	public Stage getDialogStage() {
		return dialogStage;
	}

	public void setDialogStage(Stage dialogStage) {
		this.dialogStage = dialogStage;
	}

	public boolean isBottonConfirmarClicked() {
		return bottonConfirmarClicked;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
		
		this.labelId.setText(String.valueOf(this.student.getId()));
		this.textFieldNome.setText(this.student.getName());
		this.textFieldIdade.setText(String.valueOf(this.student.getAge()));
	}


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

	@FXML
	public void handleBtnConfirmar() {
		//TODO: Método de validação dos campos de textField
		this.student.setName(this.textFieldNome.getText());
		this.student.setAge(Integer.parseInt(this.textFieldIdade.getText()));
		
		this.bottonConfirmarClicked = true;//confirma que o botão confirmar foi pressionado
		this.dialogStage.close();
		
	}
	
	@FXML
	public void handleBtnCancelar() {
		this.dialogStage.close();
	}
}
