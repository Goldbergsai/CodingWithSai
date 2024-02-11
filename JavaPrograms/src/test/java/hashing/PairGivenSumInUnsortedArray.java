package hashing;

import java.util.HashSet;

public class PairGivenSumInUnsortedArray {

    public static void main(String[] args) {

        int arr[] = {1,2,5,6,7};
        int sum = 4;

       boolean result  =  sumUnsortedArray(arr,sum);
        System.out.println(result);


    }

    public static boolean sumUnsortedArray(int arr[], int sum){

        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){

                if((arr[i] + arr[j]) == sum){

                    System.out.println("arr1 "+arr[i] + " arr[j] "+arr[j]);
                    return true;
                }

            }

        }

        return false;
    }


    public static boolean sumUnsortedArrayUsingHashset(int arr[], int sum){


        HashSet<Integer> hashSet = new HashSet<>();

        for(int x:  arr){

            if(hashSet.contains(sum-x)){

                return true;

            }else {

                hashSet.add(x);
            }

        }


        return false;
    }







}
