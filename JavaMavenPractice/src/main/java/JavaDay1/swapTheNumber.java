package JavaDay1;

public class swapTheNumber {

    public static void main(String [] args){

        System.out.println(swapnumberwithtemp(13,9));
        System.out.println(swapthenumberwithouttemp(13,9));
    }

    public static String swapnumberwithtemp(int first, int second){

        int first1 = first;
        int second1 = second;
        int temp = second;
        second = first;
        first = temp;
        
        return String.valueOf(first) + String.valueOf(second);
    }

    public static String swapthenumberwithouttemp(int first, int second){

        first = first + second;
        second = first - second;
        first = first - second;

        return String.valueOf(first) + String.valueOf(second);
    }
}
