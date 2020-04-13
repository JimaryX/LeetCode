package leet_code;

import java.util.HashMap;
import java.util.Map;

/**
 * 3无重复字符的最长子串 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * 
 * 示例 1: 输入: "abcabcbb" 输出: 3 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。 示例 2: 输入:
 * "bbbbb" 输出: 1 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。 示例 3: 输入: "pwwkew" 输出: 3 解释:
 * 因为无重复字符的最长子串是 "wke"，所以其长度为 3。   请注意，你的答案必须是 子串的长度，"pwke" 是一个子序列，不是子串。
 * 
 * @author erkxia
 *
 */
public class LongestSubString {
	public static void main(String[] args) {
		String str = "arrrttytjukia";
		System.out.println(lengthOfLongestSubstring(str));
	}

	/**
	 * 自己解答
	 * 滑动窗口
	 */
	public static int lengthOfLongestSubstring(String s) {
		if (s.length() == 1) return 1;
		int max = 0;
		for (int i = 0, j = 1; j < s.length(); j++) {
			String str = s.substring(i, j);
			if (str.indexOf(s.charAt(j)) != -1) {
				i += s.substring(i, j).indexOf(s.charAt(j)) + 1;
			}
			max = Math.max(max, j - i + 1);
		}
		return max;
	}

}
