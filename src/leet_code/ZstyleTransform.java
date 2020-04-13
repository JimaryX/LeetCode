package leet_code;

import java.util.ArrayList;
import java.util.List;

public class ZstyleTransform {
	public static void main(String[] args) {
		String s = "L";
		int numRows = 2;
		System.out.println(convert(s, numRows));
	}

	public static String convert(String s, int numRows) {
		if (numRows == 1)
			return s;
		StringBuilder result = new StringBuilder();
		List<StringBuilder> list = new ArrayList<StringBuilder>();
		for (int i = 0; i < numRows; i++) {
			list.add(new StringBuilder());
		}
		int curr = 0;
		boolean goDown = false;
		for (char c : s.toCharArray()) {
			list.get(curr).append(c);
			if (curr == 0 || curr == numRows - 1) {
				goDown = !goDown;
			}
			curr += goDown ? 1 : -1;
		}
		for (int i = 0; i < numRows; i++) {
			result.append(list.get(i).toString());
		}
		return result.toString();
	}
}
