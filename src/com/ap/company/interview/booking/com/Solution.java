package com.ap.company.interview.booking.com;

import java.util.*;

/**
 * Created by apandey1 on 12-07-2017.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCurrentServiceExecutive = scanner.nextInt();
        int numberOfDataPoints = scanner.nextInt();
        TreeMap<Long,Long> treeMap = new TreeMap<>();
        for(int i =0; i<numberOfDataPoints; i++) {
            Long startTime = scanner.nextLong();
            Long endTime = scanner.nextLong();
            treeMap.put(startTime, endTime);
        }

        Long start = null;
        Long end = null;
        int reqExecAtATime = 1;

        int result = 1;
        int i = 1, j = 0;
        for(Map.Entry<Long,Long> entry : treeMap.entrySet()) {
            if(start == null) {
                start = entry.getKey();
                end = entry.getValue();
            } else {
                if(entry.getKey() < end) {
                    //overlap
                    reqExecAtATime++;
                    i++;
                    if (reqExecAtATime > result)  // Update result if needed
                        result = reqExecAtATime;
                } else {
                    reqExecAtATime--;
                }
            }

        }
        System.out.println(reqExecAtATime - numberOfCurrentServiceExecutive + 1);
    }
}
