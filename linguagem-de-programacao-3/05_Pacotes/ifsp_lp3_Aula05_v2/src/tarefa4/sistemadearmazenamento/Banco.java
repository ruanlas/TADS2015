package tarefa4.sistemadearmazenamento;

import java.util.ArrayList;

public class Banco {
	public ArrayList<Object> listaObjetos = new ArrayList<Object>();
	
	public int armazenar(Object o) {
		this.listaObjetos.add(o);
		return o.hashCode();
		//return this.listaObjetos.indexOf(o);
	}
	public boolean possui(Object o) {
		int controle = 0;
		for (Object object : listaObjetos) {
			if(object.hashCode()==o.hashCode()){
				controle = 1;
			}
		}
		if (controle==1) {
			return true;
		}else {
			return false;
		}
//		int controle = 0;
//		for (Object object : listaObjetos) {
//			if(object.equals(o)){
//				controle = 1;
//			}
//		}
//		if(controle==1){
//			return true;
//		}else {
//			return false;
//		}
//		ou:
		//return listaObjetos.contains(o);
//		o.hashCode(); => identificador unico do objeto
	}
	public int tamanho() {
		return this.listaObjetos.size();
	}
	public Object buscarPorId(int id) {
		Object objeto = null;
		for (Object object : listaObjetos) {
			if(object.hashCode()==id){
				objeto = object;
			}
		}
		return objeto;
//		if(listaObjetos.contains(listaObjetos.get(id))){
//			return listaObjetos.get(id);
//		}else{
//			return null;
//		}
		
	}
	
}
