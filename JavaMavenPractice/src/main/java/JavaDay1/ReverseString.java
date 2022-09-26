package JavaDay1;

public class ReverseString {

    public static void main (String[] args){

        String inputstring = "ReversE";
        String s = inputstring;
        String reverse = "";
        Character c ;
        int counter = 0;

        for (int i=0;i<s.length();i++){
            c = inputstring.charAt(i);
            reverse = c+reverse;

//            reverse = reverse.concat(s.substring(i));
//            s = s.replace(s.substring(counter),"");
//            counter+=1;
        }

        System.out.println(reverse);
    }

}
