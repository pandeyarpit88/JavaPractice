package com.ap.company.interview.athena;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by APandey on 22-03-2017.
 */
@SuppressWarnings("ALL")
public class FirstRepeatedWord {
	static String firstRepeatedWord(String s) {
		String delimiters = "\\s+|\\t+|,\\s*|:\\s*|;\\s*|-\\s*|\\.\\s*";
		String strArr[] = s.split(delimiters);
		Set<String> set  = new HashSet<String>();
		for(String str: strArr) {
			if (!str.isEmpty()) {
				if (set.contains(str.trim())) {
					return str.trim();
				} else {
					set.add(str.trim());
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		FirstRepeatedWord.firstRepeatedWord("arpit pandey pandey; \t naman .. naman  ");
	}
}
