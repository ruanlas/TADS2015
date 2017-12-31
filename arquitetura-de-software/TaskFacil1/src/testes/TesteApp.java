package testes;

import dao.TarefaDAO;
import dao.UsuarioDAO;
import models.Tarefa;

public class TesteApp {
	public static void main(String[] args) {

		TarefaDAO da = new TarefaDAO();
		UsuarioDAO dao = new UsuarioDAO();
		System.out.println(dao.all());
//		System.out.println(da.all());
		for (Tarefa t : da.all()) {
			System.out.println(t.getDescricao());
			System.out.println(t.getLocal());
			System.out.println(t.getTitulo());
			System.out.println();
		}
	}
}
