package com.example.onemoretime.arraysk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountItemsMatchingARule {
    //  Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
    //  Output: 1
    //   Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
    public static void main(String[] args) {

        List<List<String>> arr = new ArrayList<>();
        arr.add(Arrays.asList("phone", "pixel", "blue"));
        arr.add(Arrays.asList("computer", "silver", "lenovo"));
        arr.add(Arrays.asList("phone", "gold", "iphone"));


        String ruleKey = "color";
        String ruleValue = "silver";

        countMatches(arr, ruleKey, ruleValue);

    }


    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;

        if (ruleKey.equals("type")) {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(0).equals(ruleValue)) {
                    ans++;
                }
            }
        } else if (ruleKey.equals("color")) {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(1).equals(ruleValue)) {
                    ans++;
                }
            }

        } else if (ruleKey.equals("name")) {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(0).equals(ruleValue)) {
                    ans++;
                }
            }
        }
        return ans;

    }
}
