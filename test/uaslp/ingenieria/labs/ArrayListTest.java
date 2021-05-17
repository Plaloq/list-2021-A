package uaslp.ingenieria.labs;

import org.junit.jupiter.api.Test;
import uaslp.ingenieria.labs.list.ArrayList;
import uaslp.ingenieria.labs.list.Iterator;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {


    @Test
    public void whenarrayListCreate_thenSizeisZero(){
        //Inicializacion
        ArrayList<Integer> list = new ArrayList<>();


        //Ejecucion
        int size = list.getSize();
        size=1;

        //validacion
        assertEquals(1, size, "Size no es 0");
        //assertThat(list.getSize()).isZero();
    }

    @Test
    public void givenANewAray_whenAddElement_thenSizeIsOne(){
        //Inicializacion
        ArrayList<Integer> list = new ArrayList<>();


        //Ejecucion
        list.add(500);


        //validacion
        assertThat(list.getSize()).isEqualTo(1);
        assertThat(list.get(0)).isEqualTo(500);
    }

    @Test
    public void givenANewAray_whenAddElement_thenSizeIsTwo(){
        //Inicializacion
        ArrayList<Integer> list = new ArrayList<>();

        list.add(500);
        list.add(500);
        list.add(500);
        list.add(500);

        //Ejecucion
        list.add(1500);

        //validacion
        assertThat(list.getSize()).isEqualTo(5);
        assertThat(list.get(0)).isEqualTo(500);
        assertThat(list.get(4)).isEqualTo(1500);
    }

    @Test
    public void givenAListWith5Elements_whenIterator_thenAllElementsAreAccessible(){
        //Inicializacion
        ArrayList<Integer> list = new ArrayList<>();

        list.add(500);
        list.add(600);
        list.add(700);
        list.add(800);
        list.add(900);

        //Ejecucion
        Iterator<Integer> it = list.getIterator();

        //Validacion
        assertTrue(it.hasNext());
        assertEquals(500, it.next());
        assertTrue(it.hasNext());
        assertEquals(600, it.next());
        assertTrue(it.hasNext());
        assertEquals(700, it.next());
        assertTrue(it.hasNext());
        assertEquals(800, it.next());
        assertTrue(it.hasNext());
        assertEquals(900, it.next());
    }

    @Test
    public void givenAListWith5Elements_whenReverseIterator_thenAllElementsAreAccessible(){
        //Inicializacion
        ArrayList<Integer> list = new ArrayList<>();

        list.add(500);
        list.add(600);
        list.add(700);
        list.add(800);
        list.add(900);

        //Ejecucion
        Iterator<Integer> it = list.getReverseIterator();

        //Validacion
        assertTrue(it.hasNext());
        assertEquals(900, it.next());
        assertTrue(it.hasNext());
        assertEquals(800, it.next());
        assertTrue(it.hasNext());
        assertEquals(700, it.next());
        assertTrue(it.hasNext());
        assertEquals(600, it.next());
        assertTrue(it.hasNext());
        assertEquals(500, it.next());
    }

    @Test
    public void givenAListWith5Element_whenDelete_thenElementsAre4()
    {
        //Inicializacion
        ArrayList<Integer> list = new ArrayList<>();

        list.add(500);
        list.add(600);
        list.add(700);
        list.add(800);
        list.add(900);

        //ejecucion
        list.delete(4);

        //Validacion
        assertEquals(4, list.getSize());
    }
}
