package uaslp.ingenieria.labs;

import uaslp.ingenieria.labs.list.ArrayList;
import uaslp.ingenieria.labs.list.List;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        List<Integer> lista1 = new ArrayList<>();
        List<String> lista2 = new ArrayList<>();

        lista1.add(1);
        lista1.add(4);
        lista1.add(7);
        lista1.add(10);


        lista2.add("Hola");
        lista2.add("Object ");
        lista2.add("Oriented ");
        lista2.add("Programming");


        lista1.delete(3);

        System.out.println("---------------------");

        System.out.println("El tamaño es:" + lista1.getSize());

        System.out.println("---------------------");

        for (int i=0; i< lista1.getSize();i++)
            System.out.println(lista1.get(i));


        System.out.println("---------------------");

        for (int i=0; i< lista2.getSize();i++)
            System.out.println(lista2.get(i));

        System.out.println("---------------------");

    }
}