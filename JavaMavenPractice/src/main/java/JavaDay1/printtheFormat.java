package JavaDay1;

public class printtheFormat {

    public static void main(String [] args){

        formatthepattern(6);

    }

    public static String formatthepattern(int n){

        String temp1="";
        String temp2="";

        for (int t=0;t<=n;t++){

            for (int i = 1;i<=t;i++){

                temp1=temp1+String.valueOf(i);
            }

            for (int i =t-1;i>0;i--){
                temp2 = temp2 + String.valueOf(i);
            }

            System.out.println(temp1+temp2);
            temp1="";
            temp2="";


        }

        return "no use";

    }
}
