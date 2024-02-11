package arrays;

import java.sql.SQLOutput;

public class LargestElementInAnArray {

    public static void main(String[] args) {

        //Given an Array, we need to find the index of an largest element in an array

        int arr[] = {10,5,20,3,7,30};
       int index =  largesrEleIndex(arr);
        System.out.println(index);

    }


    public static int largesrEleIndex(int arr[]){

        int i;

        int largestelementIndex = 0;

        for(i=1;i<arr.length; i++){

            if(arr[i] > arr[largestelementIndex]){

                largestelementIndex =i;
            }

        }


        return largestelementIndex;
    }



}
