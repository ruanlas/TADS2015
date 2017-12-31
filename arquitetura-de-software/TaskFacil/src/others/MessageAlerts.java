package others;

import javafx.scene.control.Alert;

public class MessageAlerts {
	public static void campoEmBrancoTarefa() {
		Alert campoBranco = new Alert(Alert.AlertType.WARNING);
		campoBranco.setTitle("Aten��o");
		campoBranco.setHeaderText("Campos em Branco!");
		campoBranco.setContentText("Os campos 'T�tulo' e 'Data de Realiza��o' n�o podem ficar em branco");
		campoBranco.showAndWait();
	}
	public static void tarefaArmazenada() {
		Alert tarefaArmazenada = new Alert(Alert.AlertType.INFORMATION);
		tarefaArmazenada.setTitle("Tarefa Cadastrada");
		tarefaArmazenada.setHeaderText("A tarefa foi armazenada com sucesso!");
		tarefaArmazenada.showAndWait();
	}
	public static void exclusaoTarefa() {
		Alert esclusaoTarefa = new Alert(Alert.AlertType.INFORMATION);
		esclusaoTarefa.setTitle("Exclusao de Tarefa");
		esclusaoTarefa.setHeaderText("A tarefa foi excluida com sucesso!");
		esclusaoTarefa.showAndWait();
	}
	public static void camposVaziosCadastroUsuarios() {
		Alert campoVazio = new Alert(Alert.AlertType.WARNING);
		campoVazio.setTitle("Aten��o");
		campoVazio.setHeaderText("Campos vazios!");
		campoVazio.setContentText("N�o devem existir campos vazios");
		campoVazio.showAndWait();
	}
	public static void confirmacaoDeSenhasIguais() {
		Alert senhaDiferente = new Alert(Alert.AlertType.WARNING);
		senhaDiferente.setTitle("Aten��o");
		senhaDiferente.setHeaderText("Senha diferentes!");
		senhaDiferente.setContentText("As senhas digitadas devem ser iguais");
		senhaDiferente.showAndWait();
	}
	public static void confirmacaoDeAlteracaoSenhas() {
		Alert confirmacao = new Alert(Alert.AlertType.INFORMATION);
		confirmacao.setTitle("Confirma��o");
		confirmacao.setHeaderText("Senha alterada com sucesso");
		confirmacao.showAndWait();
	}
	public static void falhaLogin() {
		Alert falhaLogon = new Alert(Alert.AlertType.WARNING);
		falhaLogon.setTitle("Aten��o");
		falhaLogon.setHeaderText("Usu�rio n�o encontrado!");
		falhaLogon.setContentText("Digite um usu�rio v�lido");
		falhaLogon.showAndWait();
	}
	public static void emailInvalido() {
		Alert emailInv�lido = new Alert(Alert.AlertType.WARNING);
		emailInv�lido.setTitle("Aten��o");
		emailInv�lido.setHeaderText("Email inv�lido!");
		emailInv�lido.setContentText("Por favor, insira um email v�lido");
		emailInv�lido.showAndWait();
	}
	public static void confirmarSelecaoTarefaTabela() {
		Alert confircacaoSelecao = new Alert(Alert.AlertType.WARNING);
		confircacaoSelecao.setTitle("Aten��o");
		confircacaoSelecao.setHeaderText("Nenhuma tarefa selecionada!");
		confircacaoSelecao.setContentText("Por favor, selecione uma tarefa na tabela");
		confircacaoSelecao.showAndWait();
	}
	public static void confirmarSelecaoUsuarioTabela() {
		Alert confircacaoSelecao = new Alert(Alert.AlertType.WARNING);
		confircacaoSelecao.setTitle("Aten��o");
		confircacaoSelecao.setHeaderText("Nenhum usuario selecionado!");
		confircacaoSelecao.setContentText("Por favor, selecione um usuario na tabela");
		confircacaoSelecao.showAndWait();
	}
	public static void colaboradorJaInserido() {
		Alert colaboradorInserido = new Alert(Alert.AlertType.WARNING);
		colaboradorInserido.setTitle("Aten��o");
		colaboradorInserido.setHeaderText("O usu�rio existente");
		colaboradorInserido.setContentText("O usu�rio selecionado j� � um colaborador da tarefa!");
		colaboradorInserido.showAndWait();
	}
}
