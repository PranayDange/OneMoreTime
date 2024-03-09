package com.example.onemoretimejava.strings;

public class RobotReturnToOrigin {
    public static void main(String[] args) {
        String moves = "UD";
        System.out.println(judgeCircle(moves));
    }

    public static boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        boolean ans;
        for (int i = 0; i < moves.length(); i++) {
            char ch = moves.charAt(i);
            if (ch == 'U') {
                y++;
            } else if (ch == 'D') {
                y--;
            } else if (ch == 'L') {
                x--;
            } else if (ch == 'R') {
                x++;
            }
        }
        ans = x == 0 && y == 0;
        return ans;
    }
}
