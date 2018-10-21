package com.sda.git;

public class Main {

    public static void main(String[] args) {
        CustomList<String> lista = new CustomList<>();
        lista.add("Jan");
        lista.add("Maciej");
        lista.add("Maciej");
        lista.add("Maciej");
        lista.add("Maciej");
        lista.add("Maciej");
        lista.add("Maciej");
        lista.add("Maciej");
        lista.add("Maciej");
        lista.add("Maciej");
        lista.add("Maciej");
        lista.add("Maciej");
        lista.add("Maciej");
        for (int i=0;i<lista.size();i++) {
            System.out.println(lista.get(i));
        }
    }
}
