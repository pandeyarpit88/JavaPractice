package com.ap.company.interview.jcpenny;

import java.util.*;

/**
 * Created by apandey1 on 12-07-2017.
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Q1.dif(null);
    }

    static int diff(String skills) {
        if (skills == null) {
            return 0;
        }

        assert skills.length() > 5 && skills.length() < 5*100000;
        char[] arr = skills.toCharArray();
        Arrays.sort(arr);
        char[] charecters = {'b', 'c', 'm', 'p', 'z' };
        int count =0;
        int lowestCount = 0;
        int i=0;
        for(char ch : arr) {
            if(charecters[i] == ch) {
                count++;
            } else {
                //if(lowestCount < )
            }
        }
        return 0;
    }

    static int dif(String skills) {
        if (skills == null) {
            return 0;
        }
        Set<Character> set = new HashSet<>(Arrays.asList('p', 'c', 'm', 'b', 'z'));



        assert skills.length() > 5 && skills.length() < 5*100000;
        char[] arr = skills.toCharArray();
        char[] charecters = { 'p', 'c', 'm', 'b', 'z' };
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : arr) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }
        int lowestCount = 0;
        boolean first = true;
        for (char ch : charecters) {
            System.out.println(ch + " - " + map.get(ch));
            if (map.containsKey(ch)) {
                if (first)
                    lowestCount = map.get(ch);
                else if (lowestCount > map.get(ch)) {
                    lowestCount = map.get(ch);
                }
            } else {
                return 0;
            }
        }
        return lowestCount;
    }


}

