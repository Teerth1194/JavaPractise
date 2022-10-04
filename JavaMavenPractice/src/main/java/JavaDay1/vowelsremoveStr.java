package JavaDay1;

public class vowelsremoveStr {

    public static void main(String [] args){

        System.out.println(vowelsremover("what is your name ?"));
    }

    public static String vowelsremover(String str1){


        return str1.replaceAll("([aAeEiIoOuU])", "");

    }

}
