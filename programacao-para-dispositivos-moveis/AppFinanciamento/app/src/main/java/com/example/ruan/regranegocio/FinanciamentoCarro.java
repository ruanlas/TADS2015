package com.example.ruan.regranegocio;

import com.example.ruan.exceptions.ExceptionEntradaInsuficiente;

public class FinanciamentoCarro implements Financiamento {
	private boolean novo;
	private double taxaEmplacamento;
	private double taxaIpva;
	private double valorVeiculo;
	private double valorEntrada;
	private int quantidadeParcelas;
	private double rendaLiquidaMensal;
	private double valorFinal, valorParcela;
	
	public FinanciamentoCarro() {
		this.novo = false;
		this.valorFinal = 0;
		this.valorParcela = 0;
		this.valorEntrada = 0;
		this.valorVeiculo = 0;
	}
	
	public void setVeiculoNovo() {
		this.novo = true;
	}

	@Override
	public void setNovo(boolean novo) {
		this.novo = novo;
	}

	@Override
	public void inserirValorEntrada(double valorEntrada) throws ExceptionEntradaInsuficiente {
		//deve ser no minimo de 5% (validar)
		double valorEntradaMinimo = this.valorVeiculo * 0.05;
		
		if (valorEntrada >= valorEntradaMinimo) {
			this.valorEntrada = valorEntrada;
		}else {
			throw new ExceptionEntradaInsuficiente();
		}
		
	}

	@Override
	public void inserirValorDoBem(double valorBem) {
		this.valorVeiculo = valorBem;
		
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
		if (novo) {
			//taxa de 1% para o emplacamento e 4% para o IPVA (calculado a partir do valor do autom�vel)
			this.taxaEmplacamento = valorVeiculo * 0.01;
			this.taxaIpva = valorVeiculo * 0.04;
		}else {
			this.taxaEmplacamento = 0;
			this.taxaIpva = 0;
		}
		double valorRestante = this.valorVeiculo - this.valorEntrada;
		double valorParcelaParcial = (valorRestante + this.taxaIpva + this.taxaEmplacamento) / this.quantidadeParcelas;
		
		if (this.rendaLiquidaMensal <= 3500) {
			//Juros de 0,06
			this.valorParcela = (valorParcelaParcial * 0.06) + valorParcelaParcial;
		}else if (this.rendaLiquidaMensal > 3500 && this.rendaLiquidaMensal <= 5000) {
			//Juros de 0,05
			this.valorParcela = (valorParcelaParcial * 0.05) + valorParcelaParcial;
		}else {
			//Maior de 5000 juros de 0,04
			this.valorParcela = (valorParcelaParcial * 0.04) + valorParcelaParcial;
		}
		this.valorFinal = this.valorParcela * this.quantidadeParcelas;
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
