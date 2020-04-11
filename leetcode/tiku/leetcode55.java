package tiku;

public class leetcode55 {

    public static void main(String[] args) {

    }
    public boolean canJump(int[] nums) {
        int lastpos= nums.length-1;
        int i;
        for(i=nums.length-2;i>=0;i--){
            if(nums[i]+i>=lastpos){
                lastpos=i;
            }
        }
        return nums[0]>lastpos;
    }
}




