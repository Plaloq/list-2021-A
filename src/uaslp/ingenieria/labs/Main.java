package uaslp.ingenieria.labs;

import uaslp.ingenieria.labs.list.LinkedList;
import uaslp.ingenieria.labs.list.Position;

public class Main {

    public static void main(String[] args) {

        int cuenta =  LinkedList.getListsCount();
        //Wrapper classes -> Integer, Float, Character, Boolean
        //Las wrapper classes son inmutables

        LinkedList<Integer> lista1 = new LinkedList<>();
        LinkedList<String> lista2 = new LinkedList<>();
        LinkedList<Double> lista3 = new LinkedList<>();

        lista1.add(1);
        lista1.add(4);
        lista1.add(3);
        lista1.add(7);

        lista2.add("Hola");
        lista2.add(" Object ");
        lista2.add(" Oriented ");
        lista2.add(" Programming");

        lista3.add(2.5);
        lista3.add(3.1416);
        lista3.add(123.3);
        lista3.add(231.0);

        LinkedList<Integer>.Iterator it = lista1.getIterator();

        while(it.hasNext()){
            LinkedList<Integer>.Iterator backupIt = lista1.new Iterator(it);
            int element = it.next(); //regresar el dato y avanzar el iterador

            if(element == 3){
                lista1.insert(10, Position.BEFORE, backupIt);
            }

            if(element == 7){
                lista1.insert(15, Position.AFTER, backupIt);
            }
        }

        LinkedList<Double>.Iterator itD = lista3.getIterator();

        while(itD.hasNext()){
            LinkedList<Double>.Iterator backupIt = lista3.new Iterator(itD);
            Double element = itD.next(); //regresar el dato y avanzar el iterador

            if(element == 3){
                lista3.insert(10.0, Position.BEFORE, backupIt);
            }

            if(element == 7){
                lista3.insert(15.0, Position.AFTER, backupIt);
            }
        }

        lista1.delete(3);

        System.out.println("---------------------");

        System.out.println("El tamaño es:" + lista1.getSize());

        it = lista1.getIterator();

        while(it.hasNext()){
            int element = it.next();

            System.out.println("Dato: " + element);
        }

        System.out.println("---------------------");

        LinkedList<Integer>.ReverseIterator reverseIterator = lista1.getReverseIterator();

        while(reverseIterator.hasNext()){
            int element = reverseIterator.next();

            System.out.println("Dato: " + element);
        }

        System.out.println("---------------------");

        LinkedList<String>.Iterator itStrings = lista2.getIterator();

        while(itStrings.hasNext()){
            System.out.println(itStrings.next());
        }

        System.out.println("---------------------");
        itD = lista3.getIterator();

        while(itD.hasNext()){
            double element = itD.next();

            System.out.println("Dato: " + element);
        }

        LinkedList<Double>.ReverseIterator reverseIterator1 = lista3.getReverseIterator();

        while(reverseIterator1.hasNext()){
            double element = reverseIterator.next();

            System.out.println("Dato: " + element);
        }
        System.out.println("---------------------");

        LinkedList<Double>.Iterator itDouble = lista3.getIterator();

        while(itDouble.hasNext()){
            System.out.println(itDouble.hasNext());
        }

    }
}