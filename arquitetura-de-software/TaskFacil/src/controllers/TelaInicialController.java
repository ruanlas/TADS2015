package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import app.App;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import models.Tarefa;
import models.Usuario;

public class TelaInicialController implements Initializable{

	@FXML
	private Label lblUsuario;
	@FXML
	private AnchorPane anchorPane;
	@FXML
	private Button btnVoltar;
	private Usuario usuario;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
		this.lblUsuario.setText(usuario.getEmail());
	}
	
	@FXML
	private void btnConsultarTarefas() throws IOException {
//		System.out.println(usuario);
		this.consultarTarefa();
	}
	
	private void consultarTarefa() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ConsultarTarefasController.class.getResource("/views/ConsultarTarefas.fxml"));

		AnchorPane page = loader.load();
		Stage diaogStage = new Stage();
		diaogStage.setTitle("Consultar Tarefas");
		Scene scene = new Scene(page);
		diaogStage.setScene(scene);
		
		ConsultarTarefasController controller = loader.getController();
		controller.setUsuario(usuario);
		controller.setDialogStage(diaogStage);
		

		diaogStage.showAndWait();
	}
	
	private void abrirNovaTarefa() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(TarefaController.class.getResource("/views/EscreverTarefas.fxml"));

		AnchorPane page = loader.load();
		Stage diaogStage = new Stage();
		diaogStage.setTitle("Consultar Tarefas");
		Scene scene = new Scene(page);
		diaogStage.setScene(scene);
		
		TarefaController controller = loader.getController();
		controller.setUsuario(usuario);
		controller.setTarefa(new Tarefa(), false);
		controller.setDialogStage(diaogStage);
		

		diaogStage.showAndWait();
	}
	@FXML
	private void btnNovaTarefa() throws IOException {
		this.abrirNovaTarefa();
	}
	
	@FXML
	public void btnAlterarSenha() throws IOException {
		this.alterarSenha();
	}
	
	@FXML
	public void btnLogout() throws IOException {
//		this.logout2();
//		System.exit(0);
		this.logout();
		
	}
	private void alterarSenha() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(AlterarSenhaController.class.getResource("/views/AlterarSenha.fxml"));

		AnchorPane page = loader.load();
		Stage diaogStage = new Stage();
		diaogStage.setTitle("Alterar Senha");
		Scene scene = new Scene(page);
		diaogStage.setScene(scene);
		
		AlterarSenhaController controller = loader.getController();
		controller.setUsuario(usuario);
		controller.setDialogStage(diaogStage);
		

		diaogStage.showAndWait();
	}
	
	private void logout() throws IOException {
		//Não funcionou
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(LoginController.class.getResource("/views/VBoxLogin.fxml"));
		AnchorPane page = loader.load();
		LoginController controller = loader.getController();
//		this.anchorPane.getChildrenUnmodifiable().setAll(page);
		this.anchorPane.getChildren().setAll(page);
//		Stage primaryStage = new Stage();
//		Parent root = FXMLLoader.load(getClass().getResource("/views/VBoxLogin.fxml"));
//		
//		Scene scene = new Scene(root);
//		primaryStage.setScene(scene);
//		primaryStage.setTitle("TaskFacil");
//		primaryStage.show();
		
//		this.anchorPane.getChildren().clear();
//		AnchorPane ap = (AnchorPane)FXMLLoader.load(LoginController.class.getResource("/views/VBoxLogin.fxml"));
////		this.anchorPane.clearConstraints(ap);
//		this.anchorPane.getChildren().setAll(ap);
	}
	private void logout2() throws IOException {
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/views/VBoxLogin.fxml"));
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("TaskFacil");
		primaryStage.show();

	}
	private void logout3() throws IOException {
		AnchorPane ap = (AnchorPane)FXMLLoader.load(LoginController.class.getResource("/views/VBoxLogin.fxml"));

		this.anchorPane.getChildren().setAll(ap);
	}

}
