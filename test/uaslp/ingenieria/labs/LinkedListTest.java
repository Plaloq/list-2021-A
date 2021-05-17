package uaslp.ingenieria.labs;

import org.assertj.core.internal.bytebuddy.dynamic.scaffold.MethodGraph;
import org.junit.jupiter.api.Test;
import uaslp.ingenieria.labs.list.ArrayList;
import uaslp.ingenieria.labs.list.Iterator;
import uaslp.ingenieria.labs.list.LinkedList;
import uaslp.ingenieria.labs.list.Position;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    @Test
    public void whenLinkedListCreate_thenSizeisZero() {
        //Inicializacion
        LinkedList<Integer> list = new LinkedList<>();

        //ejecucion
        int size = list.getSize();

        //Validacion
        assertEquals(0, size);
    }

    @Test
    public void givenANewLinkedList_whenAdd_ThenSizeIsOne() {
        //Inicializacion
        LinkedList<Integer> list = new LinkedList<>();
        //Ejecucion
        list.add(4);
        //Validacion
        assertEquals(1, list.getSize());
    }

    @Test
    public void givenA5ElementsLinkedList_whenDelete_thenSizeIsFour() {
        //Inicializacion
        LinkedList<Integer> list = new LinkedList<>();

        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        //Ejecucion
        list.delete(4);
        //Validacion
        assertEquals(4, list.getSize());
    }

    @Test
    public void givenAListWith5Elements_whenIterator_thenAllElementsAreAccessible() {
        //Inicializacion
        LinkedList<Integer> list = new LinkedList<>();

        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        //Ejecucion
        Iterator<Integer> it = list.getIterator();

        //Validacion
        assertTrue(it.hasNext());
        assertEquals(5, it.next());
        assertTrue(it.hasNext());
        assertEquals(4, it.next());
        assertTrue(it.hasNext());
        assertEquals(3, it.next());
        assertTrue(it.hasNext());
        assertEquals(2, it.next());
        assertTrue(it.hasNext());
        assertEquals(1, it.next());
    }

    @Test
    public void givenAListWith5Elements_whenInsert_thenWill6() {
        //Inicializacion
        LinkedList<Integer> list = new LinkedList<>();

        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        //Ejecucion
        Iterator<Integer> it = list.getIterator();
        list.insert(0, Position.BEFORE, it);
        //Validacion
        assertEquals(6, list.getSize());

        assertEquals(0, list.get(0));
        assertEquals(5, list.get(1));
        assertEquals(4, list.get(2));
        assertEquals(3, list.get(3));
    }

    @Test
    public void givenAnEmptyList_whenGetIterator_thenIteratorHasNextIsFalse() {
        //Inicializacion
        LinkedList<Integer> list = new LinkedList<>();
        //Ejecucion
        Iterator<Integer> it = list.getIterator();
        //Validacion
        assertFalse(it.hasNext(), "El valor del iterador deberia ser false");

    }
}
//Inicializacion
        //Ejecucion
        //Validacion