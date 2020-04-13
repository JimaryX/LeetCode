package leet_code;

/**
 * ������ת��ֻ��ע������������
 * �������ڼ������һλǰ��ֵ���ܴ���Inetger.MAX_VALUE / 10, ������ڴ�ֵ�����һλ���ܴ���7���������
 * �������ڼ������һλǰ��ֵ����С��Inetger.MIN_VALUE / 10, ������ڴ�ֵ�����һλ����С��-8���������
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