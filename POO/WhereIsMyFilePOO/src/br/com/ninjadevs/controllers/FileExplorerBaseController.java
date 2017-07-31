package br.com.ninjadevs.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class FileExplorerBaseController implements Initializable {

	@FXML
	MenuItem MenuItemAbout;
	@FXML
	MenuItem MenuItemName;
	@FXML
	MenuItem MenuItemDate;
	@FXML
	MenuItem MenuItemSize;
	@FXML
	MenuItem MenuItemNameA;
	@FXML
	MenuItem MenuItemDateA;
	@FXML
	MenuItem MenuItemSizeA;
	
	FileExplorerBrowserController browserController;
	
	public void updateBrowserController(FileExplorerBrowserController browserController){
		this.browserController = browserController;
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	@FXML
	private void onClickMenuItemName(){
		
		FileOrganizer.sortByNameAscending(browserController.results);
		browserController.addCellFromResult(browserController.results);
		
	}
	
	@FXML
	private void onClickMenuItemDate(){
		
		FileOrganizer.sortByDateAscending(browserController.results);
		browserController.addCellFromResult(browserController.results);
	}
	
	@FXML
	private void onClickMenuItemSize(){
		
		FileOrganizer.sortByAscendingSize(browserController.results);
		browserController.addCellFromResult(browserController.results);
	}
	
	@FXML
	private void onClickMenuItemNameA(){
		
		FileOrganizer.sortByNameDescending(browserController.results);
		browserController.addCellFromResult(browserController.results);
		
	}
	
	@FXML
	private void onClickMenuItemDateA(){
		
		FileOrganizer.sortByDateDescending(browserController.results);
		browserController.addCellFromResult(browserController.results);
	}
	
	@FXML
	private void onClickMenuItemSizeA(){
		
		FileOrganizer.sortByDescendingSize(browserController.results);
		browserController.addCellFromResult(browserController.results);
	}
	
	@FXML
	private void onClickMenuItemAbout(){
		
		try{
			
			FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/br/com/ninjadevs/views/About.fxml"));
			AnchorPane pane = (AnchorPane) loader.load();
			
			Scene scene = new Scene(pane);
			
			Stage stage = new Stage();
			stage.setTitle("About");
			stage.setScene(scene);
			stage.show();
		
		} catch (IOException e){
			
			e.printStackTrace();
			
		}
	}
}
