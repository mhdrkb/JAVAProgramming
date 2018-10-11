package com.mhd;

public class Insertionsort {

    public static void insertionSort(int[] list) {

        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;

            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }

            list[k + 1] = currentElement;
        }
    }

    public static void main(String[] args) {
        int[] list = {1, 9, 5, 6, 2, -4};
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

        System.out.println("\n");
        Insertionsort.insertionSort(list);

        for (int j = 0; j < list.length; j++) {
            System.out.print(list[j] + " ");
        }
    }
}
