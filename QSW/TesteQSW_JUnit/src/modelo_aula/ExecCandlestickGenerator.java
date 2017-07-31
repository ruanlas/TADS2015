/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo_aula;

import java.util.Calendar;
import java.util.List;
import java.util.Arrays;

public class ExecCandlestickGenerator {

    public static void main(String[] args) {
        Calendar hoje = Calendar.getInstance();
        Negociacao negociacao1 = new Negociacao(40.5, 100, hoje);
        Negociacao negociacao2 = new Negociacao(45.0, 100, hoje);
        Negociacao negociacao3 = new Negociacao(39.8, 100, hoje);
        Negociacao negociacao4 = new Negociacao(42.3, 100, hoje);
        List<Negociacao> negociacoes = Arrays.asList(negociacao1, negociacao2, negociacao3, negociacao4);
        CandlestickGenerator fabrica = new CandlestickGenerator();
        Candlestick candle = fabrica.constroiVelaParaData(hoje, negociacoes);
        
        System.out.println("++++++");
        System.out.println("Abertura: "+candle.getAbertura());
        System.out.println("Fechamento: "+candle.getFechamento());
        System.out.println("Mínima: "+candle.getMinimo());
        System.out.println("Máxima: "+candle.getMaximo());
        System.out.println("Volume: "+candle.getVolume());
        System.out.println("Data: "+candle.getData().get(Calendar.DAY_OF_MONTH)+"/"+candle.getData().get(Calendar.MONTH)+"/"+candle.getData().get(Calendar.YEAR));
        System.out.println("++++++");

    }
}
