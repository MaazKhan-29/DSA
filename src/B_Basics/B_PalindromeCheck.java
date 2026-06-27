package B_Basics;

public class B_PalindromeCheck {
    static void main() {
        System.out.println("121 is Palindrome? :"+Palidrome(121));
        System.out.println("-121 is Palindrome? :"+Palidrome(-1281));
        System.out.println("10 is Palindrome? :"+Palidrome(-10));
    }

    static boolean Palidrome(int x){


        int xRev=0;
        int xRem=0;
        int temp=x;

        if (x<0){
            return false;
        }

        while(temp>0){
            xRem=temp%10;
            xRev=xRev*10+xRem;
            temp=temp/10;
        }

        if(x==xRev){
            return true;
        }

        return false;
        
    }
}
