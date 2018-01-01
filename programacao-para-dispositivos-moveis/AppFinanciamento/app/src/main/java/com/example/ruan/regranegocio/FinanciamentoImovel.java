package com.example.ruan.regranegocio;

import com.example.ruan.exceptions.ExceptionEntradaInsuficiente;

public class FinanciamentoImovel implements Financiamento{
	private boolean novo;
	private double taxa;
	private double valorImovel;
	private double valorEntrada;
	private int quantidadeParcelas;
	private double rendaLiquidaMensal;
	private double valorFinal, valorParcela;
	//O que seria a taxa de juros que o usu�rio deve inserir??
	
	public FinanciamentoImovel() {
		this.novo = false;
		this.valorFinal = 0;
		this.valorParcela = 0;
		this.valorEntrada = 0;
		this.valorImovel = 0;
	}

	private void setImovelNovo() {
		this.novo = true;
	}

	@Override
	public void setNovo(boolean novo) {
		this.novo = novo;
	}

	@Override
	public void inserirValorEntrada(double valorEntrada) throws ExceptionEntradaInsuficiente {
		//deve ser no minimo de 20% (validar)
		double valorEntradaMinimo = this.valorImovel * 0.2;
		
		if (valorEntrada >= valorEntradaMinimo) {
			this.valorEntrada = valorEntrada;
		}else {
			throw new ExceptionEntradaInsuficiente();
		}

		
	}

	@Override
	public void inserirValorDoBem(double valorBem) {
		this.valorImovel = valorBem;
		
	}

	@Override
	public void inserirQuantidadeDeParcelas(int quantidadeParcelas) {
		this.quantidadeParcelas = quantidadeParcelas;
		
	}

	@Override
	public void inserirRendaLiquidaMensal(double rendaLiquidaMensal) {
		this.rendaLiquidaMensal = rendaLiquidaMensal;
		
	}

	@Override
	public void calcular() {
		double valorFinalParcial = 0;
		double valorParcelaParcial = 0;
		double valorResultante = this.valorImovel - this.valorEntrada;
		//calcula o valor tempor�rio da parcela sem juros algum
		double valorParcelaTemp = valorResultante / this.quantidadeParcelas;
		
		//abaixo faz o c�lculo parcial da parcela com os juros
		if (this.rendaLiquidaMensal <= 3500) {
			//Juros de 0,03
			valorParcelaParcial = (valorParcelaTemp * 0.06) + valorParcelaTemp;
		}else if (this.rendaLiquidaMensal > 3500 && this.rendaLiquidaMensal <= 5000) {
			//Juros de 0,025
			valorParcelaParcial = (valorParcelaTemp * 0.05) + valorParcelaTemp;
		}else {
			//Maior de 5000 juros de 0,02
			valorParcelaParcial = (valorParcelaTemp * 0.04) + valorParcelaTemp;
		}
		//abaixo faz o calculo parcial do valor final do im�vel
		valorFinalParcial = valorParcelaParcial * this.quantidadeParcelas;
		
		//abaixo faz o c�lculo do valor final com o acr�ssimo da(s) taxa(s)
		if (novo) {
			//taxa Habite-se de 5% sobre o valor final
			this.taxa = valorFinalParcial * 0.05;
			this.valorFinal = valorFinalParcial + this.taxa;
		}else {
			//taxa Transfer�ncia de 2% sobre o valor final
			this.taxa = valorFinalParcial * 0.02;
			this.valorFinal = valorFinalParcial + this.taxa;
		}
		//abaixo faz o c�lculo do valor da parcela final
		this.valorParcela = this.valorFinal / this.quantidadeParcelas;
	}

	@Override
	public double getValorFinalBem() {
		return valorFinal;
	}

	@Override
	public double getValorFinalCadaParcela() {
		//se o valor for superior a 30% da renda liquida, a pessoa n�o possui os requisitos
		return valorParcela;
	}
	
	@Override
	public double getRendaLiquidaMensal() {
		return this.rendaLiquidaMensal;
	}
}
