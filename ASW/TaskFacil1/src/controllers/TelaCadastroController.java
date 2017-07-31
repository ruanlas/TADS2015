package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import dao.UsuarioDAO;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import models.Usuario;
import others.Criptografar;
import others.Email;
import others.MessageAlerts;

public class TelaCadastroController implements Initializable{
	
	@FXML
	private TextField txtEmail;
	@FXML
	private TextField txtPassword;
	@FXML
	private TextField txtConfPassword;
	
	private boolean btnCadastrarChecked = false;
	private Stage dialogStage;
	private UsuarioDAO usuarioDAO;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		usuarioDAO = new UsuarioDAO();
		
	}
	
	public void setDialogStage(Stage stage) {
		this.dialogStage = stage;
	}
	
	public boolean isBtnCadastrarChecked() {
		return this.btnCadastrarChecked;
	}
	@FXML
	private void btnCadastrar() {
		if (!Email.isEmail(txtEmail.getText())) {
			MessageAlerts.emailInvalido();
			this.limparCampos();
		}else if (!txtPassword.getText().equals(txtConfPassword.getText())) {
			MessageAlerts.confirmacaoDeSenhasIguais();
			this.limparCampos();
		}else if (txtPassword.getText().isEmpty() || txtConfPassword.getText().isEmpty()) {
			MessageAlerts.camposVaziosCadastroUsuarios();
			this.limparCampos();
		}
		else {
			String email = txtEmail.getText();
			String senha = Criptografar.codificar(txtPassword.getText());
			this.cadastro(email, senha);
			this.close();
		}
	}
	
	private void limparCampos() {
		txtEmail.clear();
		txtConfPassword.clear();
		txtPassword.clear();
	}
	private void cadastro(String email, String password) {
		Usuario usuario = new Usuario(email,password);
		usuarioDAO.insert(usuario);
	}
	@FXML
	private void btnCancelar() {
		this.close();
	}
	
	private void close() {
		this.dialogStage.close();
	}

}
