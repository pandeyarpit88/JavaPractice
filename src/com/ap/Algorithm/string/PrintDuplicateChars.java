package com.ap.Algorithm.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by APandey on 19-04-2017.
 */
public class PrintDuplicateChars {

	public static void printDuplicateChars(String str) {
		Map<Character, Integer> map = new HashMap<>();
		//Find count
		for(Character ch : str.toCharArray()) {
			int count = 0;
			if(map.containsKey(ch)) {
				count = map.get(ch);
			}
			map.put(ch, ++count);
		}
		//print duplicates
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() > 1)
				System.out.println(entry.getKey()  + " count => "  + entry.getValue());
		}
	}

	public static void main(String[] args) {
		String str = "geeksforgeeks";
		PrintDuplicateChars.printDuplicateChars(str);
	}
}
