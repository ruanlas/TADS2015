package com.example.ruan.agendademanutencaoautomotiva.utils;

import com.example.ruan.agendademanutencaoautomotiva.models.LembreteManutencao;

/**
 * Created by Ruan on 26/11/2017.
 */

public class SectionGlobal {
    private static SectionGlobal instance;

    private LembreteManutencao lembreteManutencaoEdicao;

    private SectionGlobal(){

    }

    public LembreteManutencao getLembreteManutencaoEdicao() {
        return lembreteManutencaoEdicao;
    }

    public void setLembreteManutencaoEdicao(LembreteManutencao lembreteManutencaoEdicao) {
        this.lembreteManutencaoEdicao = lembreteManutencaoEdicao;
    }

    public static synchronized SectionGlobal getInstance(){
        if (instance == null){
            instance = new SectionGlobal();
        }
        return instance;

    }
}
