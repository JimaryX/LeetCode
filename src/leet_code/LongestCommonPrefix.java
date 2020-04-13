package leet_code;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。 如果不存在公共前缀，返回空字符串 ""。
 * 
 * 示例 1: 输入: ["flower","flow","flight"] 输出: "fl" 示例 2: 输入:
 * ["dog","racecar","car"] 输出: "" 解释: 输入不存在公共前缀。
 * 
 * @author erkxia
 *
 */
public class LongestCommonPrefix {
	public static void main(String[] args) {
		String[] str = { "aca", "cba" };
		System.out.println(longestCommonPrefix(str));
	}

	public static String longestCommonPrefix(String[] strs) {
		if (strs.length > 0) {
			String common = strs[0];
			for (int i = 1; i < strs.length; i++) {
				common = CommonPrefix(common, strs[i]);
			}
			return common;
		}
		throw new IllegalArgumentException("no solution");
	}

	public static String CommonPrefix(String str1, String str2) {
		String common = "";
		for (int i = 0; i < str1.length() && i < str2.length(); i++) {
			if (str1.charAt(i) == str2.charAt(i)) {
				common += str1.charAt(i);
			} else {
				return common;
			}
		}
		return common;
	}
}
