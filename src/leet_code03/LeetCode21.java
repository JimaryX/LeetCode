package leet_code03;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode21 {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 9 };
		int[] nums2 = { 2, 3, 3, 5, 6, 7 };
		ListNode list1 = createListNode(nums);
		ListNode list2 = createListNode(nums2);
		System.out.println(Arrays.toString(traverseListNode(list1)));
		System.out.println(Arrays.toString(traverseListNode(list2)));

		ListNode mergeTwoLists = mergeTwoLists(list1, list2);
		System.out.println(Arrays.toString(traverseListNode(mergeTwoLists)));
	}

	public static int[] traverseListNode(ListNode list) {
		List<Integer> arrayList = new ArrayList<>();
		while (list != null) {
			arrayList.add(list.val);
			list = list.next;
		}
//		arrayList.toString();
		return arrayList.stream().mapToInt(Integer::valueOf).toArray();
	}

	public static ListNode createListNode(int[] nums) {
		ListNode listNode, curr;
		listNode = new ListNode(0);
		curr = listNode;
		for (int i = 0; i < nums.length; i++) {
			curr.next = new ListNode(nums[i]);
			curr = curr.next;
		}
		return listNode.next;
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode p1, p2, res, current;
		p1 = l1;
		p2 = l2;
		res = new ListNode(0);
		current = res;
		while (p1 != null || p2 != null) {
			if (p1 == null) {
				current.next = p2;
				break;
			}
			if (p2 == null) {
				current.next = p1;
				break;
			}

			if (p1.val > p2.val) {
				current.next = p2;
				p2 = p2.next;
				current = current.next;
			} else {
				current.next = p1;
				p1 = p1.next;
				current = current.next;
			}
		}
		return res.next;
	}
}
