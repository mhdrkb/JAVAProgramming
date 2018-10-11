package com.ImplementingLists;


public class ArrayCopy {

    public static void main(String[] args) {
        int[] sa = {9, 12, 45, 13, 89, 45};
        //int x = sa.length;
        int[] ta = new int[sa.length];
        for (int i = 0; i < sa.length; i++) {
            ta[i]=sa[i];
        }
        for (int i = 0; i < ta.length; i++) {
            System.out.print(ta[i] + " ");
        }
    }
}
