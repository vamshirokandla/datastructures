package com.vamshi.ds.search;

public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] numbers = new int[] {0, 4, 6, 11, 23, 34, 47, 91};


        bs.binarySearch(23,numbers);
    }


    public void binarySearch(int searchItem, int[] array) {


        boolean itemFound = binarySearch(searchItem,array,0,array.length-1);


        System.out.println(" Search item found in the array:"+itemFound);
    }


    public boolean binarySearch(int searchItem, int[] array,int start,int end) {


        if(start <= end){

            int mid = (end-start)/2 + start;

            if(array[mid]==searchItem)  return true;
            if(array[mid]> searchItem)  return binarySearch(searchItem,array,start, mid-1);

            return binarySearch(searchItem,array, mid+1,end);


        }

        return false;
    }


}
