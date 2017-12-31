package br.com.ninjadevs.program;

import java.io.File;
import java.io.IOException;

import br.com.ninjadevs.controllers.FileCellController;
import br.com.ninjadevs.controllers.FileExplorerBrowserController;
import br.com.ninjadevs.models.FileContainer;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.GridPane;

public class Cell {
	
	GridPane cell;
	FileCellController fileCellController;
	FileContainer file;
	
	public Cell(File file, CellManager cellManager, FileExplorerBrowserController browserController) {
		
		try { 
		
			this.file = new FileContainer(file);
			
			FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/br/com/ninjadevs/views/FileCell.fxml"));
		
			cell = (GridPane) loader.load();
		
			fileCellController = (FileCellController) loader.getController();
			
			fileCellController.update(file, cellManager, this, browserController);
			
			loader = null;
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}	
	}
	
	public final GridPane getCell() {
		return cell;
	}
	
	public FileContainer getFile(){
		
		return this.file;
	}
}
