package JavaDay1;

public class palindrome {
    public static void main (String[] args){
        int palindrom = 899783;
        int number = palindrom;
        int temp=0 ;
        while(number>0){
            temp = (temp*10)+ number%10;
            number = number/10;
        }

        if (temp==palindrom){
            System.out.println("Given number is palindrome");
        }
        if (temp!=palindrom){
            System.out.println("Given number is not palindrome");
        }

        System.out.println(temp);
    }

}
