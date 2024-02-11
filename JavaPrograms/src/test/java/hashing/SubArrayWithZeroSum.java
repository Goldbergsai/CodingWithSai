package hashing;

import java.util.HashSet;

public class SubArrayWithZeroSum {


    public static void main(String[] args) {
        int arr[] = {4, -3, 2, 1};

        boolean result = subArrayZerosumusingHashset(arr);
        System.out.println(result);

    }

    public static boolean subArrayZerosumusingHashset(int arr[]){
        HashSet<Integer> hset = new HashSet<>();
        int presum = 0;

        for(int i=0;i<arr.length;i++){

            presum +=arr[i];
            if(hset.contains(presum))  {
                return true;
            }
            if (presum == 0){
               return  true;
            }
            hset.add(presum);
        }

        return  false;
    }

    public static boolean subArrayWithxerosum(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            int current_sum = 0;

            for (int j = i; j < arr.length; j++) {

                current_sum += arr[j];
                if (current_sum == 0) {
                    return true;
                }

            }


        }

        return false;
    }
}
