package br.edu.ifsp.regesc.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import br.edu.ifsp.regesc.models.Student;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AnchorPaneCadastroAlunosDialogController implements Initializable {
	@FXML
	private Label labelId;
	@FXML
	private TextField textFieldNome;
	@FXML
	private TextField textFieldIdade;
	@FXML
	private Button buttonConfirmar;
	@FXML
	private Button buttonCancelar;
	
	
	// servirá para abrir uma outra janela/pop up simultaneamente em nossa aplicação
	private Stage dialogStage;
	private boolean buttonConfirmarClicked = false;
	private Student student;
	
	
	
	
	public Stage getDialogStage() {
		return dialogStage;
	}

	public void setDialogStage(Stage dialogStage) {
		this.dialogStage = dialogStage;
	}

	public boolean isButtonConfirmarClicked() {
		return buttonConfirmarClicked;
	}

	public void setButtonConfirmarClicked(boolean buttonConfirmarClicked) {
		this.buttonConfirmarClicked = buttonConfirmarClicked;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
		
		if (student.getId() != -1)
			this.labelId.setText(String.valueOf(student.getId()));
		
		this.textFieldNome.setText(student.getName());
		
		if (student.getAge() != -1)
			this.textFieldIdade.setText(String.valueOf(student.getAge()));
	}




	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	
	@FXML
	public void handleButtonConfirmar() {
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		this.buttonConfirmarClicked = true;
		
		// TODO: Método de validação dos campos de TextField
		
		this.student.setName(this.textFieldNome.getText());
		this.student.setAge(Integer.parseInt(this.textFieldIdade.getText()));
		
		this.dialogStage.close();
	}
	
	
	@FXML
	public void handleButtonCancelar() {
		this.buttonConfirmarClicked = false;
		this.dialogStage.close();
	}

}






