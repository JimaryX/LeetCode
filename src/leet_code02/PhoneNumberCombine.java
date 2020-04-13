package leet_code02;

import java.util.ArrayList;
import java.util.List;

// WRONG
public class PhoneNumberCombine {
	public static void main(String[] args) {
		String digits = "abc";
		System.out.println((letterCombinations(digits).size()));
	}

	public static List<String> letterCombinations(String digits) {
		List<String> list = new ArrayList<String>();

		return traceBack(digits, list);
	}

	public static List<String> traceBack(String digits, List<String> list) {
		List<String> result = new ArrayList<String>();
		if(digits.length() != 0) {
			result = traceBack(digits.substring(1), result);
		}	
		for(int i = 0; i< list.size(); i++) {
			result.add(digits.charAt(0)+list.get(i));			
		}
		return result;
	}
}
