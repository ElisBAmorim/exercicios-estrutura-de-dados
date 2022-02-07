package com.amorim.estuturadados.vetor.teste;

import com.amorim.estuturadados.vetor.Vetor;

public class Aula08 {
    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(3);

        vetor.adiciona("A");//0
        vetor.adiciona("B");//1
        System.out.println(vetor.tamanho());
        
        vetor.adiciona("C");//2
        vetor.adiciona("D");//3
        System.out.println(vetor.toString());
        
        vetor.adiciona(2,"X");
        System.out.println(vetor.tamanho());
        System.out.println(vetor.toString());

    }
}
