package tiku;

public class leetcode461 {
    public static void main(String[] args) {
        System.out.println(hammingDistance(2,5));
    }

    public static int hammingDistance(int x, int y) {
         return Integer.bitCount(x^y);
    }
}
