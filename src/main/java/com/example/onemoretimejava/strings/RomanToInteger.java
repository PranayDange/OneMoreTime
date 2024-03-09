package com.example.onemoretimejava.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> romanToIntegerMap = new HashMap<>();
        romanToIntegerMap.put('I', 1);
        romanToIntegerMap.put('V', 5);
        romanToIntegerMap.put('X', 10);
        romanToIntegerMap.put('L', 50);
        romanToIntegerMap.put('C', 100);
        romanToIntegerMap.put('D', 500);
        romanToIntegerMap.put('M', 1000);
        int ans = 0;
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            int currentValue = romanToIntegerMap.get(c);
            if (i < charArray.length - 1) {
                char nextChar = charArray[i + 1];
                int nextValue = romanToIntegerMap.get(nextChar);

                // If the current value is less than the next value, subtract the current value
                // from the total (e.g., IV, IX, XL, XC, CD, CM)
                if (currentValue < nextValue) {
                    ans += nextValue - currentValue;
                    // Skip the next character since it has been accounted for
                    i++;
                    continue;
                }
            }
            ans += currentValue;
        }
        return ans;
    }
}
