package tiku;

public class leetcode300 {
    public static void main(String[] args) {
        int[] nums={4,10,4,3,8,9};
        System.out.println(lengthOfLIS(nums));
    }




    public static int lengthOfLIS(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int[] result=new int[nums.length];
        int i=0;
        result[i++]=nums[0];
        for(int j=1;j<nums.length;j++){
            if(nums[j]>result[i-1]){
                result[i++]=nums[j];
            }else if(nums[j]<result[i-1]){
                result=binarySerach(nums[j],result,i-1);
            }
        }
        return i;

    }
    public static int[] binarySerach(int tar,int[] result,int n){
        int left=0;
        int right=n;

        while(left<right){
            int mid=(left+right)/2;
            if(result[mid]>tar){
                right=mid-1;
            }else if(result[mid]<tar){
                left=mid+1;
            }else{
                break;
            }
        }
        if(left>=right){
            if(result[left]>tar){
                result[left]=tar;
            }else{
                result[left+1]=tar;
            }
        }

        return result;
    }
}
