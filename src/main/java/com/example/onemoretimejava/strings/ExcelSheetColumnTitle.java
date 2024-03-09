package com.example.onemoretimejava.strings;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        int columnNumber = 28;
        System.out.println(convertToTitle(columnNumber));
    }

    public static String convertToTitle(int columnNumber) {
        String ans = "";
        while (columnNumber > 0) {
            int remainder = (columnNumber - 1) % 26;
            ans = (char) ('A' + remainder) + ans;
            columnNumber = (columnNumber - 1) / 26;
        }
        return ans;
    }
}
