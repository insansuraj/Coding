/*import java.util.Stack;

class Node{
	int data;
	Node next;
		  
	Node(int val){
		this.data = val;
		this.next = null;
		}
}

class LinkList{
	Node head;
	
	public void createLinkList(int val) {
		Node node = new Node(val);
		head = node;
	}
	
	public void insertNode(int val) {
		Node n = head;
		while(n.next != null) {
			n = n.next;
		}
		Node node = new Node(val);
		n.next = node;
	}
	
	public void printList() {
		Node n = head;
		while(n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}
	public boolean isPalindrome(){
		Stack<Integer> s = new Stack<Integer>();
		Node slow = head, fast = head;
		while(fast != null && fast.next != null) {
			s.push(slow.data);
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println(s.peek());
		System.out.println(slow.data);
		if(fast != null)
			slow = slow.next;
		
			
		while(slow != null) {
			int top = s.pop().intValue();
			if(top != slow.data) {
				return false;
			}
			slow = slow.next;
		}
		return true;
	}
	
}

public class TestPalindrome {
	public static void main(String[] args) {
		LinkList l = new LinkList();
		l.createLinkList(1);
		l.insertNode(2);
		l.insertNode(3);
		l.insertNode(4);
		l.insertNode(3);
		l.insertNode(2);
		l.insertNode(1);
		l.printList();
		if(l.isPalindrome())
			System.out.println("Plaindrome.");
		else
			System.out.println("Not a Plaindrome.");
	}
}*/


