package br.com.ninjadevs.controllers.listener;

import java.io.IOException;

import br.com.ninjadevs.controllers.AboutFileController;
import br.com.ninjadevs.controllers.FileExplorerBrowserController;
import br.com.ninjadevs.program.Cell;
import br.com.ninjadevs.program.CellManager;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FileCellEventHandler implements EventHandler<MouseEvent> {

	GridPane GridPaneCell;
	CellManager cellManager;
	Cell cell;
	FileExplorerBrowserController browserController;
	
	public FileCellEventHandler(GridPane gridPane, CellManager cellManager, Cell cell, FileExplorerBrowserController browserController) {
	
		this.GridPaneCell = gridPane;
		this.cellManager = cellManager;
		this.cell = cell;
		this.browserController = browserController;
	}
	
	@Override
	public void handle(MouseEvent event) {
		
		if(event.getButton() == MouseButton.SECONDARY){
			
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(this.getClass().getResource("/br/com/ninjadevs/views/AboutFile.fxml"));
			
			VBox vBox = null;
			AboutFileController aboutFileController;
			
			try {
				
				vBox = (VBox) loader.load();
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			aboutFileController = (AboutFileController) loader.getController();
			
			aboutFileController.setMetadata(cell.getFile());
			aboutFileController.updateValues();
			
			Scene scene = new Scene(vBox);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
		}
		
		if(event.getButton() == MouseButton.PRIMARY){
			
			if(event.getClickCount() == 2 && cell.getFile().isDirectory()){
				
				browserController.updateListFiles(cell.getFile());
				
			} else if (event.getClickCount() == 1){
				
				cellManager.changeSelection(cell);
			}
		}
	}
}
