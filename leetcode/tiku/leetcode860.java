package tiku;

import java.util.HashMap;

public class leetcode860 {
    public static void main(String[] args) {
        int[] bills={5,5,10,10,20};
        System.out.println(lemonadeChange(bills));
    }

    public static boolean lemonadeChange(int[] bills) {
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        map.put(5,0);
        map.put(10,0);
        map.put(20,0);
        int i=0;
        for(i=0;i<bills.length;i++){
            if(bills[i]==5){
                map.put(5,map.get(5)+1);
            }
            if(bills[i]==10){
                if(map.get(5)>0){
                    map.put(5,map.get(5)-1);
                    map.put(10,map.get(10)+1);
                }else{
                    break;
                }
            }
            if(bills[i]==20){
                if(map.get(10)>0&&map.get(5)>0){
                        map.put(5,map.get(5)-1);
                        map.put(10,map.get(10)-1);
                }else if(map.get(5)>=3){
                    map.put(3,map.get(3)-3);
                }else{
                    break;
                }
                map.put(20,map.get(20)+1);
            }
        }
        return i==bills.length;
    }
}
