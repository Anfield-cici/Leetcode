package com.springmvc.leetcode.meiriyiti;

public class leetcode892 {
    public static void main(String[] args) {
        int[][] grid=new int[][]{{1,2},{3,4}};
        surfaceArea(grid);
        System.out.println(grid.length);
        System.out.println(grid[0].length);
    }
    public static int surfaceArea(int[][] grid) {
        if(grid.length==0){
            return 0;
        }
        if(grid.length==1&&grid[0].length==1){
            return grid[0][0]*6-(grid[0][0]-1)*2;
        }
        int row=grid.length;//行数
        int column=grid[0].length;//列数
        int count=0;//正方体的个数
        int count2=0;//竖着重合
        int i;
        int j;
        for(i=0;i<row;i++){
            for(j=0;j<column;j++){
                count=count+grid[i][j];
                if(grid[i][j]>1)
                    count2=count2+grid[i][j]-1;
            }
        }
        System.out.println(count+"----"+count2);
        int count3=0;//左右重合
        for(i=0;i<row;i++){
            for(j=0;j<column-1;j++){
                int temp=grid[i][j]>grid[i][j+1]?grid[i][j+1]:grid[i][j];
                count3=count3+temp;
            }
        }
        System.out.println(count3);
        int count4=0;//前后重合
        for(i=0;i<column-1;i++){
            for(j=0;j<row;j++){
                int temp=grid[i][j]>grid[i+1][j]?grid[i+1][j]:grid[i][j];
                count4=count4+temp;
            }
        }
        System.out.println(count4);
        return count*6-(count2+count3+count4)*2;

    }
}
