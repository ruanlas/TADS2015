package messages;

import java.util.Optional;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class MessageAlerts {
	private static Alert alert;
	
	public static void valorInvalido() {
		alert = new Alert(Alert.AlertType.WARNING);
		alert.setTitle("Valor Inválido!");
		alert.setHeaderText("O valor informado é inválido!");
		alert.setContentText("Por favor, insira um valor válido para continuar.");
		alert.showAndWait();
	}
	public static void descricaoNula() {
		alert = new Alert(Alert.AlertType.WARNING);
		alert.setTitle("Descrição Nula!");
		alert.setHeaderText("O campo Descrição está vazio!");
		alert.setContentText("Por favor, insira uma descrição para continuar.");
		alert.showAndWait();
	}
	public static void dataInvalida() {
		alert = new Alert(Alert.AlertType.WARNING);
		alert.setTitle("Data Inválida!");
		alert.setHeaderText("O valor do campo Data é inválido!");
		alert.setContentText("Por favor, insira uma data válida para continuar.");
		alert.showAndWait();
	}
	public static void operacaoNaoSelecionada() {
		alert = new Alert(Alert.AlertType.WARNING);
		alert.setTitle("Operação não selecionada!");
		alert.setHeaderText("Não foi selecionado nenhum tipo de operação!");
		alert.setContentText("Por favor, escolha um tipo de operação para continuar.");
		alert.showAndWait();
	}
	public static ButtonType sairECancelar() {
		alert = new Alert(Alert.AlertType.CONFIRMATION);
		alert.setTitle("Calcelar a operação");
		alert.setHeaderText("Você deseja voltar e cancelar a operação?");
		return alert.showAndWait().get();
	}
	public static ButtonType sairDoSistema() {
		alert = new Alert(Alert.AlertType.CONFIRMATION);
		alert.setTitle("Sair do sistema");
		alert.setHeaderText("Você deseja sair do sistema e encerrar as atividades?");
		return alert.showAndWait().get();
	}
}
