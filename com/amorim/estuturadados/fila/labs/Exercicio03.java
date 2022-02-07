package com.amorim.estuturadados.fila.labs;

import java.util.EnumSet;
import java.util.Random;

import com.amorim.estuturadados.fila.FilaComPrioridade;
import com.amorim.estuturadados.fila.model.Pessoa;

public class Exercicio03 {

    public static void main(String[] args) {
        FilaComPrioridade<Pessoa> fila = new FilaComPrioridade<>();
        fila.enfileira(new Pessoa("Paciente_1", Classificacao.VERDE.getValue()));
        fila.enfileira(new Pessoa("Paciente_2", Classificacao.AMARELO.getValue()));
        fila.enfileira(new Pessoa("Paciente_3", Classificacao.VERMELHO.getValue()));
        fila.enfileira(new Pessoa("Paciente_4", Classificacao.AMARELO.getValue()));
        fila.enfileira(new Pessoa("Paciente_5", Classificacao.VERDE.getValue()));
        fila.enfileira(new Pessoa("Paciente_6", Classificacao.AMARELO.getValue()));

        atendimento(fila);
        novosPacientes(fila);

    }

    private static void atendimento(FilaComPrioridade<Pessoa> fila) {
        new Thread(new Runnable() {
            public void run() {
                while (!fila.estaVazia()) {
                    try {
                        System.out.println(fila.desenfileira() + " atendida.");
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Atendimento concluído.");
            }
        }).start();
    }

    private static void novosPacientes(FilaComPrioridade<Pessoa> fila) {
        new Thread(new Runnable() {
            public void run() {
                int cont = 0;
                do {
                    Random prioridade = new Random();
                    final Classificacao classificacao = EnumSet.allOf(Classificacao.class)
                            .stream()
                            .filter(e -> e.getValue() == prioridade.nextInt(3))
                            .findFirst().orElse(Classificacao.VERDE);

                    try {
                        Thread.sleep(4000);
                        Pessoa p = new Pessoa("Novo_Paciente_" + cont, classificacao.getValue());
                        fila.enfileira(p);
                        cont++;
                        System.out.println(p + " enfileirada.");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } while (cont < 10);
            }
        }).start();
    }

    public enum Classificacao {
        VERMELHO(1),
        AMARELO(2),
        VERDE(3);

        private final int value;

        private Classificacao(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

    }
}
