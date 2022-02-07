package com.amorim.estuturadados.fila.labs;

import com.amorim.estuturadados.fila.Fila;
import com.amorim.estuturadados.fila.model.Documento;

public class Exercicio01 {
    public static void main(String[] args) {
        Fila<Documento> fila = new Fila<>();
        fila.enfileira(new Documento("Doc_01", 1));
        fila.enfileira(new Documento("Doc_02", 3));
        fila.enfileira(new Documento("Doc_03", 2));
        fila.enfileira(new Documento("Doc_04", 5));
        fila.enfileira(new Documento("Doc_05", 4));
        fila.enfileira(new Documento("Doc_06", 6));
        imprimirDocumento(fila);
    }

    private static void imprimirDocumento(Fila<Documento> fila) {
        if (fila.estaVazia()) {
            System.out.println("Não há documentos para ser impressos.");
        } else {
            while (!fila.estaVazia()) {
                Documento doc = fila.desenfileira();
                System.out.println("Imprimindo documento " + doc.getNome());
                sleep(doc.getNumFolhas());
            }
            System.out.println("Todos os documentos foram impressos.");
        }
    }

    private static void sleep(int quantidadeDeFolhas) {
        try {
            Thread.sleep(200 * quantidadeDeFolhas);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
