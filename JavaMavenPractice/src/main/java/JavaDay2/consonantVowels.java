package JavaDay2;

import java.util.Scanner;

public class consonantVowels {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        String flag = null;
        String a[] = {"A","E","I","O","U","a","e","i","o","u"};

        for (String m:a){
            if (inputString==m){
                flag = "vowels";
            }else {flag = "consonant";}
        }

        if (flag.equals("vowels")){
            System.out.println("Input string is vowels");
        }else{
            System.out.println("Input string is consonant");
        }
    }
}
