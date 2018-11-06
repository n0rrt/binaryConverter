package binaryConverter;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Convert {
	static int x;
	int remainder = (x / 2);
	
	static ArrayList<Integer> binArr = new ArrayList<Integer>();

	public static void convert() {
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();

		while (x / 2 > 0) {
			if (x % 2 == 1) {
				binArr.add(0, 1);
			} 
			else {
				binArr.add(0, 0);
			}
			x = x / 2;
		}
		if (x == 1) {
			binArr.add(0, 1);
		}
		String output=Arrays.toString(binArr.toArray());
		output= removeChar(output, '[');
		output= removeChar(output, ',');
		output= removeChar(output, ' ');
		output= removeChar(output, ']');
		System.out.println(output);
	}

	public static String removeChar(String s, char c) {

		String r = "";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != c)
				r += s.charAt(i);
		}

		return r;
	}

	public static void main(String args[]) {
		convert();
	}
}
