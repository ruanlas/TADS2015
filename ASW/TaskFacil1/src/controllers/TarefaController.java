package controllers;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.Date;
import java.util.ResourceBundle;

import dao.TarefaDAO;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import models.Tarefa;
import models.Usuario;
import others.MessageAlerts;

public class TarefaController implements Initializable{
	
	@FXML
	private Label lblProprietario;
	@FXML
	private TextField txtTitulo;
	@FXML
	private TextField txtLocal;
	@FXML
	private DatePicker dataRealizacao;
	@FXML
	private TextArea txtDescricao;
	
	private Usuario usuario;
	private Stage dialogStage;
	private Tarefa tarefa;
	private TarefaDAO tarefaDAO;
	private boolean editar = false;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		tarefaDAO = new TarefaDAO();
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
		this.lblProprietario.setText(this.usuario.getEmail());
	}
	public void setTarefa(Tarefa tarefa, boolean editar) {
		this.tarefa = tarefa;
		this.editar = editar;
		this.preencherCampos();
	}
	private void preencherCampos() {
		this.txtDescricao.setText(tarefa.getDescricao());
		this.txtLocal.setText(tarefa.getLocal());
		this.txtTitulo.setText(tarefa.getTitulo());
		this.dataRealizacao.setValue(tarefa.getDataRealizacao());
	}
	public void setDialogStage(Stage stage) {
		this.dialogStage = stage;
	}
	
	@FXML
	private void btnAddColaborador() throws IOException {
		if (this.cadastrarTarefa()) {
			this.addColaborador();
		}
	}
	
	private void addColaborador() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(AddColaboradorController.class.getResource("/views/AddColaborador.fxml"));

		AnchorPane page = loader.load();
		Stage diaogStage = new Stage();
		diaogStage.setTitle("Consultar Tarefas");
		Scene scene = new Scene(page);
		diaogStage.setScene(scene);
		
		AddColaboradorController controller = loader.getController();
		controller.setTarefa(tarefa);
		controller.setDialogStage(diaogStage);
		

		diaogStage.showAndWait();
	}
	@FXML
	private void btnCadastrar() {
		if(this.cadastrarTarefa()){
			this.fechar();
		}
	}
	private boolean cadastrarTarefa() {
		String titulo = txtTitulo.getText();
		String local = txtLocal.getText();
		String descricao = txtDescricao.getText();
		LocalDate dtRealizacao = dataRealizacao.getValue();
		if ((txtTitulo.getText() == null && dataRealizacao.getValue() == null) || 
				(txtTitulo.getText() == null || dataRealizacao.getValue() == null)) {
			MessageAlerts.campoEmBrancoTarefa();
			return false;
		} else {
			
			this.tarefa.setDataRealizacao(dtRealizacao);
			this.tarefa.setLocal(local);
			this.tarefa.setDescricao(descricao);
			this.tarefa.setTitulo(titulo);
			if (editar) {
				tarefaDAO.update(tarefa);
			}else {
				this.tarefa.setDono(usuario);
				tarefaDAO.insert(tarefa);
			}
			MessageAlerts.tarefaArmazenada();
			return true;
		}
	}
	@FXML
	private void btnCancelar() {
		this.fechar();
	}
	private void fechar() {
		this.dialogStage.close();
	}
	
}
