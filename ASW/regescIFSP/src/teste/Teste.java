package teste;

import java.sql.Date;

import dao.AlunoDAO;
import modelos.Aluno;

public class Teste {
	public static void main(String[] args) {
		Date dataNascimento = new Date(2000);
		Aluno aluno = new Aluno("Ruan Silva", "388.707.038-30", dataNascimento, "43.008.458-4", "150051-1");
		
		AlunoDAO alunoDAO = new AlunoDAO();
		
		for (Aluno al : alunoDAO.selectAluno()) {
			System.out.println(al.getNome());
		}
		
		
	}
}
