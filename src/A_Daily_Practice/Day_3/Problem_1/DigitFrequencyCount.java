package A_Daily_Practice.Day_3.Problem_1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DigitFrequencyCount {
    static void main() {
        System.out.println("Frequency in 122 :"+DigitScore(122));
    }


    static int DigitScore(int n){

        int temp=n;
        int m=n;
        int frequency=0;
        int score =0;

        HashMap<Integer,Integer> freq=new HashMap<>();

        while(m>0){

            int d=m%10;
            if(!freq.containsKey(d)){
                while (temp>0){
                    if(d==temp%10){
                        frequency++;
                    }
                    temp=temp/10;
                }
                freq.put(d,frequency);
                score += d*freq.get(d);

            }
            m=m/10;
            temp=n;
            frequency=0;

        }
        return score;
    }

//    class Solution {
//    public int digitFrequencyScore(int n) {
//
//        int[] freq = new int[10];
//
//        while (n > 0) {
//            int digit = n % 10;
//            freq[digit]++;
//            n /= 10;
//        }
//
//        int score = 0;
//
//        for (int i = 0; i < 10; i++) {
//            score += i * freq[i];
//        }
//
//        return score;
//    }
//}
}
