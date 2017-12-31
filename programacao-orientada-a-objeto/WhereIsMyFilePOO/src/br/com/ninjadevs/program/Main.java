package br.com.ninjadevs.program;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import br.com.ninjadevs.controllers.FileExplorerBaseController;
import br.com.ninjadevs.controllers.FileExplorerBrowserController;
import br.com.ninjadevs.controllers.FileExplorerSearchBarController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

	private BorderPane root;
	private Stage primaryStage;
	private FileExplorerBrowserController browserController;
	private FileExplorerSearchBarController barController;
	private FileExplorerBaseController baseController;
	
	ArrayList<File> result = new ArrayList<>();
	
	public static void main(String[] args){
		
		launch(args);
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("FileExplorer - NinjaDevs");
		
		initRoot();
		
		loadBrowser();
	}
	
	public void initRoot(){
		
		try {
			
			primaryStage.getIcons().add(new Image(this.getClass().getResourceAsStream("/br/com/ninjadevs/res/folder.png")));
			
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(this.getClass().getResource("/br/com/ninjadevs/views/FileExplorerBase.fxml"));
			
			root = (BorderPane) loader.load();
			
			baseController = (FileExplorerBaseController) loader.getController();
			
			Scene scene = new Scene(root);
			
			primaryStage.setScene(scene);
			primaryStage.setMinHeight(600);
			primaryStage.setMinWidth(800);
			primaryStage.show();
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public void loadBrowser(){
		
		try {

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(this.getClass().getResource("/br/com/ninjadevs/views/FileExplorerBrowser.fxml"));

			BorderPane pane = (BorderPane) loader.load();
			browserController = (FileExplorerBrowserController) loader.getController();
			
			baseController.updateBrowserController(browserController);
			
			root.setCenter(pane);
			
			this.loadSearchBar(browserController);

		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	
	public void loadSearchBar(FileExplorerBrowserController browserController){
		
		try{
		
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(this.getClass().getResource("/br/com/ninjadevs/views/FileExplorerSearchBar.fxml"));
			VBox hBoxSearch = (VBox) loader.load();
			this.barController = (FileExplorerSearchBarController) loader.getController();
			
			barController.setBrowserController(browserController);
			
			browserController.setSearchBar(hBoxSearch);
			
		} catch (IOException e){
			
			e.printStackTrace();
		}
		
	}
}