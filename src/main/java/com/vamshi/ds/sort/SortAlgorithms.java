package com.vamshi.ds.sort;

import com.vamshi.ds.utils.SortUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class SortAlgorithms {

    public static void main(String[] args) {

        int[] numbers = new int[] {23,11,6,4,0,91,47,34};
        SortAlgorithms sorter = new SortAlgorithms();
//        sorter.bubbleSort(numbers);
//        sorter.selectionSort(numbers);
        sorter.quickSort(numbers,0,numbers.length-1);
    }

    public void bubbleSort(int[] numbers){

        int lenght = numbers.length;

        print(" Array size:"+lenght);

        int counter = 0;
        int i1 = 0;
        boolean sorted = true;
        while(sorted){
            print(" Processing:"+i1);
            sorted = false;

            print(" Array before sort:"+ Arrays.toString(numbers));

           for(int j=0;j < (lenght-i1);j++) {

                counter++;

                if(((j+1)<lenght) && numbers[j] > numbers[j+1]){

                    int numberToSwap = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = numberToSwap;

                    sorted = true;
                }
            }

            print(" Loop count"+counter+" ,  sorted:"+sorted);
            print(" Array after sort:"+ Arrays.toString(numbers));

            if(!sorted){
                break;
            }

            i1++;

        }


    }



    public void selectionSort(int[] numbers){

        int lenght = numbers.length;
        print(" Array size:"+lenght);

        int counter = 0;

        boolean sorted = true;
        for(int i1=0;i1 < (lenght-1);i1++) {
            print(" Processing:"+i1);
            sorted = false;

            print(" Array before sort:"+ Arrays.toString(numbers));

            int minPtr = i1;

            for(int j=i1;j < lenght;j++) {
                counter++;
                if( numbers[j] < numbers[minPtr]) minPtr = j;
            }

            // swap the min at the end of the array

            SortUtils.swap(numbers,minPtr,i1);


            print(" Loop count"+counter+" ,  sorted:"+sorted);
            print(" Array after sort:"+ Arrays.toString(numbers));


        }


    }


    private int quickSortPartition(int[] array,int start,int end){

        int pivot = array[end];

        int x = start-1;

        for(int i=start;i< end;i++){

            if(array[i] < pivot){
                x++;
                SortUtils.swap(array,x,i);
//                print(" Array after swap:"+ Arrays.toString(array));
            }
        }

        SortUtils.swap(array,x+1,end);
//        print(" Array after swap:"+ Arrays.toString(array));
        return x+1;

    }



    public void quickSort(int[] numbers,int start,int end){

        if(start <end) {

            int pivot = quickSortPartition(numbers, 0, end);

            print(" Array after partition:"+ Arrays.toString(numbers));
            print(" pivot:" + pivot);
            quickSort(numbers, 0, pivot-1);
            quickSort(numbers, pivot + 1, end);

            print(" Array after pivot :" + Arrays.toString(numbers));
        }

    }

    public void print(Object str){
        System.out.println(" "+ str);
    }
}
