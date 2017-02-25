package com.company.mc.saturday;

/**
 * Created by dmitrij on 25.02.17.
 */
public class Sort {

    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {

            int min = i;

            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < array[i]) {
                    min = j;
                }
            }

            int tmp = array[min]; //
            array[min] = array[i];
            array[i] = tmp;


        }


    }


    public static void bubbleSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int tmp = array[i]; //
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }

        }


    }

    public static int min(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }

        return min;
    }

}
