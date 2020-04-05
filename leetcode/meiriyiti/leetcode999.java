package com.springmvc.leetcode.meiriyiti;

public class leetcode999 {
    public static void main(String[] args) {

        for(int i=1;i<20;i++){
            for(int j=1;j<20;j++){
                for(int k=1;k<20;k++){
                    if(i+j+k==20&&(16*i+21*j+24*k==374)){
                        System.out.println(i+"----"+j+"-----"+k);
                    }
                }
            }
        }

    }

    public int numRookCaptures(char[][] board) {
        int i=0;
        int j=0;
        int row = 0;
        int column=0;
       int count=0;
        for(i=0;i<board.length;i++){
            for(j=0;j<board.length;j++){
                if(board[i][j]=='R'){
                    row=i;
                    column=j;
                    break;
                }
            }
            if(j<board.length)
                break;
        }
        for(j=column;j<8&&board[row][j]!='B';j++){
            if(board[row][j]=='p'){
                count++;
                break;
            }
        }
        for(j=column;j>-1&&board[row][j]!='B';j--){
            if(board[row][j]=='p'){
                count++;
                break;
            }
        }
        for(j=row;j>-1&&board[j][column]!='B';j--){
            if(board[j][column]=='p'){
                count++;
                break;
            }
        }
        for(j=row;j<8&&board[j][column]!='B';j++){
            if(board[j][column]=='p'){
                count++;
                break;
            }
        }

       return count;
    }
}
