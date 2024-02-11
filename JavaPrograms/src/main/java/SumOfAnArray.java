public class SumOfAnArray {

    public static void main(String[] args) {

        int arr[] = {2, 5, 7, 9,7};

        int answer = findSum(arr);
        System.out.println(answer);
    }

    public static int findSum(int arr[]) {

        int sum = 0;

        for(int i=0;i<arr.length;i++){

            sum = sum +arr[i];
        }

        return sum;
    }
}
