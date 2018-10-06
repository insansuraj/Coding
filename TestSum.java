/*class Node{
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
	
}

class TimeForAction{
	
	public Node sum(Node p, Node q) {
		Node head = null, r = null;
		int carry = 0;
		int sum = 0;
		while(p!=null && q!= null) {
			sum = carry + p.data + q.data;
			carry = sum/10;
			if(r == null) {
				Node node = new Node(sum % 10);
				head = node;
				r = head;
			}
			else {
				Node node = new Node(sum % 10);
				r.next = node;
				r = r.next;
			}
			p = p.next;
			q = q.next;
		}
		if(p != null) {
			while(p != null) {
				Node node = new Node(p.data + carry);
				r.next = node;
				p = p.next;
				r = r.next;
				carry = 0;
			}
		}
		else {
			while(q != null) {
				Node node = new Node(q.data + carry);
				r.next = node;
				q = q.next;
				r = r.next;
				carry = 0;
			}
				
		}
		return head;
	}
}
public class TestSum {
	public static void main(String[] args) {
		LinkList p = new LinkList();
		LinkList q = new LinkList();
		LinkList r = new LinkList();
		TimeForAction t = new TimeForAction();
		p.createLinkList(7);
		p.insertNode(1);
		p.insertNode(6);
		
		q.createLinkList(5);
		q.insertNode(9);
		q.insertNode(2);
		r.head = t.sum(p.head, q.head);
		r.printList();
	}
}*/
