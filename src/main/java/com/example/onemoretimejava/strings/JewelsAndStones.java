package com.example.onemoretimejava.strings;

public class JewelsAndStones {
    public static void main(String[] args) {
       /* Input: jewels = "aA", stones = "aAAbbbb"
        Output: 3*/
        String jewels = "z";
        String stones = "ZZ";
        numJewelsInStones(jewels, stones);
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
        for (int i = 0; i < jewels.length(); i++) {
            int count = 0;
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i) == stones.charAt(j)) {
                    ans++;
                }
            }
            //ans = count;
        }
        System.out.println(ans);
        return ans;
    }
}
