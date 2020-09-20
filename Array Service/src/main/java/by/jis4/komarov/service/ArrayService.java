package by.jis4.komarov.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArrayService {

    Logger log = LoggerFactory.getLogger(ArrayService.class);

    public int[] create(int size){
        return new int[size];
    }

    public void fillRandomly(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (100));
            log.info("array = {}", array);
        }
    }

    public void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            log.info("array = {}", array);
        }
    }

    public int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
                sum += array[i];
                log.info("sum = {}", sum);
        }
        return sum;
    }



   public double avg(int[] array){
        if (array == null){
            return 0;
        }else{
            int sum = 0;
            for (int i = 0; i < array.length; i++){
                sum += i;
                log.info("medAr = {}", sum / array.length);
            }
            return (double) sum / array.length;
        }
   }


}
