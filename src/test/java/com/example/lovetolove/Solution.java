package com.example.lovetolove;

public class Solution {
    public boolean Find(int target, int [][] array) {
        boolean result = false;
        int count = array.length;
        for (int i = 0; i < count; i++) {
            //System.out.println(array[i].length);
            int num = array[i].length;
            for (int j = 0; j < num; j++) {
                System.out.println(array[i][j] );
                if (array[i][j] == target) {
                    result = true;
                }
            }
        }
        return result;
    }
    public static void main(String[] arg){
        int s[][] = new int[2][3];
        //s[0] = new int[2];
        //s[1] = new int[3];
        s[0][0] = 6;
        s[0][1] = 5;
        s[0][2] = 4;
        s[1][0] = 3;
        s[1][1] = 2;
        s[1][2] = 0;
        System.out.println(new Solution().Find(1,s));
        new Solution().Find(1,s);
    }
}