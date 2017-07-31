package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import dao.UsuarioDAO;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import models.Usuario;
import others.Criptografar;
import others.MessageAlerts;

public class AlterarSenhaController implements Initializable{

	@FXML
	private Label lblEmailUsuario;
	@FXML
	private TextField txtNewSenha;
	@FXML
	private TextField txtConfirNewSenha;
	
	private Usuario usuario;
	private Stage dialogStage;
	private UsuarioDAO usuarioDAO;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		usuarioDAO = new UsuarioDAO();
		
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
		this.lblEmailUsuario.setText(usuario.getEmail());
	}
	public void setDialogStage(Stage stage) {
		this.dialogStage = stage;
	}
	private void alterarSenha() {
		String newSenha = Criptografar.codificar(txtNewSenha.getText());
		String confirmNewSenha = Criptografar.codificar(txtConfirNewSenha.getText());
		
		if(txtConfirNewSenha.getText().isEmpty() || txtNewSenha.getText().isEmpty()){
			MessageAlerts.camposVaziosCadastroUsuarios();
			this.limparCampos();
			
		}else if (!newSenha.equals(confirmNewSenha)) {
			MessageAlerts.confirmacaoDeSenhasIguais();
			this.limparCampos();
		}
		else {
			usuario.setSenha(newSenha);
			usuarioDAO.update(usuario);
			MessageAlerts.confirmacaoDeAlteracaoSenhas();
			this.fechar();
		}
	}
	
	private void limparCampos() {
		this.txtConfirNewSenha.clear();
		this.txtNewSenha.clear();
	}
	@FXML
	private void btnConfirmar() {
		this.alterarSenha();
	}
	@FXML
	private void btnCancelar() {
		this.fechar();
	}
	private void fechar() {
		this.dialogStage.close();
	}

}
