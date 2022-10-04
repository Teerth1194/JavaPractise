package JavaDay1;

import java.util.Arrays;
import java.util.Random;

public class q14_arrayMedian {

    public static void main(String [] args){

        calculateMedian(11);
    }

    public static void calculateMedian(int n){

        Random random = new Random();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=random.nextInt(1000);
            //System.out.print(a[i]+" ");
        }
        System.out.println("Before sorting "+ Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("After sorting "+ Arrays.toString(a));
        if(n%2!=0){
            System.out.println("Median of the array is "+ a[((n+1)/2)-1]);
        }
        else {
            String temp = String.valueOf((a[(n/2)-1] + a[(n/2)])*0.5);
            System.out.println("Median of the array is "+  temp);
        }



    }
}
