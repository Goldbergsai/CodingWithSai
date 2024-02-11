package Mathematics;

public class PalindromeNumber {

    public static void main(String[] args) {

        int number = 3636;
        boolean result = verifyPalindrome(number);
        System.out.println(result);
    }

    public static boolean verifyPalindrome(int number) {

        int reverse = 0;
        int temp = number;

        while (temp != 0) {

            int lastdigit = temp % 10;

            reverse = reverse * 10 + lastdigit;
            temp = temp / 10;

        }


        return (reverse == number);
    }


}
