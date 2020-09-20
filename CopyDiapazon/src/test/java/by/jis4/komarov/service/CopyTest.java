package by.jis4.komarov.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CopyTest {
    Copy copy;

    @Before
    public void setUp(){
        copy =new Copy();
    }

    @Test
    public void copyInRange() {

        int[] array = {40, 50, 100, 200};
        int[] expected = {50, 100};
        int[] actual = copy.copyInRange(array, 41, 150);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void copyInRangeRunLenghtOfNewArray() {

        int[] array = {40, 50, 100, 200};
        int expected = 2;
        int actual = copy.copyInRangeRunLenghtOfNewArray(array, 41, 150);
        assertEquals(expected, actual);
    }
}