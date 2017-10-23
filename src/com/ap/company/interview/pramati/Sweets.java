package com.ap.company.interview.pramati;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by APandey1 on 19-09-2017.
 */
public class Sweets {
    public static String sweet(String[] arr) {
        Map<String, Integer> treeMap = new TreeMap<>();
        for(String str : arr) {
            if(treeMap.containsKey(str)) {
                treeMap.put(str, treeMap.get(str) +1);
            } else
                treeMap.put(str, 1);
        }
        String str = "";
        int count=0;
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            if(count <= entry.getValue()){
                str = entry.getKey();
                count = entry.getValue();
            }
        }
        return str;
    }

    public static void main(String[] args) {
        String arr[] = {"Gulab-jamun", "Laddu", "Jalebi", "Barfi", "Laddu", "Gulab-jamun", "Gulab-jamun",
                "Jalebi", "Gajar-halwa", "Gajar-halwa", "Barfi", "Gajar-halwa"};
        System.out.println(sweet(arr));
    }
}
