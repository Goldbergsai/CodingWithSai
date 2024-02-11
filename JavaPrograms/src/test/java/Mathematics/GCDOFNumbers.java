package Mathematics;

public class GCDOFNumbers {

    public static void main(String[] args) {


        int a=15; int b=30;
       int result = gcd(a,b);
        System.out.println(result);
    }

    public  static  int gcd(int a, int b){

       int res = Math.min(a,b);

       while(res>0){

           if(a%res == 0 & b%res==0 ){

               return  res;
           }else {
               res--;
           }

       }

return res;


    }



}
