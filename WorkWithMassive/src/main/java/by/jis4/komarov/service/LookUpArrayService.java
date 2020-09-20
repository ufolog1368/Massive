package by.jis4.komarov.service;

public class LookUpArrayService {

        public int findMax(int[] array) {
            if (array == null) {
                return 0;
            } else {
                int numMax = array[0];
                for (int i = 1; i < array.length; i++) {
                    if (array[i] > numMax) {
                        numMax = array[i];
                    }
                }
                return numMax;
            }

        }

        public int findMin(int[] array) {
            if (array == null) {
                return 0;
            } else {
                int numMin = array[0];
                for (int i = 1; i < array.length; i++) {
                    if (array[i] < numMin) {
                        numMin = array[i];
                    }
                }
                return numMin;
            }

        }


        public int indexOfMax(int[] array) {
            if (array == null) {
                return -1;
            } else {
                int numMax = array[0];
                int index =0;
                for (int i = 1; i < array.length; i++) {
                    if (array[i] > numMax) {
                        numMax = array[i];
                        index = i;
                    }
                }
                return index;
            }

        }


        public int indexOfMin(int[] array) {
            if (array == null) {
                return -1;
            } else {
                int numMax = array[0];
                int index =0;
                for (int i = 1; i < array.length; i++) {
                    if (array[i] < numMax) {
                        numMax = array[i];
                        index = i;
                    }
                }
                return index;
            }

        }


        public int indexOf(int[] array, int value) {
            if (array == null) {
                return -1;
            } else {
                int index = 0;
                for (int i = 1; i < array.length; i++) {
                        if (array[i] == value){
                            index = i;
                        }
                }
                return index;
            }
        }
    }
