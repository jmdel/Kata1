package xjmfr.kataone;

import java.util.StringTokenizer;

public class StringCalculator {

	public int add(String str) {
		int res = 0;
		char separator = ','; // General default separator
		if (str.startsWith("//")) {// Search a change of separator
			separator = str.charAt(2); // Catch separator
			str = str.substring(3);// cut the fist part
		}

		str = str.replace('\n', separator);// Generalize separator for \n

		StringTokenizer st = new StringTokenizer(str, String.valueOf(separator));

		while (st.hasMoreElements()) {
			int token = Integer.parseInt(st.nextToken());
			if (token < 0) { // throws an exception if negative
				throw new RuntimeException("Fuck the negative");
			}
			if (token <= 1000) {
				res += token;
			}
		}
		return res;
	}

}
