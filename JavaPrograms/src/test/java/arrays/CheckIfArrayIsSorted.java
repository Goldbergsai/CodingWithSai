package arrays;

public class CheckIfArrayIsSorted {

    public static void main(String[] args) {

        int arr[] = {8,12,15,15};

        boolean ans = checkArrayIsSorted(arr);
        System.out.println(ans);
    }

    public static boolean checkArrayIsSorted(int arr[]){

        boolean answer =true;
        for(int i=0;i<arr.length-1;i++){

            if(arr[i] >arr[i+1]){
               answer= false;
               break;

            }
        }


        return answer;

    }
}
