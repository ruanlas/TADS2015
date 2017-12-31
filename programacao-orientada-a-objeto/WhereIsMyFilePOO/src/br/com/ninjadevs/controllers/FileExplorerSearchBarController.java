package br.com.ninjadevs.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import br.com.ninjadevs.runnables.SearchThread;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class FileExplorerSearchBarController implements Initializable {

	@FXML
	private CheckBox CheckBoxDate;

	@FXML
	private DatePicker DatePickerDate;

	@FXML
	private CheckBox CheckBoxType;

	@FXML
	private TextField TextFieldType;

	@FXML
	private CheckBox CheckBoxName;

	@FXML
	private TextField TextFieldName;

	@FXML
	private CheckBox CheckBoxCaseSensitive;
	
	@FXML
	private CheckBox CheckBoxEnd;
	
	@FXML
	private DatePicker DatePickerDateEnd;

	@FXML
	private Button ButtonSearch;

	public FileExplorerBrowserController browserController;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		ButtonSearch.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				
				browserController.results = new ArrayList<>();
				
				browserController.clearListFiles();

				Thread search = new Thread(new SearchThread(CheckBoxDate.isSelected(), DatePickerDate.getValue(),
						CheckBoxEnd.isSelected(), DatePickerDateEnd.getValue(),
						CheckBoxType.isSelected(), TextFieldType.getText(), CheckBoxName.isSelected(),
						TextFieldName.getText(), CheckBoxCaseSensitive.isSelected(), browserController));

				search.start();
				
//				while(search.isAlive()){
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//				
//				browserController.addCellFromResult(browserController.results);
				
				int i = -1;

				while (search.isAlive()) {

					while ((browserController.results.size() - 1) > i) {
						
						i++;

						browserController.addCellFromResult(i);
						
						try {
							System.out.println(browserController.results.get(i).getCanonicalPath());
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				
				//Platform.runLater(new Thread(new CellThread(search, browserController)));
			}
		});

		CheckBoxName.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				CheckBoxType.setSelected(false);
				CheckBoxDate.setSelected(false);
				CheckBoxEnd.setSelected(false);
			}
		});

		CheckBoxType.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				CheckBoxName.setSelected(false);
				CheckBoxDate.setSelected(false);
				CheckBoxCaseSensitive.setSelected(false);
				CheckBoxEnd.setSelected(false);

			}
		});

		CheckBoxDate.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				CheckBoxType.setSelected(false);
				CheckBoxName.setSelected(false);
				CheckBoxCaseSensitive.setSelected(false);
			}
		});

	}

	public void setBrowserController(FileExplorerBrowserController browserController) {

		this.browserController = browserController;
	}
}
