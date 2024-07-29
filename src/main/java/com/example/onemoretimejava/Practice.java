package com.example.onemoretimejava;

import java.util.Arrays;


public class Practice {
    public static void main(String[] args) {
        // int[] arr = {5, 4, 3, 2, 1};
        // int[] arr = {1, 2, 3, 4, 5};
        //int[] arr = {1, 2, 3, 5, 4};
       /* int[] arr = {4, 5, 6, 7, 8, 4, 5};
        // bubbleSort(arr);
        bubbleSort2(arr);
        System.out.println(Arrays.toString(arr));*/
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));

    }


    public static void bubbleSort2(int[] arr) {
        int n = arr.length - 1;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);

                } else {
                    break;
                }
            }

        }



    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    public static boolean checkIfPangram(String sentence) {
        boolean isAnagram = false;
        for(int i=0;i<sentence.length();i++){
            char ca = sentence.charAt(i);
            for(char c = 'A';c<'Z';c++){
                if (ca == c) {
                    isAnagram = true;
                    break;
                }
            }
        }
        return isAnagram;
    }
}





