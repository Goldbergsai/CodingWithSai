package hashing;

import java.util.HashSet;
import java.util.Iterator;

public class UnionOfTwoSortedArrays {

    public static void main(String[] args) {

        int arr1[] ={3,3,3};
        int arr2[] = {3,3};
        unionofsortedarrays(arr1,arr2);

    }

    public static void unionofsortedarrays(int arr1[], int arr2[]){

        HashSet<Integer> hset1 = new HashSet<>();
        HashSet<Integer> hset2 = new HashSet<>();

        for(int x : arr1){
            hset1.add(x);
        }
        for(int y :arr2){

            hset2.add(y);
        }
        int count =hset1.size();
        int i=0;

        Iterator<Integer> itr1 = hset2.iterator();
        while(itr1.hasNext()){

            if(!hset1.contains(itr1.next())){
                count++;
            }

        }


        System.out.println(count);

    }








}
