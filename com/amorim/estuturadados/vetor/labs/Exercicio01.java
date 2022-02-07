package com.amorim.estuturadados.vetor.labs;

import com.amorim.estuturadados.vetor.Lista;

public class Exercicio01
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

        boolean existe = lista.contem(elemento_1);
        if(existe){
            System.out.println(elemento_1.concat(" existe na lista!"));
        }else{
            System.out.println(elemento_1.concat(" não existe na lista!"));
        }

        existe = lista.contem(elemento_4);
        if(existe){
            System.out.println(elemento_4.concat(" existe na lista!"));
        }else{
            System.out.println(elemento_4.concat(" não existe na lista!"));
        }

        System.out.println("\nElementos da lista: "+lista);
    }
}
