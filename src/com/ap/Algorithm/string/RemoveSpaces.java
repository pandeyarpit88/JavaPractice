package com.ap.Algorithm.string;

import java.util.Scanner;

/**
 * Created by APandey on 06-04-2017.
 */
public class RemoveSpaces {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		System.out.println(removeSpaces(line));
	}

	public static String removeSpaces(String line) {
		StringBuilder builder = new StringBuilder();
		for(char c : line.toCharArray()) {
			if(c != ' ')
				builder.append(c);
		}
		return builder.toString();
	}
}
