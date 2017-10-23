package com.ap.Algorithm.string;

import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Created by APandey1 on 05-10-2017.
 */
public class RevStringByWords {
    public static void main(String[] args) {
        String s = "hello world how r u?";
        Stack<String> st = new Stack<>();
        StringTokenizer tokenizer = new StringTokenizer(s, " ");
        while(tokenizer.hasMoreElements()){
            st.push(tokenizer.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        while (!st.empty()) {
            sb.append(st.pop() + " ");
        }
        System.out.println(sb.toString());
    }
}
