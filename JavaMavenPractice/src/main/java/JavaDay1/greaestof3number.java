package JavaDay1;

public class greaestof3number {

    public static void main(String [] args){
        System.out.println(greatestnumber(4567,7868,6543));
    }

    public static int greatestnumber(int a, int b, int c){

        int greatest;

        if (a>b){
            if(a>c){
                greatest = a;
            }
            else {
                greatest = c;
            }
        }
        else
        {
            if(b>c){
                greatest = b;
            }else {
                greatest = c;
            }
        }
        return greatest;
    }
}
