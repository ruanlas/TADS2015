package others;

public class TelefoneValidation {
	public static boolean isTelefone(String telefone) {
		String regex = "\\d{9}";
		return telefone.matches(regex);
	}
}
