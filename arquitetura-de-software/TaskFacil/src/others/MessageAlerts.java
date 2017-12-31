package others;

import javafx.scene.control.Alert;

public class MessageAlerts {
	public static void campoEmBrancoTarefa() {
		Alert campoBranco = new Alert(Alert.AlertType.WARNING);
		campoBranco.setTitle("Atenção");
		campoBranco.setHeaderText("Campos em Branco!");
		campoBranco.setContentText("Os campos 'Título' e 'Data de Realização' não podem ficar em branco");
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
		campoVazio.setTitle("Atenção");
		campoVazio.setHeaderText("Campos vazios!");
		campoVazio.setContentText("Não devem existir campos vazios");
		campoVazio.showAndWait();
	}
	public static void confirmacaoDeSenhasIguais() {
		Alert senhaDiferente = new Alert(Alert.AlertType.WARNING);
		senhaDiferente.setTitle("Atenção");
		senhaDiferente.setHeaderText("Senha diferentes!");
		senhaDiferente.setContentText("As senhas digitadas devem ser iguais");
		senhaDiferente.showAndWait();
	}
	public static void confirmacaoDeAlteracaoSenhas() {
		Alert confirmacao = new Alert(Alert.AlertType.INFORMATION);
		confirmacao.setTitle("Confirmação");
		confirmacao.setHeaderText("Senha alterada com sucesso");
		confirmacao.showAndWait();
	}
	public static void falhaLogin() {
		Alert falhaLogon = new Alert(Alert.AlertType.WARNING);
		falhaLogon.setTitle("Atenção");
		falhaLogon.setHeaderText("Usuário não encontrado!");
		falhaLogon.setContentText("Digite um usuário válido");
		falhaLogon.showAndWait();
	}
	public static void emailInvalido() {
		Alert emailInválido = new Alert(Alert.AlertType.WARNING);
		emailInválido.setTitle("Atenção");
		emailInválido.setHeaderText("Email inválido!");
		emailInválido.setContentText("Por favor, insira um email válido");
		emailInválido.showAndWait();
	}
	public static void confirmarSelecaoTarefaTabela() {
		Alert confircacaoSelecao = new Alert(Alert.AlertType.WARNING);
		confircacaoSelecao.setTitle("Atenção");
		confircacaoSelecao.setHeaderText("Nenhuma tarefa selecionada!");
		confircacaoSelecao.setContentText("Por favor, selecione uma tarefa na tabela");
		confircacaoSelecao.showAndWait();
	}
	public static void confirmarSelecaoUsuarioTabela() {
		Alert confircacaoSelecao = new Alert(Alert.AlertType.WARNING);
		confircacaoSelecao.setTitle("Atenção");
		confircacaoSelecao.setHeaderText("Nenhum usuario selecionado!");
		confircacaoSelecao.setContentText("Por favor, selecione um usuario na tabela");
		confircacaoSelecao.showAndWait();
	}
	public static void colaboradorJaInserido() {
		Alert colaboradorInserido = new Alert(Alert.AlertType.WARNING);
		colaboradorInserido.setTitle("Atenção");
		colaboradorInserido.setHeaderText("O usuário existente");
		colaboradorInserido.setContentText("O usuário selecionado já é um colaborador da tarefa!");
		colaboradorInserido.showAndWait();
	}
}
