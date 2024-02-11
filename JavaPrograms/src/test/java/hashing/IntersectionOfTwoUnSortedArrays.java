package hashing;

import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class IntersectionOfTwoUnSortedArrays  {

    public static void main(String[] args) {

        int arr1[] = {10,20,30};
        int arr2[] = {10,30};
        twoUnsortedArraysusingHashset(arr1,arr2);

    }

    public static void twoUnsortedArrays(int arr1[], int arr2[]) {


        for(int i=0;i<arr1.length;i++){

            for(int j=0; j<arr2.length;j++){

                if(arr1[i] == arr2[j]){

                    System.out.println(arr1[i]);
                }

            }
        }


    }



    public static void twoUnsortedArraysusingHashset(int arr1[], int arr2[]){

        HashSet<Integer> hset = new HashSet<>();

        for(int i=0; i<arr2.length; i++){

            hset.add(arr2[i]);

        }

        for(int j=0; j<arr1.length; j++){

           if( hset.contains(arr1[j])){
               System.out.println(arr1[j]);
           }

        }

    }


}
