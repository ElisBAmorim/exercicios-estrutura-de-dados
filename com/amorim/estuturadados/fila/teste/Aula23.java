package com.amorim.estuturadados.fila.teste;

import java.util.LinkedList;
import java.util.Queue;

import com.amorim.estuturadados.fila.Fila;

public class Aula23 {

	public static void main(String[] args) {
		Queue<Integer> fila = new LinkedList<>();
		fila.add(5);
		fila.add(9);
		fila.add(1); 
		fila.add(2);
		System.out.println(fila);
		System.out.println(fila.peek());
		System.out.println(fila.remove());
		System.out.println(fila);
	}

}
