package com.example.onemoretimejava.arrays;

public class MaxItemInArray {
    public static void main(String[] args) {
        int[] arr={1,2,17,1,5,4};
        maxItem(arr);
    }
    public static void maxItem(int[] arr){
        int maxxx=arr[0];
        for(int i =0;i<arr.length;i++){
           if(arr[i]>maxxx){
               maxxx=arr[i];
           }
        }
        System.out.println(maxxx);
    }
}
