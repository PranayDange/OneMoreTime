package com.example.onemoretime.searching.linearsearch;

public class Example1 {
    public static void main(String[] args) {
        //find weather 14 exists in array or not
        int[] arr={18,12,9,14,77,50};
        int target = 14;
        searchArray(arr,target);
      int ans =  returnIndexOfNumberIfFound(arr,target);
        System.out.println(ans);

    }
    static boolean searchArray(int[] arr,int target){
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                flag=true;
                break;
            }
        }

        System.out.println(flag);
       return flag;
    }

    static int returnIndexOfNumberIfFound(int[] arr,int target){
       //check
        if(arr.length==0){
            return -1;
        }
        for (int a = 0; a < arr.length; a++) {
            //check for element at every index  if it is = target
            int element =arr[a];
            if (element==target){
                return a;
            }

        }
        return -1;
    }

}
