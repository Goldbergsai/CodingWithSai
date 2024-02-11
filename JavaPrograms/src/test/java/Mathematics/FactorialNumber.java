package Mathematics;

public class FactorialNumber {

    public static void main(String[] args) {

        int number = 4;
       int result =  factorial(number);
        System.out.println(result);


    }

    public static int factorial(int number){

        int result =1;

        for(int i=2; i<=number; i++){

            result = result * i;
        }

        return result;
    }

}
