package com.ap.company.interview.cleartrip;

import java.util.HashMap;
import java.util.Map;

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
        Map<String, Integer> map = new HashMap<>();
        for(String s : words)
            map.put(s, 0);

        for(String word : words) {
            int curValue = findNextWord(map, word, 0);
            result = result>curValue ? result : curValue;
        }
        return result;
    }

    static int longestChaninLength =0;

    static int findNextWord(Map<String, Integer> map, String word, int counter) {
        if(!map.containsKey(word))
            return 0;
        longestChaninLength = ++counter;
        for(int i = 0; i < word.length(); i++) {
            StringBuilder sb = new StringBuilder(word);
            sb.delete(i, i + 1);
            if(map.containsKey(sb.toString()) && map.get(sb.toString())!=0) {
                if(map.get(sb.toString())> longestChaninLength) {
                    longestChaninLength = map.get(sb.toString());
                }
            } else {
                int num = findNextWord(map, sb.toString(), counter);
                map.put(sb.toString(), num);
            }
        }
        return longestChaninLength;
    }
}
