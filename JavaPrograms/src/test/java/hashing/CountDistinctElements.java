package hashing;


import java.util.*;
import java.util.stream.Collectors;

public class CountDistinctElements {


    public static void main(String[] args) {

        int arr[] = { 10,20,30,10,20};

        countDistinctElem(arr);
        countDistinct(arr);


        }


        public static void countDistinctElem(int arr[]){

            HashSet<Integer> hset = new HashSet<Integer>();

            for(int x : arr){

                hset.add(x);
            }
            System.out.println(hset);

        }




        public static void countDistinct(int[] arr){

        HashSet<Integer> hset = new HashSet<Integer>(Arrays.stream(arr).boxed().collect(Collectors.<Integer>toList()));
            System.out.println(hset);

        }


    }
    

