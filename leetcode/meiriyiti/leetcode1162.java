package com.springmvc.leetcode.meiriyiti;



class Queue{
     int x;
     int y;
     int temp;
}

public class leetcode1162 {
    public static void main(String[] args) {


        int[][] grid={{1,0,0,0,0,1,0,0,0,1},{1,1,0,1,1,1,0,1,1,0},{0,1,1,0,1,0,0,1,0,0},{1,0,1,0,1,0,0,0,0,0},{0,1,0,0,0,1,1,0,1,1},{0,0,1,0,0,1,0,1,0,1},{0,0,0,1,1,1,1,0,0,1},{0,1,0,0,1,0,0,1,0,0},{0,0,0,0,0,1,1,1,0,0},{1,1,0,1,1,1,1,1,0,0}};
        System.out.println(maxDistance(grid));
    }


    public static int maxDistance(int[][] grid) {
        int max=-1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    max=Math.max(max,find(i,j,grid));
                }
            }
        }
        return max;
    }



    public static int find(int x,int y,int[][] grid){
        if(grid==null){
            return -1;
        }
        if(x>grid.length||x<0||y>grid[0].length||y<0){
            return -1;
        }

        int rear=0;
        int front=0;
        Queue[] queue=new Queue[10000];


        int dx[] = {-1, 0, 1, 0};int dy[] = {0, 1, 0, -1};
        int[][] visit=new int[100][100];
        queue[rear]=new Queue();
       queue[rear].temp=grid[x][y];
       queue[rear].x=x;
       queue[rear].y=y;

        visit[x][y]=1;
        rear++;


        while(rear!=front){
            Queue q=queue[front++];
            int nx,ny;
            for(int i=0;i<4;i++){
               nx = q.x+ dx[i];
               ny =q.y+ dy[i];
               if ((nx >= 0 && nx <grid.length && ny >= 0 && ny < grid[0].length )) {
                   if(visit[nx][ny]==0){
                       queue[rear]=new Queue();
                       queue[rear].temp=grid[nx][ny];
                       queue[rear].x=nx;
                       queue[rear].y=ny;
                        visit[nx][ny] = 1;
                       if (grid[nx][ny] == 1) {
                           return Math.abs(nx-x)+Math.abs(ny-y);
                       }
                        rear++;

                    }
               }

           }
       }
       return -1;
    }

}
