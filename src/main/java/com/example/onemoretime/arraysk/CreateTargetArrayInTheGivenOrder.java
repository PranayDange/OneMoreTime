package com.example.onemoretime.arraysk;

import java.util.ArrayList;
import java.util.List;

public class CreateTargetArrayInTheGivenOrder {
    public static void main(String[] args) {

    }

    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[index.length];
        for(int i =0;i<index.length;i++){
            for(int j =target.length-1;j>index[i];j--){
                target[j] = target[j - 1];
            }
            target[index[i]] = nums[i];


        }
        return target;
    }


   /* public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            target.add(index[i], nums[i]);
        }
        return target.stream().mapToInt(i -> i).toArray();
    }*/

}
