package com.example.lovetolove;

public class Solution2 {
    public String replaceSpace(StringBuffer str) {
        char[] chara = str.toString().toCharArray();
        String result ="";
        for (int i=0;i<str.length();i++) {
            String tmp = String.valueOf(chara[i]);
            System.out.println(tmp+"==");
            if(tmp.equals(" ")){
                result+="%20";
                System.out.println(result+"***");
            }else {
                result +=tmp;
            }
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] arg){
        StringBuffer str = new StringBuffer("We Are Happy");
        new Solution2().replaceSpace(str);
    }
}