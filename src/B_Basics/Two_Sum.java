package B_Basics;

import java.util.Arrays;

public class Two_Sum {



    static void main() {
        int[] nums={9,3,61,6};
        int target=9;
        System.out.println("nums:"+Arrays.toString(nums)+" target:"+target+" Output:"+ Arrays.toString(twoSum(nums,target)));
    }


        static int[] twoSum(int[] nums, int target) {
            int[] sum=new int[2];
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]+nums[j]==target){
                        sum[0]=i;
                        sum[1]=j;
                        return sum;
                    }
                }



            }
            return sum;
        }

}
