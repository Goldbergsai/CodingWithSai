package hashing;

import java.util.HashSet;

public class SubarrayWithGivenSum {

    public static void main(String[] args) {

        int arr[] = {15, 2, 8, 10, -5, -8, 6};
        int sum = 3;

        boolean result = subarraywithGivenSumUsingHashset(arr, sum);
        System.out.println(result);


    }

    public static boolean subarraywithGivenSumUsingHashset(int arr[], int sum) {

        HashSet<Integer> hset = new HashSet<>();

        int prefixsum = 0;
        for (int x : arr) {

            prefixsum += x;

            if (prefixsum == sum) {
                return true;

            }
            if (hset.contains(prefixsum-sum)){
                return true;
            }
            hset.add(prefixsum);

        }

        return false;
    }

    public static boolean subarraywithGivenSum(int arr[], int sum) {


        for (int i = 0; i < arr.length; i++) {
            int result = 0;
            for (int j = i; j < arr.length; j++) {

                result += arr[j];
                if (result == sum) {
                    return true;

                }

            }


        }


        return false;

    }


}
