public class MaximumInAnArray {


    public static void main(String[] args) {

        int [] arr = {3,15,6,9,35,3};

        int answer  = findMaximum(arr);
        System.out.println(answer);

    }

    public  static  int findMaximum(int arr[]){

        int max=0;

        for(int i=0; i<arr.length;i++){



            if(arr[i]>max){

                max=arr[i];

            }

        }




        return max;


    }

}
