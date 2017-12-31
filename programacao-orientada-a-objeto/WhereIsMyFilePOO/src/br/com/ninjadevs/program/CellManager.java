package br.com.ninjadevs.program;

import java.util.List;

import br.com.ninjadevs.controllers.FileExplorerBrowserController;

public class CellManager {
	
	List<Cell> cells;

	FileExplorerBrowserController browserController;
	
	Cell selectedCell;
	
	public CellManager(FileExplorerBrowserController browserController) {
	
		this.browserController = browserController;
		
		selectedCell = null;
	}
	
	public void changeSelection(Cell cell){
		
		if (this.selectedCell == null){
			
			this.selectedCell = cell;
			
			selectedCell.fileCellController.GridPaneCell.setStyle("-fx-background-color: lightgray;");
			
		} else {
			
			selectedCell.fileCellController.GridPaneCell.setStyle("-fx-background-color: white;");

			this.selectedCell = cell;
			
			selectedCell.fileCellController.GridPaneCell.setStyle("-fx-background-color: lightgray;");
		}
	}
}
