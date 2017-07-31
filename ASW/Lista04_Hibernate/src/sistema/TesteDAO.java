package sistema;

public class TesteDAO {
	public static void main(String[] args) {
		UniversidadeDAO dao = new UniversidadeDAO();
		Universidade uni = new Universidade();
		uni.setNome("IFSP - CAMPUS CAMPINAS");
		uni.setCidade("Campinas");
		
		dao.insert(uni);
	}
}
