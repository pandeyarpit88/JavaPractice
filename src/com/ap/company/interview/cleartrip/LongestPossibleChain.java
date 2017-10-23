package com.ap.company.interview.cleartrip;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by APandey1 on 16-10-2017.
 */
public class LongestPossibleChain {
    public static void main(String[] args) {
        //String[] words = new String[]{"bdcafg", "bdcaf","a", "b", "ba", "bca", "bda", "bdca"};
        String[] words = new String[]{"a", "b", "ba", "bca", "bda", "bdca"};

        int longestChain = longestChain(words);
        System.out.println("longestChain " + longestChain);
    }

    static int longestChain(String words[]) {
        int result = 0;
        Set<String> set = new HashSet<>();
        for(String s : words)
            set.add(s);

        for(String word : words) {
            int curValue = findNextWord(set, word, 0);
            result = result>curValue?result:curValue;
        }
        return result;
    }

    static int longestChaninLength =0;

    static int findNextWord(Set<String> set, String word, int counter) {
        if(!set.contains(word))
            return 0;
        longestChaninLength = ++counter;
        for(int i = 0; i < word.length(); i++) {
            StringBuilder sb = new StringBuilder(word);
            sb.delete(i, i + 1);
            findNextWord(set, sb.toString(), counter);
        }
        return longestChaninLength;
    }

}
