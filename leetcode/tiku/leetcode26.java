package tiku;

/**
 * 双指针
 */
public class leetcode26 {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int i=0,j=0;
        for(i=0;i<nums.length-1;i++){
          if(nums[i]==nums[i+1]){
              j=i;
              break;
          }
        }
        if(i== nums.length){
            return nums.length;
        }
        for(i=j+1;i<nums.length;i++){
            if(nums[i]>nums[j]){
                ++j;
                nums[j]=nums[i];

            }
        }
        for(i=0;i<j+1;i++){
            System.out.println(nums[i]);
        }
        return j+1;
    }
}
