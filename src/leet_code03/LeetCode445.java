package leet_code03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class LeetCode445 {
	public static void main(String[] args) {
		int[] num1 = { 1, 2, 3, 4 };
		int[] num2 = { 8, 3, 4 };
		System.out.println(Arrays.toString(listToInt(createList(num1))));
		System.out.println(Arrays.toString(listToInt(createList(num2))));

		System.out.println(Arrays.toString(listToInt(addTwoNumbers(createList(num1), createList(num2)))));
		
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode ans = null;
		ListNode pre = null;
		int curr = 0;
		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		while (l1 != null || l2 != null) {
			if (l1 != null) {
				stack1.push(l1.val);
				l1 = l1.next;
			}
			if (l2 != null) {
				stack2.push(l2.val);
				l2 = l2.next;
			}
		}
		while (!stack1.empty() || !stack2.empty()) {
			int sum = (stack1.empty() ? 0 : (int) stack1.pop()) + (stack2.empty() ? 0 : (int) stack2.pop());
			pre = new ListNode((sum + curr) % 10);
			curr = (sum + curr) / 10;
			pre.next = ans;
			ans = pre;
		}
		if (curr != 0) {
			pre = new ListNode(1);
			pre.next = ans;
		}

		return pre;
	}

	public static ListNode createList(int[] nums) {
		ListNode list = new ListNode(0);
		ListNode curr = list;
		for (int i : nums) {
			curr.next = new ListNode(i);
			curr = curr.next;
		}
		curr = null;
		return list.next;
	}

	public static int[] listToInt(ListNode list) {
		ArrayList<Integer> array = new ArrayList<>();
		while (list != null) {
			array.add(list.val);
			list = list.next;
		}
		return array.stream().mapToInt(Integer::valueOf).toArray();
	}
}
