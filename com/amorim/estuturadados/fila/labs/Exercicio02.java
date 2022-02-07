package com.amorim.estuturadados.fila.labs;

import com.amorim.estuturadados.fila.Fila;

public class Exercicio02 {

    final static int ATENDIMENTO_PRIORIDADE = 3;

    public static void main(String[] args) {
        Fila<String> filaRegular = new Fila<>();
        Fila<String> filaPrioridade = new Fila<>();
        filaRegular.enfileira("Pessoa 1");
        filaRegular.enfileira("Pessoa 2");
        filaRegular.enfileira("Pessoa 3");
        filaPrioridade.enfileira("Pessoa 1P");
        filaPrioridade.enfileira("Pessoa 2P");
        filaPrioridade.enfileira("Pessoa 3P");
        filaPrioridade.enfileira("Pessoa 4P");
        filaPrioridade.enfileira("Pessoa 5P");
        filaRegular.enfileira("Pessoa 4");
        filaRegular.enfileira("Pessoa 5");
        filaRegular.enfileira("Pessoa 6");
        filaRegular.enfileira("Pessoa 7");
        filaRegular.enfileira("Pessoa 8");
        if (!filaRegular.estaVazia() && !filaPrioridade.estaVazia()) {
            atendimento(filaRegular, filaPrioridade);
        }
    }

    private static void atendimento(Fila<String> filaRegular, Fila<String> filaPrioridade) {
        int cont;
        while (!filaRegular.estaVazia() || !filaPrioridade.estaVazia()) {
            cont = 0;
            atenderPrioridades(filaPrioridade, cont);
            atenderRegular(filaRegular, filaPrioridade);
        }
    }

    private static void atenderRegular(Fila<String> filaRegular, Fila<String> filaPrioridade) {
        if (!filaRegular.estaVazia()) {
            atendePessoa(filaRegular);
        }
        if (filaPrioridade.estaVazia()) {
            while (!filaRegular.estaVazia()) {
                atendePessoa(filaRegular);
            }
        }
    }

    private static void atenderPrioridades(Fila<String> filaPrioridade, int cont) {
        while (!filaPrioridade.estaVazia() && cont < ATENDIMENTO_PRIORIDADE) {
            atendePessoa(filaPrioridade);
            cont++;
        }
    }

    public static void atendePessoa(Fila<String> fila) {
        String pessoaAtendida = fila.desenfileira();
        System.out.println(pessoaAtendida + " foi atendida.");
    }

}
