package leet_code;

/**
 * 最长回文子串 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * 
 * 示例 1： 输入: "babad" 输出: "bab" 注意: "aba" 也是一个有效答案。 示例 2： 输入: "cbbd" 输出: "bb"
 * 
 * @author erkxia
 *
 */
public class Palindrome {
	public static void main(String[] args) {
		String s = "abcbbc";
//		System.out.println(longestPalindrome(s));
	}
	
// WRONY
//	public static String longestPalindrome(String s) {
//		String result = "";
//		int max = 0, position = 0;
//		StringBuilder builder = new StringBuilder("#");
//		for (int i = 0; i < s.length(); i++) {
//			builder.append(s.charAt(i));
//			builder.append("#");
//		}
//		char[] all = builder.toString().toCharArray();
//		for (int j = 0; j < all.length; j++) {
//			int length = centerExtension(all, j);
//			if (length > max) {
//				max = length;
//				position = j;
//			}
//		}
//		result = builder.substring(position - max / 2, position + max / 2 + 1).toString().replaceAll("#", "");
//		return result;
//	}
//
//	public static int centerExtension(char[] all, int i) {
//		int length = 0;
//		int extension = 1;
//		while (i - extension >= 0 && i + extension < all.length) {
//			if (all[i - extension] == all[i + extension] && all[i - extension] != '#') {
//				length += 2;
//			}
//			extension++;
//		}
//		return length;
//	}
}
