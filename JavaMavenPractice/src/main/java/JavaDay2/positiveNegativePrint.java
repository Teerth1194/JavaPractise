package JavaDay2;

import java.math.BigInteger;
import java.util.Scanner;

public class positiveNegativePrint {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check if its positive or Negative");
        int i = sc.nextInt();

        if(i>0){
            System.out.print("Positive");
        }else if(i<0){
            System.out.print("Negative");
        }else{
            System.out.println("Its big zero");
        }
    }
}
