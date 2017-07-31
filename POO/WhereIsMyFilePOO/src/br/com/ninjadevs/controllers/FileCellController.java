package br.com.ninjadevs.controllers;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import br.com.ninjadevs.controllers.listener.FileCellEventHandler;
import br.com.ninjadevs.program.Cell;
import br.com.ninjadevs.program.CellManager;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class FileCellController implements Initializable {
	
	@FXML
	ImageView ImageViewIcon;
	
	@FXML
	Label LabelFileName;
	
	@FXML
	public GridPane GridPaneCell;
	
	@FXML
	Label LabelType;
	
	@FXML
	Label LabelParent;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	public void update(File file, CellManager cellManager, Cell cell, FileExplorerBrowserController browserController){
		
		GridPaneCell.setOnMouseClicked(new FileCellEventHandler(GridPaneCell, cellManager, cell, browserController));
		
		this.LabelParent.setText(file.getParent());
		
		if (file.isDirectory()){
			
			this.LabelType.setText("DIR");
			this.ImageViewIcon.setImage(new Image(this.getClass().getResourceAsStream("/br/com/ninjadevs/res/folder.png")));

		} else if (file.isFile()){
			
			this.LabelType.setText("FILE");
			this.ImageViewIcon.setImage(new Image(this.getClass().getResourceAsStream("/br/com/ninjadevs/res/file.png")));
		}
		
		this.LabelFileName.setText(file.getName());
	}
}
