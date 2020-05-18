package interview;

public class Question18 {
	public static void main(String[] args) {
//		ListNode.createListNode(new int[] { 1, 2, 3, 4, 5 });
		ListNode.printListNode(deleteNode(ListNode.createListNode(new int[] { 1, 2, 3, 4, 5 }), 5));
	}

	public static ListNode deleteNode(ListNode head, int val) {
		ListNode point = head;
		if (point.val == val) {
			return head.next;
		}
		while (point.next != null) {
			if (point.next.val == val) {
				point.next = point.next.next;
				break;
			} else {
				point = point.next;
			}
		}

		return head;
	}
}
