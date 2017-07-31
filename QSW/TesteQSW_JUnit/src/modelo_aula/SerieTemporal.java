/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo_aula;

import java.util.List;


public class SerieTemporal {

	private final List<Vela> candles;

	public SerieTemporal(List<Vela> vela) {
		this.candles = vela;
	}
	
	public Vela get(int posicao) {
		return this.candles.get(posicao);
	}
	
	public int getTotal() {
		return this.candles.size();
	}
	
}
