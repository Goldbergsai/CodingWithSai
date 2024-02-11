package hashing;

import java.util.HashMap;

public class FrequencyOfArrayElements {

    public static void main(String[] args) {

        int arr[]= { 10,12,10,15,10,20,12 };

        String str = "Hello Saikumar ";
        frequencyofletters(str);
        /* frequencyOfArrayEle(arr); */
    }

    public static  void frequencyofletters(String input){

        HashMap<Character, Integer> hmap = new HashMap<>();

      String s =  input.toLowerCase();
        char[] ch = s.toCharArray();

      for(Character c : ch){

          hmap.put(c,hmap.getOrDefault(c,0)+1);

      }

      hmap.forEach((key,value)-> {
                  System.out.println(key +" occured"+value);
              });

//        System.out.println(hmap);

    }




    public static void frequencyOfArrayEle(int arr[]){

        HashMap<Integer,Integer> hmap = new HashMap<>();


        for(int x : arr){

            hmap.put(x,hmap.getOrDefault(x,0)+1);


        }

        System.out.println(hmap);
    }














}


