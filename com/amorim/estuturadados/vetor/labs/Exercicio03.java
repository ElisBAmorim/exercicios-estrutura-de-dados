package com.amorim.estuturadados.vetor.labs;

import com.amorim.estuturadados.vetor.Lista;

public class Exercicio03
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

        lista.remove(elemento_3);

        System.out.println("\nElementos da lista: "+lista);
    }
}
