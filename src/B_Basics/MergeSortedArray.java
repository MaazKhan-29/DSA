package B_Basics;

import java.util.Arrays;

public class MergeSortedArray {
    static void main() {
        int[] nums1 = {1,2,3,0,0,0,0};
        int[] nums2 = {2,3,5,6};
        int m=3;
        int n=4;
        mergeSortedArray(nums1,m,nums2,n);
    }


    static void mergeSortedArray(int[] nums1,int m,int[] nums2,int n){

        for (int i=0;i<n;i++){
                nums1[m+i]=nums2[i];
        }

        for (int i=0;i<nums1.length;i++){
            for (int j=i+1;j<nums1.length;j++){
                if (nums1[i]>nums1[j]){
                    int temp=nums1[i];
                    nums1[i]=nums1[j];
                    nums1[j]=temp;
                }
            }
        }















        System.out.println(Arrays.toString(nums1));
    }
}
