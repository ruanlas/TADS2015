package br.com.ninjadevs.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class AboutController implements Initializable {

	@FXML
	ImageView AboutImageView;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		Image image = new Image(getClass().getResourceAsStream("/br/com/ninjadevs/res/logo.png"));
		
		AboutImageView.setImage(image);
	}
}
