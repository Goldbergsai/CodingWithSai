package arrays;

public class SecondLargestElementInArray {

    public static void main(String[] args) {

        int arr[]= {12,7,20,9,13};
        int index = secondLargestElementInArray(arr);
        System.out.println(index);

    }

    public static int secondLargestElementInArray(int arr[]) {

        int sec = -1;
        int fir = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > arr[fir]) {

                sec = fir;
                fir = i;

            } else if (arr[i] == arr[fir]) {

            } else if (arr[i] != arr[fir]) {

                if (sec == -1 || arr[i] > arr[sec]) {

                    sec = i;

                }
            }
        }


        return sec;
    }

}
