package com.amorim.estuturadados.fila.labs;

import java.util.Random;

import com.amorim.estuturadados.fila.Fila;

public class Exercicio04 {

    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        adicionarCriancas(fila, 10);

        comecaJogo(fila);

        System.out.println("Ganhador: " + fila.desenfileira());

    }

    private static void comecaJogo(Fila<Integer> fila) {
        while (fila.tamanho() > 1) {
            try {
                Random aleatorio = new Random();
                int num = 0;
                num = selecionarCrianca(aleatorio, num);
                queimou(fila, num);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    private static void queimou(Fila<Integer> fila, int num) {
        for (int i = 0; i < num; i++) {
            fila.enfileira(fila.desenfileira());
        }
        System.out.println("Eliminado = " + fila.desenfileira());
    }

    private static int selecionarCrianca(Random aleatorio, int num) {
        while (num == 0) {
            num = aleatorio.nextInt(10);
        }
        return num;
    }

    private static void adicionarCriancas(Fila<Integer> fila, int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            fila.enfileira(i);
        }
    }
}
