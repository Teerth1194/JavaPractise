package JavaDay1;

public class ConcateandReverse {

    public static void main(String [] args){

        //System.out.println(concateMe("hello","world"));
        System.out.println(reversetheString(concateMe("hello","world")));

    }

    public static String reversetheString(String str1){

        String tempstr = "";
        for (int i=0;i<str1.length();i++){
            tempstr = str1.charAt(i) + tempstr;
        }
        return tempstr;

    }

    public static String concateMe(String str1, String str2){

        return str1.concat(str2);

    }

}
