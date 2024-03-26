import java.util.*;
class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int arr[] = new int[m+n];
        for(int i =0; i<m ; i++){
            arr[i] = nums1[i];
        }
        for(int i=0; i<n; i++){
            arr[m+i]=nums2[i];
        }
        Arrays.sort(arr);
        //System.out.println(arr);
        int l = arr.length;
        if(l%2==0){
            double o = (arr[(l-1)/2]+arr[(l+1)/2]);
            o = o/2;
            return o;
        }
        else{
            double o = (arr[(l-1)/2]);
            return o;
        }
        
    }
    public static void main(String[] args){
        int nums1[] = {1,3};
        int nums2[] = {2,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}