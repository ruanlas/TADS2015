import javax.swing.JOptionPane;

public class TesteLocucao {
	public static void main(String[] args) {
		String mensagem = JOptionPane.showInputDialog("Digite uma mensagem");
		int id = 1;
		
		String opcao;
		do {
			opcao = JOptionPane.showInputDialog(""
					+"Escolha um tipo de locutor:\n"
					+"1) Normal\n"
					+"2) Nervoso\n"
					+"3) Com Sono\n"
					+"4) Preguiçoso\n"
					+"5) Inconstante\n"
					+"6) Cordial\n"
					+"7) Ausente\n"
					+"");
			if (opcao != null) {
				Locutor locutor = null;
				
				switch (opcao) {
				case "1":
					locutor = new LocutorNormal("normal"+id++);
					break;
				case "2":
					locutor = new LocutorNervoso("nervoso"+id++);
					break;
				case "3":
					locutor = new LocutorComSono("com-sono"+id++);
					break;
				case "4":
					locutor = new LocutorPreguicoso("preguiçoso"+id++);
					break;
				case "5":
					locutor = new LocutorInconstante("inconstante"+id++);
					break;
				case "6":
					locutor = new LocutorCordial("cordial"+id++);
					break;
				case "7":
					locutor = new LocutorAusente();
					break;
				default:
					break;
				}
				if (locutor != null) {
						System.out.println(""
							+locutor.getNome()+" diz:\n"
							+locutor.gerarFala(mensagem)
							+"\n"
							+"");
				}
			}
		} while (opcao != null);
	}
}
