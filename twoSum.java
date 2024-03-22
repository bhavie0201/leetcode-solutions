import java.util.Scanner;

public class basics {

    public static int[] twoSum(int nums[], int target) {
            int otp[] = {0,1};
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i] + nums[j] == target){
                        otp[0] = nums[i];
                        otp[1] = nums[j];
                        
    
                    }
                }
            }return otp;
        }
    public static void main(String[] args) {
        int target = 9;
        int nums[] = {2,7,11,15};
        
        twoSum(nums, target);
        
        
    }
}
