/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo_aula;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CandlestickGenerator {

    public Vela constroiVelaPara(List<Negocio> negocios, Calendar data) {

        double abertura = negocios.isEmpty() ? 0 : negocios.get(0).getPreco();
        double fechamento = negocios.isEmpty() ? 0 : negocios.get(negocios.size() - 1).getPreco();
        double minimo = Double.MAX_VALUE;
        double maximo = Double.MIN_VALUE;
        double volume = 0;

        for (Negocio negocio : negocios) {
            volume += negocio.getVolume();
            if (negocio.getPreco() > maximo) {
                maximo = negocio.getPreco();
            }
            if (negocio.getPreco() < minimo) {
                minimo = negocio.getPreco();
            }
        }

        return new Vela(abertura, fechamento, minimo, maximo, volume, data);
    }

    public List<Vela> constroiVelas(List<Negocio> todosNegocios) {

        List<Vela> candles = new ArrayList<Vela>();
        List<Negocio> listNeg = new ArrayList<Negocio>();
        Calendar data = todosNegocios.get(0).getData();

        for (Negocio negocio : todosNegocios) {

            if (!verificaMesmoDia(data, negocio.getData())) {
                fechaVela(candles, listNeg, data);
                listNeg = new ArrayList<Negocio>();
            }
            data = negocio.getData();
            listNeg.add(negocio);
        }
        fechaVela(candles, listNeg, data);
        return candles;
    }

    private void fechaVela(List<Vela> candles, List<Negocio> subList,
            Calendar data) {
        candles.add(this.constroiVelaPara(subList, data));
    }

    public boolean verificaMesmoDia(Calendar data, Calendar data2) {
        return data.get(Calendar.YEAR) == data2.get(Calendar.YEAR)
                && data.get(Calendar.MONTH) == data2.get(Calendar.MONTH)
                && data.get(Calendar.DAY_OF_MONTH) == data2.get(Calendar.DAY_OF_MONTH);
    }

    public Candlestick constroiVelaParaData(Calendar data,
            List<Negociacao> negociacoes) {
        double maximo = negociacoes.get(0).getPreco();
        double minimo = negociacoes.get(0).getPreco();
        double volume = 0;

        for (Negociacao negociacao : negociacoes) {
            volume += negociacao.getVolume();
            if (negociacao.getPreco() > maximo) {
                maximo = negociacao.getPreco();
            } else if (negociacao.getPreco() < minimo) {
                minimo = negociacao.getPreco();
            }
        }
        double abertura = negociacoes.get(0).getPreco();
        
        double fechamento = negociacoes.get(negociacoes.size()).getPreco();
        
        return new Candlestick(abertura, fechamento, minimo, maximo, volume, data);
    }

}
