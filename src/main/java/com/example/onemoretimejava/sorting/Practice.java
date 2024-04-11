package com.example.onemoretimejava.sorting;

public class Practice {
    public static void main(String[] args) {
        int[] g = {1, 2};
        int[] s = {1, 2, 3};
        int contentChildren = findContentChildren(g, s);
        System.out.println(contentChildren);
    }

    public static int findContentChildren(int[] g, int[] s) {
        int ans = 0;
        boolean[] cookiesUsed = new boolean[s.length];
        for (int i = 0; i < g.length; i++) {

            for (int j = 0; j < s.length; j++) {
                if (!cookiesUsed[j] && g[i] == s[j]) {
                    ans++;
                    cookiesUsed[j] = true;

                    break;
                }
            }

        }
        return ans;
    }
}
