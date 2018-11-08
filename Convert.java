package binaryConverter;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Convert {
	static int x;
	int remainder = (x / 2);
	static ArrayList<Integer> binArr = new ArrayList<Integer>();
	static char[] badChars = { ',', ' ', '[', ']' };
	static Character empty = null;

	public static void convert() {
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		while (x > 1) {
			if (x % 2 == 1) {
				binArr.add(0, 1);
			} else {
				binArr.add(0, 0);
			}
			x = x / 2;
		}
		if (x == 1) {
			binArr.add(0, 1);
		}
		String output = Arrays.toString(binArr.toArray());
		output = removeChar(output);
		System.out.println(output);
	}

	public static String removeChar(String s) {
		String r = "";
		for (char c: s.toCharArray()) {
			if (!contains(badChars, c)) {
				r+=c;
			}
		}
		return r;
	}

	public static boolean contains(final char[] array, final char v) {

		boolean result = false;

		for (char i : array) {
			if (i == v) {
				result = true;
				break;
			}
		}

		return result;
	}

	public static void main(String args[]) {
		convert();
	}
}
