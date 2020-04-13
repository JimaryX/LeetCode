package leet_code;

/**
 * 
 * @author erkxia
 *
 */
public class ConvertInteger {
	public static void main(String[] args) {
		String s = "2147483648";
		System.out.println(myAtoi(s));
	}

	public static int myAtoi(String str) {
		if (str == null || str.trim().length() == 0)
			return 0;
		String[] splits = str.split(" ");
		int result = 0;
		boolean builder = true;
		String number = "";

		for (int i = 0; i < splits.length; i++) {
			if (splits[i].length() != 0) {
				number = splits[i];
				break;
			}
		}

		if ((number.charAt(0) != '+' && number.charAt(0) != '-')
				&& (number.charAt(0) < '0' || number.charAt(0) > '9')) {
			return 0;
		}

		for (int j = 0; j < number.length(); j++) {
			if (number.charAt(j) == '+' || number.charAt(j) == '-') {
				if (j == 0) {
					builder = number.charAt(0) == '+' ? true : false;
					continue;
				} else {
					break;
				}
			} else if (number.charAt(j) > '9' || number.charAt(j) < '0') {
				break;
			}

			if (builder && (result > Integer.MAX_VALUE / 10
					|| (result == Integer.MAX_VALUE / 10 && number.charAt(j) > '7')))
				return Integer.MAX_VALUE;
			if (!builder && (result * -1 < Integer.MIN_VALUE / 10
					|| (result * -1 == Integer.MIN_VALUE / 10 && number.charAt(j) > '8'))) {
				return Integer.MIN_VALUE;
			}
			result = result * 10 + (number.charAt(j) - '0');
		}
		result = builder ? result : result * -1;

		return result;
	}
}
