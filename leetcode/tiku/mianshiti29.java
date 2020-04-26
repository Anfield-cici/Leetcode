package tiku;


import java.util.Arrays;

public class mianshiti29 {

    public static void main(String[] args) {
        int[][] matrix={{7},{9},{6}};
        System.out.println(Arrays.toString(spiralOrder(matrix)));
    }
    public static int[] spiralOrder(int[][] matrix) {
        int[] result=new int[0];
        if(matrix.length==0){
            return result;
        }
        int row=matrix.length;
        int column=matrix[0].length;
         result=new int[row*column];
        if(matrix.length==0){
            return result;
        }
        int start=0;
        int k=0;
        int i=0,j=0;
        int min=Math.min(matrix.length,matrix[0].length);
        while(start<=(min-1)/2){
           i=start;
           j=start;
           int zuo=i;
           int shang=j;
           while(j<column){
               result[k++]=matrix[i][j];
               j++;
           }
           i++;
           if(i>=row){
               break;
           }
           j--;


           while(i<row){
               result[k++]=matrix[i][j];
               i++;
           }
           j--;
           if(j<zuo){
               break;
           }
           i--;



           while(j>=zuo){
               result[k++]=matrix[i][j];
               j--;
           }
           j++;
           i--;
           while(i>shang){
               result[k++]=matrix[i][j];
               i--;
           }
           start++;
           column--;
           row--;
        }
        return result;
    }
}
