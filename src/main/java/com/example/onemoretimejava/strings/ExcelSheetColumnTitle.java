package com.example.onemoretimejava.strings;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        int columnNumber = 28;
        System.out.println(convertToTitle(columnNumber));
    }

    public static String convertToTitle(int columnNumber) {
        String ans="";
       // StringBuilder ans = new StringBuilder();
        while (columnNumber > 0) {
            int remainder = (columnNumber - 1) % 26;
            ans = (char) ('A' + remainder) + ans;
            //for using stringbuilder
          //  ans.insert(0, (char) ('A' + remainder));
            columnNumber = (columnNumber - 1) / 26;
        }
        return ans.toString();
    }
}
