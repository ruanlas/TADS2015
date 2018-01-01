package com.example.ruan.agendademanutencaoautomotiva.models;

import java.util.Date;
import java.util.TimeZone;

/**
 * Created by Ruan on 17/11/2017.
 */

public class LembreteManutencao {
    private long id;
    private String dataAgendamento;
    private String notas;
    private double valor;
    private String horarioAgendamento;
    private long realizado;


    public LembreteManutencao(){
        this.realizado = 0;
    }

    public void setRealizado_naoRealizado(){
        if (this.realizado == 0){
            this.realizado = 1;
        }else if (this.realizado == 1){
            this.realizado = 0;
        }
    }

    public long isRealizado() {
        return this.realizado;
    }

    public void setRealizado(long realizado) {
        this.realizado = realizado;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(String dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getHorarioAgendamento() {
        return horarioAgendamento;
    }

    public void setHorarioAgendamento(String horarioAgendamento) {
        this.horarioAgendamento = horarioAgendamento;
    }

    @Override
    public String toString() {
        String manutencao = null;
        if (this.isRealizado() == 0){
            manutencao = "Pendente";
        }else if (this.isRealizado() == 1){
            manutencao = "Realizada";
        }
        return "Data: "+dataAgendamento+"\n" +
                "Horario: "+horarioAgendamento+"\n" +
                "Notas: "+notas+"\n" +
                "Valor: "+valor+"\n" +
                "Status: "+manutencao;
    }
}
