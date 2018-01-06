package jogo.pokemongol.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

public class VBoxAppController implements Initializable{

	@FXML
	private AnchorPane anchorPane;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	@FXML
	public void handleConsultarTreinador() {
		System.out.println("Treinador");
	}
	@FXML
	public void handleConsultarPokemon() throws IOException {
		System.out.println("Pokemon");
		AnchorPane ap = (AnchorPane)FXMLLoader.load(getClass().getResource("/jogo/pokemongol/views/APConsultaPokemon.fxml"));
		this.anchorPane.getChildren().setAll(ap);
	}

}
