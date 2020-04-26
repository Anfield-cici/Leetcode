package tiku;

public class mianshiti51 {
    public static void main(String[] args) {

    }
    public int reversePairs(int[] nums) {
        return  merge(nums,0,nums.length-1);
    }

    public int merge(int[] arr,int start,int end){
        if(start==end) return 0;
        int mid=(start+end)/2;
        int count= merge(arr,start,mid)+merge(arr,mid+1,end);



        int[] temp=new int[end-start+1];
        int i=start;
        int j=mid+1;
        int k=0;
        while(i<=mid&&j<=end){
            count += arr[i] <= arr[j] ? j - (mid + 1) : 0;
            temp[k++]=arr[i]>arr[j]?arr[j++]:arr[i++];
        }
        while(i<=mid){
            count += j - (mid + 1);
            temp[k++]=arr[i++];
        }
        while(j<=end){
            temp[k++]=arr[j++];
        }
        System.arraycopy(temp, 0, arr, start, end - start + 1);
        return count;
    }
}
