package interview;

import java.util.ArrayList;
import java.util.List;

public class Question12 {
	public static void main(String[] args) {
		char[][] board = { { 'a', 'b', 'c', 'e' }, { 's', 'f', 'c', 's' }, { 'a', 'd', 'e', 'e' } };
		System.out.println(exist(board, "abfb"));
	}

	public static boolean exist(char[][] board, String word) {
		char[] chars = word.toCharArray();
		List<int[]> list = new ArrayList<>();
		int flag = 1;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == chars[0]) {
					list.add(new int[] { i, j });
				}
			}
		}

		if (list.size() == 0) {
			return false;
		}

		for (int j = 0; j < list.size(); j++) {
			int m = list.get(j)[0];
			int n = list.get(j)[1];
			for (int i = 1; i < chars.length; i++) {
				if (m - 1 > 0 && board[m - 1][n] == chars[i]) {
					board[m - 1][n] = '-';
					m--;
				} else if (m + 1 < board.length && board[m + 1][n] == chars[i]) {
					board[m + 1][n] = '-';
					m++;
				} else if (n - 1 > 0 && board[m][n - 1] == chars[i]) {
					board[m][n - 1] = '-';
					n--;
				} else if (n + 1 < board[0].length && board[m][n + 1] == chars[i]) {
					board[m][n + 1] = '-';
					n++;
				} else {
					flag = -1;
				}
			}
			if(flag == 1) {
				return true; 
			}
		}
		return false;
	}
}
