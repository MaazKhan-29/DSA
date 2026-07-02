package Day_1;

public class ReverseTheInteger {

    static void main() {

        System.out.println("signed: " + reverse(-2147483648));
    }

    static int reverse(int x) {


        int sign = 1;

        if (x<0) {
            sign = -1;
            x = x * sign;

        }

        String strX = Integer.toString((int) x);
        int length = strX.length();
        String reversedX = "";


        for (int i = length - 1; i >= 0; i--) {

            if (strX.charAt(i) == '-') {
                continue;
            }

            reversedX += strX.charAt(i);
        }
        long revX = Long.parseLong(reversedX);



        if (revX < -((int) Math.pow(2, 31)) || revX > ((int) Math.pow(2, 31) - 1)) {
            return 0;
        }

            return (int) revX * (int)sign;


//        int xRem;
//        int xRev=0;
//        int sign=1;
//
//        if(x<0){
//            sign=-1;
//            x=x*sign;
//        }
//
//
//        System.out.println("Original: "+x);
//        int i=0;
//        while (x>0) {
//            xRem = x % 10;
//            System.out.println("Remainder:"+i+":"+xRem);
//            xRev =xRev*10+ xRem;
//            System.out.println("Reversed:"+i+":"+xRev);
//            x = x/10;
//            System.out.println("x after x=x/10:"+x);
//        }
//
//        if(xRev< -((int)Math.pow(2,31))||xRev>((int)Math.pow(2,31)-1)){
//            return 0;
//        }
//
//
//
//        return xRev*sign;











//
//
//        int reminder;
//        int reverse = 0;
//
//        while (x != 0) {
//
//            reminder = x % 10;
//
//            if (reverse > Integer.MAX_VALUE / 10 ||
//                    (reverse == Integer.MAX_VALUE / 10 && reminder > 7)) {
//                reverse = 0;
//                break;
//            }
//
//            if (reverse < Integer.MIN_VALUE / 10 ||
//                    (reverse == Integer.MIN_VALUE / 10 && reminder < -8)) {
//                reverse = 0;
//                break;
//            }
//
//            reverse = reverse * 10 + reminder;
//            x = x / 10;
//        }
//
//        System.out.println("Reversed Number: " + reverse);
//
//        return false;


    }
    }

