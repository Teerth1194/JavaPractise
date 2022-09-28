package JavaDay1;

public class oddEven {

    public static void main(String [] args){

        System.out.println(oddEvencheck(945789));

    }

    public static String oddEvencheck (int inputnumber){

        String result;

        if (inputnumber%2==0){
            result = "it is even";
        }else{
            result = "it is odd";
        }
        return result;

    }

}
