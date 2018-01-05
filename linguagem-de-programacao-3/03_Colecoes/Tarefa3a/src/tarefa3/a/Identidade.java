package tarefa3.a;

public class Identidade {

	//verifica se os objetos possuem a mesma instância, ou seja, se referenciam a mesma posição na memoria
	public boolean saoAMesmaInstancia(Object o1, Object o2) {
		if(o1==o2){
			return true;
		}else {
			return false;
		}
	}
	//verifica se o valor contido nos objetos são iguais
	public boolean saoLogicamenteIguais(Object o1, Object o2) {
		if (o1.equals(o2)) {
			return true;
		}else {
			return false;
		}
	}
}
