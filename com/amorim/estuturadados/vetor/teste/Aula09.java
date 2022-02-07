package com.amorim.estuturadados.vetor.teste;

import com.amorim.estuturadados.vetor.Vetor;

public class Aula09 {
    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(3);

        vetor.adiciona("A");//0
        vetor.adiciona("B");//1
        System.out.println(vetor.tamanho());
        
        vetor.adiciona("C");//2
        vetor.adiciona("D");//3
        System.out.println(vetor.toString());
        
        vetor.remove(2);
        vetor.remove("A");
        System.out.println(vetor.tamanho());
        System.out.println(vetor.toString());

    }
}
