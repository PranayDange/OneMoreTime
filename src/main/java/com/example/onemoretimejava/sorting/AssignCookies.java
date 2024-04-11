package com.example.onemoretimejava.sorting;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] g = {1, 2};
        int[] s = {1, 2, 3};
        System.out.println(findContentChildren(g, s));
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int contentChildren = 0;
        boolean[] used = new boolean[s.length]; // To keep track of used cookies

        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (!used[j] && s[j] >= g[i]) { // If cookie is not used and satisfies greed factor
                    contentChildren++;
                    used[j] = true;
                    break; // Move to the next child
                }
            }
        }
        return contentChildren;
    }


    public static int findContentChildrennn(int[] g, int[] s) {
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
