package br.edu.ifsp.regesc.controllers;

import java.io.IOException;
import java.lang.Thread.State;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;

//Para a classe ser um controler, é necessário implementar a interface Initializable
public class VBoaxAppController implements Initializable{
	//É preciso que todos os botões e variáveis sejam do mesmo tipo da tela
	//e que tenham o mesmo nome dado na interface
	@FXML
	private Menu menuCadastros;
	@FXML
	private MenuItem menuItemALunos;
	@FXML
	private MenuItem menuItemCursos;
	@FXML
	private Menu menuHelp;
	@FXML
	private MenuItem menuHelpAbout;
	@FXML
	private AnchorPane anchorPane;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
	}
	//Sempre quando um método ou objeto irá "interagir" com uma interface
	//é necessário utilizar a notação @FXML
	@FXML 
	public void handleMenuCadastrosAlunos() throws IOException {
		//Este método que irá chamar a outra tela, então, deve-se colocar o nome deste método
		//na ação do botão que irá chamar a outra tela
		System.out.println("aaaaaaaaaaaaaaaaa");
		AnchorPane ap = (AnchorPane)FXMLLoader.load(getClass().getResource("/br/edu/ifsp/regesc/views/AnchorPaneAlunos.fxml"));
		this.anchorPane.getChildren().setAll(ap);
	}

}
