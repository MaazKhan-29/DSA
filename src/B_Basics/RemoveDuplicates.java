package B_Basics;

import java.util.Arrays;

public class RemoveDuplicates {
    static void main() {
        int[] arr={1,1,2};
        System.out.println(removeDuplicates(arr));
    }

    static int removeDuplicates(int[] nums) {
        int k=0;
        int[] expectedNums= new int[nums.length];

        for(int i=0;i<nums.length;i++){

            if(i!=0&&nums[i]!=nums[i-1]){
                expectedNums[k]=nums[i];
                k++;
            }else if(i==0){
                expectedNums[i]=nums[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(expectedNums));
        return k;
    }
}
