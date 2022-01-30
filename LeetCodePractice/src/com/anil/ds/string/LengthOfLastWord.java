package com.anil.ds.string;

public class LengthOfLastWord {
    public static void main(String[] args) {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        String word = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord.lengthOfLastWord(word));
    }
    public int lengthOfLastWord(String s) {
        s = s.trim();
        System.out.println(s+"---");
        String words[] = s.split(" ");
        return -1;
    }
}
