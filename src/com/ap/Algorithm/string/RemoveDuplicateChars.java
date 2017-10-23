package com.ap.Algorithm.string;

import java.util.LinkedHashSet;

/**
 * Created by APandey on 19-04-2017.
 */
public class RemoveDuplicateChars {
	/* Function removes duplicate characters from the string */
	void removeDuplicates(String str)
	{
		LinkedHashSet<Character> lhs = new LinkedHashSet<>();
		for(int i=0;i<str.length();i++)
			lhs.add(str.charAt(i));

		// print string after deleting duplicate elements
		for(Character ch : lhs)
			System.out.print(ch);
	}

	/* Driver program to test removeDuplicates */
	public static void main(String args[])
	{
		String str = "geeksforgeeks";
		RemoveDuplicateChars r = new RemoveDuplicateChars();
		r.removeDuplicates(str);
	}
}
