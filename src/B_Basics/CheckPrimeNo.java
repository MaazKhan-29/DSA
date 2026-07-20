package B_Basics;

public class CheckPrimeNo {
    static void main() {
        int num=9;
        System.out.println("Is "+num+" is Prime: "+checkPrime(num));
    }





    static boolean checkPrime(int n){

        boolean status=true;
        for (int i=1;i<=Math.sqrt(n);i++){

            if(i>1&&n%i==0){
                status=false;
            }
        }
        return status;
    }
}
