package hashing;

public class LongestSubarrayWithGivenSum {

    public static void main(String[] args) {

        int arr[] = {3,1,0,1,8,2,3,6};

        int sum =0;

        int res = longestSubarray(arr,sum);

        System.out.println(res);



    }


    public static int longestSubarray(int arr[], int sum) {

        int size = 0;

        for (int i = 0; i < arr.length; i++) {
            int result = 0;

            for (int j = i; j < arr.length; j++) {

                result += arr[j];
                if (result == sum && size < (j-i+1)) {

                    size = j-i+1;
                }
            }


        }


        return size;
    }


}
