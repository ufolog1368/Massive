package by.jis4.komarov.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortAndSwapServiceTest {
    SortAndSwapService sortAndSwapService;

    @Before
    public void setUp(){
        sortAndSwapService = new SortAndSwapService();
    }

    @Test
    public void sort() {
       int[] array = sortAndSwapService.create(5);
        sortAndSwapService.fillRandomly(array);
        sortAndSwapService.sort(array);
    }

    @Test
    public void swap() {
        int[] array = sortAndSwapService.create(5);
        sortAndSwapService.fillRandomly(array);
        sortAndSwapService.swap(array);
    }
}