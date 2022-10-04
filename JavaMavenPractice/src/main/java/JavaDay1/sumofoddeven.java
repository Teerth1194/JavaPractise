package JavaDay1;
import JavaDay1.oddEven;

public class sumofoddeven {

    public static void main(String [] args){
        nthsum(6);
    }


    public static double nthsum(int n){
        int evensum = 0, oddsum = 0;

        for(int i = 0; i<=n;i++) {

            String oddeven = oddEven.oddEvencheck(i);
            if(oddeven.equals("it is even")){
                evensum = evensum+i;
            }
            if(oddeven.equals("it is odd")){
                oddsum = oddsum + i;
            }
        }
//        for (int i=0;i<=n;i++){
//            if(i==1){
//                oddsum = 1;
//            }else if (i==2){
//                evensum = 2;
//            }else if(n%2==0){
//                evensum = evensum+n;
//            }else {
//                oddsum = oddsum+n;
//            }
//        }

        System.out.println(evensum);
        System.out.println(oddsum);

        return 890;
    }

}
