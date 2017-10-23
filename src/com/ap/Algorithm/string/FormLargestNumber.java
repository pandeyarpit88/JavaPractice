package com.ap.Algorithm.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by APandey1 on 06-10-2017.
 */
public class FormLargestNumber {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("54");
        list.add("546");
        list.add("548");
        list.add("60");
        FormLargestNumber.formLargestNumberFromStrings(list);
    }

    public static void formLargestNumberFromStrings(List<String> list) {
        /*
        //Prior to java 8
        Collections.sort(list, new Comparator<String>(){
            public int compare(String str1, String str2) {
               return str2.concat(str1).compareTo(str1.concat(str2));
            }
        });*/
        //Java 8 soln
        list.sort((o1, o2)->o2.concat(o1).compareTo(o1.concat(o2)));
        String str = String.join("", list);
        System.out.println(str);
    }
}
