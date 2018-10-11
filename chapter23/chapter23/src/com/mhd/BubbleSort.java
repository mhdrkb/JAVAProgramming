package com.mhd;

public class BubbleSort {

    public static void main(String[] args) {
        int[] list = {2,10,45,6,7,19,12,4};
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println("\n");
        BubbleSort.bubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static void bubbleSort(int[] list) {
        boolean needNextpass = true;
        for (int i = 1; i<list.length && needNextpass; i++) {
            needNextpass = false;
            for (int k = 0; k < list.length - i; k++) {
                if (list[k] > list[k + 1]) {
                    int temp = list[k];
                    list[k] = list[k + 1];
                    list[k + 1] = temp;
                    needNextpass = true;
                }
            }
        }
    }
}
