package com.example.onemoretimejava.search;

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] chArr = {'c', 'f', 'j' };
        char target = 'a';
        nextGreatestLetterBruteforce(chArr, target);
        char[] letters2 = {'c', 'f', 'j' };
        char target2 = 'c';
        System.out.println(nextGreatestLetterBruteforce(letters2, target2));  // Output: 'f'

    }

    public static char nextGreatestLetterBruteforce(char[] letters, char target) {

        for (char letter : letters) {
            if (letter > letter) {
                return letter;
            }

        }
        return letters[0];
    }

    public static char nextGreatestLetterOptimized(char[] letters, char target) {
        int left = 0;
        int right = letters.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (letters[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        // If 'left' is equal to the length of the array, wrap around to the beginning
        return left == letters.length ? letters[0] : letters[left];
    }

}
