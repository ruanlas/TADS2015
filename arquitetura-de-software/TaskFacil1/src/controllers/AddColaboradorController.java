package controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import dao.TarefaDAO;
import dao.UsuarioDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import models.Tarefa;
import models.Usuario;
import others.MessageAlerts;


public class AddColaboradorController implements Initializable{
	
	@FXML
	private TableView<Usuario> tbViewColaborador;
	@FXML
	private TableView<Usuario> tbViewUsuarios;
	@FXML
	private TableColumn<Usuario, Integer> tbColumId;
	@FXML
	private TableColumn<Usuario, Integer> tbColumId2;
	@FXML
	private TableColumn<Usuario, String> tbColumEmail;
	@FXML
	private TableColumn<Usuario, String> tbColumEmail2;
	
	private List<Usuario> listaUsuarios;
	private List<Usuario> listaColaboradores;
	private ObservableList<Usuario> observableListUsuarios;
	private ObservableList<Usuario> observableListColaboradores;
	
	private Stage dialogStage;
	private Tarefa tarefa;
	private UsuarioDAO usuarioDAO;
	private TarefaDAO tarefaDAO;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		usuarioDAO = new UsuarioDAO();
		tarefaDAO = new TarefaDAO();
	}
	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
		this.carregarCampos();
	}
	public void setDialogStage(Stage stage) {
		this.dialogStage = stage;
	}
	@FXML
	private void btnAdd() {
		int i = tbViewUsuarios.getSelectionModel().getSelectedIndex();
		if(tbViewUsuarios.getSelectionModel().isSelected(i)){
			this.addColaboradores();
		}else {
			MessageAlerts.confirmarSelecaoUsuarioTabela();
		}
	}
	private void addColaboradores() {
		Usuario colaborador = this.tbViewUsuarios.getSelectionModel().getSelectedItem();
		tarefa.addColaborador(colaborador);;
		tarefaDAO.update(tarefa);
		this.carregarCampos();
	}
	@FXML
	private void btnCancelar() {
		this.fechar();
	}
	private void fechar() {
		this.dialogStage.close();
	}
	private void carregarCampos() {
		this.listaUsuarios = this.usuarioDAO.all();

		this.tbColumId2.setCellValueFactory(new PropertyValueFactory<>("id"));
		this.tbColumEmail2.setCellValueFactory(new PropertyValueFactory<>("email"));
		

		this.observableListUsuarios = FXCollections.observableArrayList(listaUsuarios);
		this.tbViewUsuarios.setItems(this.observableListUsuarios);
		
		if (!tarefa.getColaboradores().isEmpty()) {
			this.listaColaboradores = tarefa.getColaboradores();
			
			this.tbColumId.setCellValueFactory(new PropertyValueFactory<>("id"));
			this.tbColumEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
			

			this.observableListColaboradores = FXCollections.observableArrayList(listaColaboradores);
			this.tbViewColaborador.setItems(this.observableListColaboradores);
		}
	}
}
