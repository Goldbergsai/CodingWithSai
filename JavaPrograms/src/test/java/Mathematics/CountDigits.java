package Mathematics;

public class CountDigits {

    public static void main(String[] args) {

        int number = 789;
        int res = countDigits(number);
        System.out.println(res);


    }

    public static int countDigits(int number) {

        int result = 0;

        while (number > 0) {

            number = number / 10;
            result++;

        }
        return result;


    }


}
