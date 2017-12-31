package br.com.ninjadevs.controllers;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import br.com.ninjadevs.models.Metadata;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class AboutFileController implements Initializable {

	@FXML
	Label LabelName;
	
	@FXML
	Label LabelType;
	
	@FXML
	Label LabelLocal;
	
	@FXML
	Label LabelSize;
	
	@FXML
	Label LabelModified;
	
	@FXML
	Label LabelVisibility;
	
	@FXML
	Label LabelPermission;

	Metadata metadata;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}
	
	public void setMetadata(File file){
		
		this.metadata = new Metadata(file);
	}
	
	public void updateValues(){
		
		this.LabelName.setText(metadata.getName());
		this.LabelType.setText(metadata.getType());
		this.LabelLocal.setText(metadata.getLocal());
		this.LabelSize.setText(metadata.getConvertedSize());
		this.LabelModified.setText(metadata.getLastModifiedFormated());
		this.LabelVisibility.setText(metadata.getVisibility());
		this.LabelPermission.setText(metadata.getPermissions());
	}
}