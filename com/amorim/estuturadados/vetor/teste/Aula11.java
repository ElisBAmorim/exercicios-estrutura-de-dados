package com.amorim.estuturadados.vetor.teste;

import com.amorim.estuturadados.vetor.Lista;

public class Aula11 {
    public static void main(String[] args) throws Exception {
        Lista<String> vetor = new Lista<>(1);
        vetor.adiciona("elemento");
        System.out.println(vetor.toString());

    }
}
