package by.jis4.komarov.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LookUpArrayServiceTest {
    LookUpArrayService lookUpArrayService;

    @Before
    public void setUp(){
        lookUpArrayService =new LookUpArrayService();
    }

    @Test
    public void findMax() {
        int [] array = {1, 2, 67, 59,5, -6, -4, -3, 9, 0, 4};


        int expected = 67;
        int actual = lookUpArrayService.findMax(array);
        assertEquals(expected, actual);

    }

    @Test
    public void findMaxNull() {
        int [] array = null;


        int expected = 0;
        int actual = lookUpArrayService.findMax(array);
        assertEquals(expected, actual);

    }

    @Test
    public void findMin() {
            int [] array = {1, 2, 67, 59,5, -6, -4, -3, 9, 0, 4};

            int expected = -6;
            int actual = lookUpArrayService.findMin(array);
            assertEquals(expected, actual);
        }

    @Test
    public void findMinNull() {
        int [] array = null;

        int expected = 0;
        int actual = lookUpArrayService.findMin(array);
        assertEquals(expected, actual);
    }


    @Test
    public void indexOfMax() {
        int [] array = {1, 2, 67, 59,5, -6, -4, -3, 9, 0, 4};


        int expected = 2;
        int actual = lookUpArrayService.indexOfMax(array);
        assertEquals(expected, actual);
    }

    @Test
    public void indexOfMaxNull() {
        int [] array = null;


        int expected = -1;
        int actual = lookUpArrayService.indexOfMax(array);
        assertEquals(expected, actual);
    }

    @Test
    public void indexOfMin() {
        int [] array = {1, 2, 67, 59,5, -6, -4, -3, 9, 0, 4};


        int expected = 5;
        int actual = lookUpArrayService.indexOfMin(array);
        assertEquals(expected, actual);
    }

    @Test
    public void indexOfMinNull() {
        int [] array = null;


        int expected = -1;
        int actual = lookUpArrayService.indexOfMin(array);
        assertEquals(expected, actual);
    }

    @Test
    public void indexOf() {
        int [] array = {1, 2, 67, 59,5, -6, -4, -3, 9, 0, 4};


        int expected = 1;
        int actual = lookUpArrayService.indexOf(array, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void indexOfNull() {
        int [] array = null;


        int expected = -1;
        int actual = lookUpArrayService.indexOf(array, 2);
        assertEquals(expected, actual);
    }
}