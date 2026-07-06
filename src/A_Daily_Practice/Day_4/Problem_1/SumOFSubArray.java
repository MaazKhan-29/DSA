package A_Daily_Practice.Day_4.Problem_1;

import java.util.ArrayList;

public class SumOFSubArray {

    static void main() {
        int[] arr={10,11,12};
        sumofOddArr(arr);
    }


        static int sumofOddArr(int[] arr){
            int sum=0;

            for(int i=1;i<=arr.length;i++){
                int counter=0;
                if(i%2!=0)
                {
                    for(int j=1;j<=arr.length;j++){

                        System.out.println(j-1);
                        sum+=arr[j-1];
                        System.out.println("Sum:"+sum+" Counter:"+counter+" j:"+j+" i:"+i);
                        if (i>1){
                            counter++;
                        }
                        if (j>= arr.length){
                            break;
                        }
                        if(j>1&&counter==i){
                            j=j-(i-1);
                            counter=0;
                        }
                    }
                }


            }
            System.out.println(sum);
        return sum;
        }


}
