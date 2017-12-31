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

//Para a classe ser um controler, � necess�rio implementar a interface Initializable
public class VBoaxAppController implements Initializable{
	//� preciso que todos os bot�es e vari�veis sejam do mesmo tipo da tela
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
	//Sempre quando um m�todo ou objeto ir� "interagir" com uma interface
	//� necess�rio utilizar a nota��o @FXML
	@FXML 
	public void handleMenuCadastrosAlunos() throws IOException {
		//Este m�todo que ir� chamar a outra tela, ent�o, deve-se colocar o nome deste m�todo
		//na a��o do bot�o que ir� chamar a outra tela
		System.out.println("aaaaaaaaaaaaaaaaa");
		AnchorPane ap = (AnchorPane)FXMLLoader.load(getClass().getResource("/br/edu/ifsp/regesc/views/AnchorPaneAlunos.fxml"));
		this.anchorPane.getChildren().setAll(ap);
	}

}
