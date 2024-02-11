package arrays;

import java.sql.SQLOutput;

public class ReverseAnArray {

    public static void main(String[] args) {

        int arr[] = {5,6,7,8,9};
        reverseAnArray(arr);
        for (int x: arr) {
            System.out.println(x);
        }
    }

    public static void reverseAnArray(int arr[]){

       int low=0;
       int high = arr.length-1;
       while(low <high){

           int temp = arr[low];
           arr[low] =  arr[high];
           arr[high] =temp;
           low++;
           high--;

       }
    }

}
