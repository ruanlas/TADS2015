package sistema.controlers;

import java.net.URL;
import java.util.ResourceBundle;



import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sistema.models.Pessoa;

public class AnchorPaneTelaCadastroControler implements Initializable{
	@FXML
	private TextField txtFieldNome;
	@FXML
	private TextField txtFieldRg;
	@FXML
	private TextField txtFieldCpf;

	
	private boolean btnGravarChecked = false;
	private Pessoa pessoa;
	private Stage dialogStage;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	public void setDialogStage(Stage dialogStage) {
		this.dialogStage = dialogStage;
	}
	
	public Stage getDialogStage() {
		return this.dialogStage;
	}
	
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public boolean isBtnGravarChecked() {
		return this.btnGravarChecked;
	}
	
	@FXML
	public void btnGravar() {
		String nome = txtFieldNome.getText();
		long cpf = Long.parseLong(txtFieldCpf.getText());
		long rg = Long.parseLong(txtFieldRg.getText());
		//Falta tratar a exceção de formato de numero para armazenar no banco
		pessoa.setCpf(cpf);
		pessoa.setNome(nome);
		pessoa.setRg(rg);
		
		btnGravarChecked = true;
		dialogStage.close();
	}

}
