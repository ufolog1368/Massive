package by.jis4.komarov.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayServiceTest {
    ArrayService arrayService;

    @Before
    public void setUp(){
        arrayService = new ArrayService();

    }

    @Test
    public void create() {
        arrayService.create(5);

        int [] expected = {1,2,3,4,5};

        assertEquals(expected.length, 5);
    }

    @Test
    public void fillRandomly() {
        int[] array = arrayService.create(20);
        arrayService.fillRandomly(array);
    }

    @Test
    public void printArray() {
        int[] array = arrayService.create(20);
        arrayService.printArray(array);
    }

    @Test
    public void sum() {
        int[] array = arrayService.create(20);
        arrayService.fillRandomly(array);
        arrayService.sum(array);
    }

    @Test
    public void avg() {
        int[] array = arrayService.create(20);
        arrayService.fillRandomly(array);
        arrayService.avg(array);
    }

    @Test
    public void avgNull() {

        double expected = 0;
        double actual =  arrayService.avg(null);
        assertEquals(expected, actual, 0);
    }
}