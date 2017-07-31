package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import dao.UsuarioDAO;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import models.Usuario;
import others.Criptografar;
import others.MessageAlerts;

public class LoginController implements Initializable{
	
	@FXML
	private AnchorPane anchorPane;
	@FXML
	private TextField txtLogin;
	@FXML
	private PasswordField txtPassword;
	private List<Usuario> usuarios;
	private UsuarioDAO usuarioDAO;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		usuarioDAO = new UsuarioDAO();
//		this.atualizar();
	}
	@FXML
	private void btnLogar() throws IOException{
//		this.atualizar();
		Usuario usuario = this.autenticacao();
		if (usuario != null) {
			this.logar(usuario);
		}else {
			MessageAlerts.falhaLogin();
		}
		this.limpaCampos();
	}
	
	@FXML
	private void linkCadastrarNovo() throws IOException{
		this.telaNovoCadastro();
	}
	private void limpaCampos() {
		txtLogin.clear();
		txtPassword.clear();
	}
	public void atualizar() {
		usuarios = usuarioDAO.all();
	}
	
	private Usuario autenticacao() {
		this.atualizar();
		String email = txtLogin.getText();
		String password = Criptografar.codificar(txtPassword.getText());
		Usuario user = null;
		for (Usuario usuario : usuarios) {
			if(usuario.getEmail().equals(email) && usuario.getSenha().equals(password)){
				user = usuario;
				break;
			}
		}
		
		return user;
	}
	
	private void logar(Usuario usuario) throws IOException{

		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(TelaInicialController.class.getResource("/views/TelaInicial.fxml"));
		AnchorPane page = loader.load();
//		Usuario usuario = new Usuario("ruan@gmail.com", null);
		TelaInicialController controller = loader.getController();
		controller.setUsuario(usuario);
		this.anchorPane.getChildren().setAll(page);

	}
	
	private void telaNovoCadastro() throws IOException{

		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(TelaCadastroController.class.getResource("/views/TelaCadastro.fxml"));

		AnchorPane page = loader.load();
		Stage diaogStage = new Stage();
		diaogStage.setTitle("Cadastro");
		Scene scene = new Scene(page);
		diaogStage.setScene(scene);
		
		TelaCadastroController controller = loader.getController();
		controller.setDialogStage(diaogStage);
		

		diaogStage.showAndWait();
	}
}
