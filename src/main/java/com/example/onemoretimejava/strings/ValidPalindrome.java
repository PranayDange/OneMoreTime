package com.example.onemoretimejava.strings;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        // Convert to lowercase and remove non-alphanumeric characters
        String cleanS = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        // Compare the string with its reverse
        return cleanS.equals(reverseString(cleanS));
    }

   /* public static boolean isPalindrome(String s) {
        String[] split = s.split("[ :,]+");
        //String[] split = s.split("[ :]+");
        String printerrr = "";
        for (int i = 0; i < split.length; i++) {
            printerrr = printerrr + split[i];
        }

        String s1 = reverseString(printerrr);
        System.out.println(s1);
        if (s1.trim().equals(printerrr.trim())) {
            return true;
        }
        return false;

    }*/

    private static String reverseString(String printerrr) {
        String cleanS = printerrr.toLowerCase().replaceAll("[^a-z0-9]", "");

        char[] charArray = cleanS.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        String s = new String(charArray);
        return s;

    }
   /* private static String reverseString(String s) {
        char[] charArray = s.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }*/
    public static boolean isPalindrome1(String s) {
        // Convert the string to lowercase and remove non-alphanumeric characters
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        // Check if the string is a palindrome
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
