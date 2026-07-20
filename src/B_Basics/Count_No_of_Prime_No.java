package B_Basics;

public class Count_No_of_Prime_No {
    static void main() {
        int n=10000;
        System.out.println(countPrimes(n));
    }

    static int countPrimes(int n) {
        int count=0;
        for(int i=1;i<n;i++){

            if(i>1&&checkPrime(i)){
                count++;
            }

        }
        return count;
    }

    static boolean checkPrime(int n){


        if (n<=1){
            return false;
        }

        for (int i=2;i<=Math.sqrt(n);i++){

            if(n%i==0){
                return false;
            }
        }
        return true;
    }

}
