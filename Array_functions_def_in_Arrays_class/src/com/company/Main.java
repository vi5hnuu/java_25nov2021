package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] arr={23,45,11,54,89,32};
	int i;
        System.out.println("original array");
        for(i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

        Arrays.sort(arr);
        System.out.println("Sorted array");
        for(i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

        int index=Arrays.binarySearch(arr,54);
        System.out.println("54 is found at index "+index);

        int[] newarr=new int[6];
        newarr=Arrays.copyOf(arr, arr.length);
        System.out.println("New array contents");
        for(i=0;i<newarr.length;i++)
            System.out.print(newarr[i]+" ");

        Arrays.fill(arr,0);
        System.out.println("cleared array");
        for(i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();

        //type Array. to get list of all function of Array class.
    }
}
