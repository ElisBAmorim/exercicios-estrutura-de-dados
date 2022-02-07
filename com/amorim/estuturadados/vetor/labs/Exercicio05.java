package com.amorim.estuturadados.vetor.labs;

import com.amorim.estuturadados.vetor.Lista;

public class Exercicio05
 {
    public static void main(String[] args) throws Exception {
       Lista<String> lista = new Lista<>(5);
       final String elemento_1 = "1_Elemento";
       final String elemento_2 = "2_Elemento";
       final String elemento_3 = "3_Elemento";
       final String elemento_4 = "4_Elemento";
       
       lista.adiciona(elemento_1);
       lista.adiciona(elemento_2);
       lista.adiciona(elemento_3);
       lista.adiciona(elemento_4);

        System.out.println("Elementos da lista: "+lista);

        lista.limpar();

        System.out.println("Elementos da lista após limpar: "+lista);
    }
}
