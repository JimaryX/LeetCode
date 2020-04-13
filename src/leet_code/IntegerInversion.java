package leet_code;

/**
 * 整数反转，只需注意溢出情况即可
 * 正数：在加上最后一位前的值不能大于Inetger.MAX_VALUE / 10, 如果等于此值那最后一位则不能大于7，否则即溢出
 * 负数：在加上最后一位前的值不能小于Inetger.MIN_VALUE / 10, 如果等于此值那最后一位则不能小于-8，否则溢出
 * @author erkxia
 *
 */
public class IntegerInversion {
	public static void main(String[] args) {
		int x = 1234567899;
		System.out.println(integerInvers(x));
	}

	public static int integerInvers(int x) {
		int y = 0;
		while (x != 0) {
			if ((x % 10 > 7 && y == Integer.MAX_VALUE / 10) || y > Integer.MAX_VALUE / 10)
				return 0;
			if ((x % 10 < -8 && y == Integer.MIN_VALUE / 10) || y < Integer.MIN_VALUE / 10)
				return 0;
			y = x % 10 + y * 10;
			x /= 10;
		}
		return y;
	}
}