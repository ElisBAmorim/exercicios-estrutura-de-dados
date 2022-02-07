package com.amorim.estuturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("C");
        arrayList.add("W");
        arrayList.add("X");
        arrayList.add("E");
        arrayList.add("Q");
        arrayList.add("M");
        System.out.println(arrayList.toString());

        arrayList.add(1, "O");
        System.out.println(arrayList.toString());

        boolean existe = arrayList.contains("A");
        if (existe) {
            System.out.println("Elemento existe no array!");
        } else {
            System.out.println("Elemento não existe no array!");
        }

        int pos = arrayList.indexOf("AA");
        if (pos > -1) {
            System.out.println("Elemento existe no array!");
        } else {
            System.out.println("Elemento não existe no array!");
        }

        System.out.println(arrayList.get(1));

        arrayList.remove(0);

        System.out.println(arrayList);

        arrayList.clear();
    }
}
