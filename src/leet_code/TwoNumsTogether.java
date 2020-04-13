package leet_code;

/**
 * 2 两数相加 两数相加给出两个非空的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序的方式存储的，并且它们的每个节点只能存储一位数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 
 * 示例： 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4) 输出：7 -> 0 -> 8 原因：342 + 465 = 807
 * 
 * @author erkxia
 *
 */
public class TwoNumsTogether {
	public static void main(String[] args) {

	}

	public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
		ListNode list = new ListNode(0);
		ListNode p1 = l1, p2 = l2, curr = list;
		int carry = 0;
		while (p1 != null || p2 != null) {
			int x = p1 != null ? p1.val : 0;
			int y = p2 != null ? p2.val : 0;
			curr.next = new ListNode((x + y + carry) % 10);
			carry = (x + y + carry) / 10;
			if(p1 != null) p1 = p1.next;
			if(p2 != null) p2 = p2.next;
			curr = curr.next;
		}
		if(carry != 0) {
			curr.next = new ListNode(1);
		}

		return list.next;
	}

	/**
	 * 哑节点的使用 链表建立后，需要通过指针来进行遍历，所以获取链表后都要进行 “赋值”操作来获取头节点的指针， 然后不断将下一个的指针“赋值” 给同一个变量
	 */
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0); // 此为哑节点，所以最后返回时应返回result.next
		ListNode p1 = l1, p2 = l2, curr = result;
		int carry = 0;
		while (p1 != null || p2 != null) {
			int x = (p1 != null) ? p1.val : 0;
			int y = (p2 != null) ? p2.val : 0;
			carry = (x + y) / 10;
//			curr.next = new ListNode(0);
//			curr.next.val = ( x + y ) % 10;
			curr.next = new ListNode((x + y) % 10);
			curr = curr.next;
			if (p1.next != null)
				p1 = p1.next;
			if (p2.next != null)
				p2 = p2.next;
		}
		if (carry != 0) {
			curr.next = new ListNode(1);
		}
		return result.next;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
