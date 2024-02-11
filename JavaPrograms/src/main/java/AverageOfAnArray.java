public class AverageOfAnArray {

    public static void main(String[] args) {

        int arr[] = {10,20,30,40,50};
        int answer = findAverage(arr);
        System.out.println(answer);


    }

                               
    public static int findAverage(int arr[]){

        int sum =0;


        for(int i=0;i<arr.length;i++){

           sum = sum +arr[i];

        }
        int average = sum/arr.length;

        return average;
    }

}
