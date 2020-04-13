package leet_code02;

public class MergeLink {
	public static void main(String[] args) {
		ListNode list = initialLink(new int[]{1, 2, 4});
		ListNode list2 = initialLink(new int[] {});
		ListNode result = mergeTwoLists(list, list2);
		while(result != null) {
			System.out.println(result.val);
			result = result.next;
		}
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode link = new ListNode(0);
		ListNode curr = link;
		while (l1 != null || l2 != null) {
			if (l1 == null) {
				curr.next = l2;
				break;
			} else if (l2 == null) {
				curr.next = l1;
				break;
			}
			if(l1.val > l2.val) {
				curr.next = new ListNode(l2.val);				
				l2 = l2.next;
			}else {
				curr.next = new ListNode(l1.val);
				l1 = l1.next;
			}
			curr = curr.next;
		}

		return link.next;
	}

	public static ListNode initialLink(int[] nums) {
		ListNode link = new ListNode(0);
		ListNode p = link;
		for (int i = 0; i < nums.length; i++) {
			p.next = new ListNode(nums[i]);
			p = p.next;
		}
		return link.next;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}