package controllers;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;

import dao.TarefaDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import models.Tarefa;
import models.Usuario;
import others.MessageAlerts;

public class ConsultarTarefasController implements Initializable{

	@FXML
	private TableView<Tarefa> tbViewTarefas;
	@FXML
	private TableColumn<Usuario, LocalDate> tbColumData;
	@FXML
	private TableColumn<Usuario, String> tbColumTitulo;
	@FXML
	private TableColumn<Usuario, String> tbColumLocal;
	
	private ArrayList<Tarefa> listaTarefas;
	private ObservableList<Tarefa> listaObservableTarefas;
	private Stage dialogStage;
	
	private Usuario usuario;
	private TarefaDAO tarefaDAO;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		tarefaDAO = new TarefaDAO();
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
		this.atualizarCampo();
	}
	public void setDialogStage(Stage stage) {
		this.dialogStage = stage;
	}
	public Stage getDialogStage() {
		return this.dialogStage;
	}
	@FXML
	private void btnEditar() throws IOException {
		int i = tbViewTarefas.getSelectionModel().getSelectedIndex();
		if(tbViewTarefas.getSelectionModel().isSelected(i)){
			this.editarTarefa();
		}else {
			MessageAlerts.confirmarSelecaoTarefaTabela();
		}
		
	}
	private void editarTarefa() throws IOException {
		Tarefa tarefa = this.tbViewTarefas.getSelectionModel().getSelectedItem();
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(TarefaController.class.getResource("/views/EscreverTarefas.fxml"));

		AnchorPane page = loader.load();
		Stage diaogStage = new Stage();
		diaogStage.setTitle("Consultar Tarefas");
		Scene scene = new Scene(page);
		diaogStage.setScene(scene);
		
		TarefaController controller = loader.getController();
		controller.setUsuario(usuario);
		controller.setTarefa(tarefa, true);
		controller.setDialogStage(diaogStage);
		

		diaogStage.showAndWait();
	}
	@FXML
	private void btnApagar() {
		int i = tbViewTarefas.getSelectionModel().getSelectedIndex();
		if(tbViewTarefas.getSelectionModel().isSelected(i)){
			this.apagarTarefa();
		}else {
			MessageAlerts.confirmarSelecaoTarefaTabela();
		}
	}
	private void apagarTarefa() {
		Tarefa tarefa = this.tbViewTarefas.getSelectionModel().getSelectedItem();
		tarefaDAO.delete(tarefa);
		MessageAlerts.exclusaoTarefa();
		this.atualizarCampo();
	}
	@FXML
	private void btnFechar() {
		this.fechar();
	}
	private void fechar() {
		this.dialogStage.close();
	}
	private void atualizarCampo() {
		this.listaTarefas = (ArrayList<Tarefa>) this.tarefaDAO.all();
		ArrayList<Tarefa> listaTemp = new ArrayList<>();
		for (Tarefa tarefa : listaTarefas) {
			if(tarefa.getDono().getId() == usuario.getId()){
				listaTemp.add(tarefa);
			}
		}
		this.tbColumData.setCellValueFactory(new PropertyValueFactory<>("dataRealizacao"));
		this.tbColumTitulo.setCellValueFactory(new PropertyValueFactory<>("titulo"));
		this.tbColumLocal.setCellValueFactory(new PropertyValueFactory<>("local"));
		
		this.listaObservableTarefas = FXCollections.observableArrayList(listaTemp);
		this.tbViewTarefas.setItems(this.listaObservableTarefas);
	}
}
