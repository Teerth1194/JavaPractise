package JavaDay1;

import java.sql.Array;

public class AlternatePrint {

    public static void main(String [] arg){

        arrayprintelement(3);


    }

    public static String arrayprintelement(int n){

//        int[] a = new int[n];
//        for(int i=1;i<n;i++){
//            a[i] = i;
//        }

        int a[] = {1,2,3,4,5};

        int counter = 1;
        for (int i=0;i<n;i++){
            int m = 2*i;
            if(2*i<n){
                System.out.print(a[m] + " ");
            }

        }

        return "hello";
    }
}
