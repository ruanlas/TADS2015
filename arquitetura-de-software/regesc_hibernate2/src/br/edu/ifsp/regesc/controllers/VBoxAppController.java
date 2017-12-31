package br.edu.ifsp.regesc.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;


public class VBoxAppController implements Initializable {
	@FXML
	private Menu menuCadastros;
	@FXML
	private MenuItem menuItemCadastrosAlunos;
	@FXML
	private MenuItem menuItemCadastrosCursos;
	@FXML
	private Menu menuAjuda;
	@FXML
	private MenuItem menuItemAjudaSobre;
	@FXML
	private AnchorPane anchorPane;
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	
	@FXML
	public void handleMenuCadastroAlunos() throws IOException {
		System.out.println("*****************************");
		AnchorPane ap = (AnchorPane) FXMLLoader.load(getClass().getResource("/br/edu/ifsp/regesc/views/AnchorPaneAlunos.fxml"));
		this.anchorPane.getChildren().setAll(ap);
	}

}





