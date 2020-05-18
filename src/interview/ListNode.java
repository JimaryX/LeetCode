package interview;

public class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}

	public static ListNode createListNode(int[] nums) {
		ListNode list = new ListNode(0);
		ListNode point = list;
		for (int i = 0; i < nums.length; i++) {
			point.next = new ListNode(nums[i]);
			point = point.next;
		}
		return list.next;
	}

	public static void printListNode(ListNode list) {
		while (list != null) {
			System.out.println(list.val);
			list = list.next;			
		}
	}
}
