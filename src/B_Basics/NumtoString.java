package B_Basics;

import java.math.BigInteger;
import java.util.Arrays;

public class NumtoString {
    static void main() {
        String num1="498828660196";
        String num2="840477629533";
        System.out.println("Input num1: "+num1+" num2: "+num2);
        System.out.println("Output: "+multiply(num1,num2));
        System.out.println(stringtoInt("1234"));
        System.out.println(('5'-'0')*('1'-'0'));
    }

    static String multiply(String num1, String num2) {


//            long Num1=stringtoInt(num1);
//            long Num2=stringtoInt(num2);
//
//        System.out.println(Num1);
//        System.out.println(Num2);


//        return String.valueOf(Num1*Num2);



        int j=1;
        BigInteger[] array=new BigInteger[100];
        for (int i=0;i<num2.length();i++){
            BigInteger temp1=BigInteger.valueOf(stringtoInt(num1));
            BigInteger temp2=BigInteger.valueOf(Character.getNumericValue(num2.charAt(i)));
            array[i]=temp1.multiply(temp2).multiply(BigInteger.valueOf(j));
            System.out.println("num1: " +temp1+"  num["+i+"]: "+temp2);
            j=j*10;
            System.out.println("Array["+i+"]: "+array[i]);
        }















        return "s";
    }

    static long stringtoInt(String num){

        long Num=0;

        for(int i=0;i<num.length();i++){
            Num+=Character.getNumericValue(num.charAt(i));
            if(i==num.length()-1){
                return Num;
            }
            Num*=10;
        }

        return Num;
    }
}
