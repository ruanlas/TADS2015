/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo_aula;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public final class Vela {
	
	private final double abertura;
	private final double fechamento;
	private final double minimo;
	private final double maximo;
	private final double volume;
	private final Calendar data;

	public Vela(double abertura, double fechamento, double minimo, double maximo, double volume, Calendar data) {
		this.abertura = abertura;
		this.fechamento = fechamento;
		this.minimo = minimo;
		this.maximo = maximo;
		this.volume = volume;
		this.data = data;
	}

	public double getAbertura() {
		return abertura;
	}

	public double getFechamento() {
		return fechamento;
	}

	public double getMinimo() {
		return minimo;
	}

	public double getMaximo() {
		return maximo;
	}

	public double getVolume() {
		return volume;
	}

	public Calendar getData() {
		return data;
	}

	public boolean isAlta() {
		return this.abertura >= this.fechamento;
	}
	
	public boolean isBaixa() {
		return this.abertura < this.fechamento;
	}

	@Override
	public String toString() {
		return "Candle [abertura=" + abertura + ", fechamento=" + fechamento
				+ ", minimo=" + minimo + ", maximo=" + maximo + ", volume="
				+ volume + ", data=" + new SimpleDateFormat("dd/MM/yyyy").format(this.data.getTime()) + "]";
	}
}
