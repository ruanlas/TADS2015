package messages;

import java.util.Optional;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class MessageAlerts {
	private static Alert alert;
	
	public static void valorInvalido() {
		alert = new Alert(Alert.AlertType.WARNING);
		alert.setTitle("Valor Inv�lido!");
		alert.setHeaderText("O valor informado � inv�lido!");
		alert.setContentText("Por favor, insira um valor v�lido para continuar.");
		alert.showAndWait();
	}
	public static void descricaoNula() {
		alert = new Alert(Alert.AlertType.WARNING);
		alert.setTitle("Descri��o Nula!");
		alert.setHeaderText("O campo Descri��o est� vazio!");
		alert.setContentText("Por favor, insira uma descri��o para continuar.");
		alert.showAndWait();
	}
	public static void dataInvalida() {
		alert = new Alert(Alert.AlertType.WARNING);
		alert.setTitle("Data Inv�lida!");
		alert.setHeaderText("O valor do campo Data � inv�lido!");
		alert.setContentText("Por favor, insira uma data v�lida para continuar.");
		alert.showAndWait();
	}
	public static void operacaoNaoSelecionada() {
		alert = new Alert(Alert.AlertType.WARNING);
		alert.setTitle("Opera��o n�o selecionada!");
		alert.setHeaderText("N�o foi selecionado nenhum tipo de opera��o!");
		alert.setContentText("Por favor, escolha um tipo de opera��o para continuar.");
		alert.showAndWait();
	}
	public static ButtonType sairECancelar() {
		alert = new Alert(Alert.AlertType.CONFIRMATION);
		alert.setTitle("Calcelar a opera��o");
		alert.setHeaderText("Voc� deseja voltar e cancelar a opera��o?");
		return alert.showAndWait().get();
	}
	public static ButtonType sairDoSistema() {
		alert = new Alert(Alert.AlertType.CONFIRMATION);
		alert.setTitle("Sair do sistema");
		alert.setHeaderText("Voc� deseja sair do sistema e encerrar as atividades?");
		return alert.showAndWait().get();
	}
}
