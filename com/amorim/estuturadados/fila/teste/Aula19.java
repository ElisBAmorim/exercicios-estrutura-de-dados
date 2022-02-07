package com.amorim.estuturadados.fila.teste;

import com.amorim.estuturadados.fila.Fila;

public class Aula19 {

	public static void main(String[] args) {
		Fila<Integer> fila = new Fila<>();
		fila.enfileira(1);
		System.out.println(fila.estaVazia());
		System.out.println(fila.tamanho());
	}

}
