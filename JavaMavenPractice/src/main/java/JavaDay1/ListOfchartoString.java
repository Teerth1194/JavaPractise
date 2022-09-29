package JavaDay1;

public class ListOfchartoString {

    public static void main(String [] args){

        Character ch[] ={'a', 'b', 'c','d','e','f','g','h','i'};
        System.out.println(charstostring(ch));
    }

    public static String charstostring(Character ch[] ){

        String tempstr = "";
        int arraylength = ch.length;

        for(int i = 0; i< arraylength; i++){
            tempstr = tempstr+ch[i];
        }

        return tempstr;

    }
}
