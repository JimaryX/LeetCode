package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Question06 {
	public static void main(String[] args) {
	}
	
	public static int[] reversePrint(ListNode head) {
		Stack<Integer> stack = new Stack<Integer>();
		while(head != null) {
			stack.push(head.val);
			head = head.next;
		}
		int size = stack.size();
		int[] num = new int[size];
		for(int i = 0; i < size; i++) {
			num[i] = stack.pop();
		}
		
		return num;
    }
}
