package B_Basics;

import java.util.Arrays;

public class Move_Zeroes {
    static void main() {
        int[] nums={0,1,0,0,3,4,0,7};
        System.out.println(Arrays.toString(moveZeros(nums)));

    }

    static int[] moveZeros(int[] nums){

        int zeroCount=0;

        for (int i=0;i<nums.length;i++){
            if (nums[i]==0){
                zeroCount++;
                continue;
            }
                nums[i - zeroCount] = nums[i];
            if (i!=(i-zeroCount)) {
                nums[i] = 0;
            }
            System.out.println("zeroCount: "+zeroCount);
            System.out.println(Arrays.toString(nums));
        }

        return nums;
    }
}
