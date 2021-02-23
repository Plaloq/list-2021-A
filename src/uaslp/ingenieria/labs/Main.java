package uaslp.ingenieria.labs;

import uaslp.ingenieria.labs.list.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList lista1 = new LinkedList();

        lista1.add(1);
        lista1.add(4);
        lista1.add(3);
        lista1.add(7);

        System.out.println("el tamaño es: " + lista1.getSize());
    }
}
