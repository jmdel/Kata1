package xjmfr.kataone;

import java.util.StringTokenizer;

public class StringCalculator {

	public int add(String stringSequence) {
		int res = 0;
		char separator = ','; // General default separator
		if (stringSequence.startsWith("//")) {// Search a change of separator
			separator = stringSequence.charAt(2); // Catch separator
			stringSequence = stringSequence.substring(3);// Cut the fist part to get an computable sequence in String
		}

		stringSequence = stringSequence.replace('\n', separator);// Generalize separator for \n

		StringTokenizer stringTokenizer = new StringTokenizer(stringSequence, String.valueOf(separator));

		while (stringTokenizer.hasMoreElements()) {
			int token = Integer.parseInt(stringTokenizer.nextToken());
			if (token < 0) { // throws an exception if negative
				throw new RuntimeException("Negative value not allowed");
			}
			if (token <= 1000) {
				res += token;
			}
		}
		return res;
	}

}
