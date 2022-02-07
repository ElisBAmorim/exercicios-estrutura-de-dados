package com.amorim.estuturadados.vetor.teste;

import com.amorim.estuturadados.vetor.VetorObjetos;
import com.amorim.estuturadados.vetor.model.Contato;

public class Aula10 {
    public static void main(String[] args) throws Exception {
        VetorObjetos vetor = new VetorObjetos(3);

        Contato contato_1 = new Contato("Contato-1", "1234-5678", "email@gmail.com");

        vetor.adiciona(contato_1);//0
        vetor.adiciona(new Contato("Contato-2", "1223-4556", "email@email.com"));//1
        vetor.adiciona(new Contato("Contato-3", "1334-5778", "email@outlook.com"));//2
        System.out.println("Tamanho = "+vetor.tamanho());
        
        vetor.adiciona(new Contato("Contato-4", "1314-5778", "email.email@outlook.com"));//2
        System.out.println(vetor.toString());
        System.out.println("Tamanho = "+vetor.tamanho());
        
        vetor.remove(2);
        System.out.println("Tamanho = "+vetor.tamanho());
        System.out.println(vetor.toString());

        int posicao = vetor.busca(contato_1);
        if(posicao<0){
            System.out.println("Contato não existe no vetor!");
        }else{
            System.out.println("Contato localizado, posição = "+posicao);
        }

    }
}
