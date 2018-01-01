package com.example.ruan.regranegocio;

import com.example.ruan.exceptions.ExceptionEntradaInsuficiente;

public interface Financiamento {

	public void inserirValorEntrada(double valorEntrada) throws ExceptionEntradaInsuficiente;
	
	public void inserirValorDoBem(double valorBem);
	
	public void inserirQuantidadeDeParcelas(int quantidadeParcelas);
	
	public void inserirRendaLiquidaMensal(double rendaLiquidaMensal);
	
	public void calcular();
	
	public double getValorFinalBem();
	
	public double getValorFinalCadaParcela();
	
	public double getRendaLiquidaMensal();

	public void setNovo(boolean novo);
}
