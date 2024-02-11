public class CheckArrayIsSorted {


    public static void main(String[] args) {

        int [] arr = {10,20,15,30,40,50};

       boolean answer =  verifyArraySorted(arr);
       System.out.println(answer);
    }

    public static boolean verifyArraySorted(int arr[]){

        for(int i=0;i<arr.length-1;i++){

            if(arr[i]>arr[i+1]){
               return false ;
            }
        }


        return true;
    }
}
