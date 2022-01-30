package com.anil.ds.string;

public class LengthOfLastWord {
    public static void main(String[] args) {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        String word = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord.lengthOfLastWord(word));
    }
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String words[] = s.split(" ");
        return words[words.length-1].length();
    }
}
