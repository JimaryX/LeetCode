package leet_code03;

/**
 * 最后一个字符串的长度
 * @author erkxia
 *
 */
public class LeetCode58 {
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("hello world"));
	}

	public static int lengthOfLastWord(String s) {
		int end = s.length() - 1;
		while (end >= 0 && s.charAt(end) == ' ')
			end--;
		if (end < 0)
			return 0;
		int start = end;
		while (start >= 0 && s.charAt(start) != ' ')
			start--;

		return end - start;
	}
}
