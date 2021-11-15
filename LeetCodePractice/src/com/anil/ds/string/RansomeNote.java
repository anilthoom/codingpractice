package com.anil.ds.string;

//https://leetcode.com/problems/ransom-note/
public class RansomeNote {
    public static void main(String[] args) {
        RansomeNote ransomeNote = new RansomeNote();
        System.out.println(ransomeNote.canConstructOptimal("xmaxp", "studioxamax"));
    }
    public boolean canConstructOptimal(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            arr[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if(--arr[ransomNote.charAt(i)-'a'] < 0) {
                return false;
            }
        }
        return true;
    }
    public boolean canConstruct(String ransomNote, String magazine) {
        int charsRansomeNote[] = new int[128];
        int charsMagazine[] = new int[128];
        for(int i = 0; i<ransomNote.length(); i++){
            char c = ransomNote.charAt(i);
            charsRansomeNote[c]++;
        }
        for(int i = 0; i<magazine.length(); i++){
            char c = magazine.charAt(i);
            charsMagazine[c]++;
        }
        for(int i=0; i<ransomNote.length(); i++){
            char c = ransomNote.charAt(i);
            if(charsRansomeNote[c] > charsMagazine[c])
                return false;
        }
        return true;
    }
}
