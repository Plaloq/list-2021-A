package uaslp.ingenieria.labs;

import org.junit.jupiter.api.Test;
import uaslp.ingenieria.labs.list.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArrayListTest {


    @Test
    public void whenarrayListCreate_thenSizeisZero(){
        //Inicializacion
        ArrayList<Integer> list = new ArrayList<>();


        //Ejecucion
        int size = list.getSize();


        //validacion
        assertThat(list.getSize()).isZero();
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


        //Ejecucion
        list.add(1500);


        //validacion
        assertThat(list.getSize()).isEqualTo(2);
        assertThat(list.get(0)).isEqualTo(500);
        assertThat(list.get(1)).isEqualTo(1500);
    }
}
