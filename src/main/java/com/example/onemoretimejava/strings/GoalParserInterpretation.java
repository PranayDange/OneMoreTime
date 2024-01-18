package com.example.onemoretimejava.strings;

public class GoalParserInterpretation {
    public static void main(String[] args) {
        String command = "G()(al)";
        System.out.println(interpret(command));
    }

    public static String interpret(String command) {
       /* String newAns = command.replace("()", "o");
       String ans = newAns.trim("()");
        StringBuilder ss=new StringBuilder();
        ss=
        return ans;*/
        return command.replaceAll("[(][a][l][)]", "al").replaceAll("[(][)]", "o");

    }
}
