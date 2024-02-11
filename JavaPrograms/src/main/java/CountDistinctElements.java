public class CountDistinctElements {


    public static void main(String[] args) {

        int[] arr = {10,20,10,20,30,40,10,20,40,30,10,20,30};

        int answer = countDistinct(arr);

        System.out.println(answer);


    }

    public static int countDistinct(int ar[]) {

        int count = 0;
        boolean isDistinct = true;
        for (int i = 0; i < ar.length; i++) {

            for (int j = (i-1); j >= 0; j--) {

                if (ar[i] == ar[j]) {

                    isDistinct = false;
                    break;
                }


            }
            if (isDistinct == true) {

                count++;
                isDistinct=true;
            }
        }


        return count;
    }

}
