package leet_code02;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class EffectiveBrackets {
	public static void main(String[] args) {
		String s = "";
		System.out.println(isValid(s));
	}

	public static boolean isValid(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>() {
			{
				put('{', 1);
				put('}', -1);
				put('[', 2);
				put(']', -2);
				put('(', 3);
				put(')', -3);
			}
		};
		if (s.length() == 0) {
			return true;
		} else if (s.length() % 2 == 1 || map.get(s.charAt(0)) < 0)
			return false;
		Stack<Integer> stack = new Stack();
		for (Character c : s.toCharArray()) {
			if (map.get(c) > 0) {
				stack.push(map.get(c));
			} else if (map.get(c) + stack.pop() != 0) {
				return false;
			}
		}
		if (stack.isEmpty()) {
			return true;
		}
		return false;
	}
}
