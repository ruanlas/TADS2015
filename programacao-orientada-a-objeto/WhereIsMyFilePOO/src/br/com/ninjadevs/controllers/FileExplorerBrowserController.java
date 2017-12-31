package br.com.ninjadevs.controllers;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import br.com.ninjadevs.controllers.listener.ListenerTableViewFavorite;
import br.com.ninjadevs.favorites.FavoriteProperty;
import br.com.ninjadevs.favorites.serialize.Favorite;
import br.com.ninjadevs.favorites.serialize.SerializeFavorite;
import br.com.ninjadevs.models.FileContainer;
import br.com.ninjadevs.program.Cell;
import br.com.ninjadevs.program.CellManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

public class FileExplorerBrowserController implements Initializable {

	CellManager manager;
	FileContainer fileContainer;

	SerializeFavorite favorite;
	ObservableList<FavoriteProperty> ol;

	@FXML
	TableColumn<FavoriteProperty, String> TableColumnFavorite;

	@FXML
	public TableView<FavoriteProperty> TableViewFavorite;

	@FXML
	TextField TextFieldLocal;

	@FXML
	VBox VBoxFiles;

	@FXML
	VBox VBoxSearchContainer;

	@FXML
	Button ButtonOpenSearch;

	@FXML
	ImageView ImageViewButton;

	@FXML
	ScrollPane ScrollPaneFiles;

	VBox searchBar;
	
	public ArrayList<File> results;

	public FileExplorerBrowserController() {

		favorite = new SerializeFavorite();
		ol = FXCollections.observableArrayList();

		manager = new CellManager(this);

		for (Favorite f : favorite.favoriteList.favorites) {

			ol.add(new FavoriteProperty(f));

		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		TableColumnFavorite.setCellValueFactory(callData -> callData.getValue().getName());
		TableViewFavorite.setItems(ol);

		TableViewFavorite.getSelectionModel().selectedItemProperty().addListener(new ListenerTableViewFavorite(this));

		TableViewFavorite.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {

				TableViewFavorite.getSelectionModel().clearSelection();

			}

		});

		Image image = new Image(getClass().getResourceAsStream("/br/com/ninjadevs/res/search.png"));
		ImageViewButton.setImage(image);

		ImageViewButton.resize(ButtonOpenSearch.getWidth(), ButtonOpenSearch.getHeight());

		fileContainer = new FileContainer();
		updateListFilesLoad();
	}

	public void searchBarVisibility() {

		if (VBoxSearchContainer.getChildren().contains(searchBar)) {

			VBoxSearchContainer.getChildren().remove(searchBar);

		} else {

			VBoxSearchContainer.getChildren().add(searchBar);
		}
	}
	
	public void addCellFromResult(int i){
		
		Cell cell = new Cell(results.get(i), manager, this);

		VBoxFiles.getChildren().add(cell.getCell());
		
	}
	
	public void addCellFromResult(ArrayList<File> results){
		
		clearListFiles();
		
		for (File file : results) {

			Cell cell = new Cell(file, manager, this);

			VBoxFiles.getChildren().add(cell.getCell());
		}
		
	}

	public void updateListFiles(FileContainer nextfolder) {

		clearListFiles();

		this.fileContainer = nextfolder;

		this.updateListFilesLoad();
	}

	public void updateListFiles() {

		clearListFiles();

		this.updateListFilesLoad();
	}

	private void updateListFilesLoad() {

		try {

			this.TextFieldLocal.setText(fileContainer.getCanonicalPath());

		} catch (IOException e) {

			e.printStackTrace();
		}
		
		FileOrganizer.sortByNameAscending(fileContainer.getDirectories());
		FileOrganizer.sortByNameAscending(fileContainer.getFiles());

		for (File file : fileContainer.getDirectories()) {

			Cell cell = new Cell(file, manager, this);

			VBoxFiles.getChildren().add(cell.getCell());
		}

		for (File file : fileContainer.getFiles()) {

			Cell cell = new Cell(file, manager, this);

			VBoxFiles.getChildren().add(cell.getCell());
		}

		ScrollPaneFiles.setVvalue(0);
	}
	
	public void clearListFiles(){
		
		VBoxFiles.getChildren().clear();
	}

	public void setSearchBar(VBox vBox) {

		this.searchBar = vBox;
	}

	public void setFileContainer(FileContainer fileContainer) {

		this.fileContainer = fileContainer;

	}

	public FileContainer getFile() {

		return this.fileContainer;
	}
}