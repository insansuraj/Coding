import java.util.HashMap;

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
	
}

class TimeForAction{
	
	public void setIntersection(Node l, Node m) {
		Node n = m;
		while(n.next != null) {
			l = l.next;
			n = n.next;
		}
		n.next = l;
	}
	
	public boolean isIntersection(Node l, Node m) {
		HashMap<Integer, Boolean> map = new HashMap();
		Node  n = l;
		while(n != null) {
			System.out.println("Node: "+n.data+" Reference: "+System.identityHashCode(n));
			map.put(System.identityHashCode(n), true);
			n = n.next;
		}
		n = m;
		System.out.println("Printing all the reference code of m");
		while(n != null) {
			System.out.println("Node: "+n.data+" Reference: "+System.identityHashCode(n));
			n = n.next;
		}
		while(m != null) {
			if(map.containsKey(System.identityHashCode(m)))
				return true;
			m = m.next;
		}
		return false;
	}
}

public class TestIntersection {
	public static void main(String[] args) {
		LinkList l = new LinkList();
		LinkList m = new LinkList();
		TimeForAction t = new TimeForAction();
		l.createLinkList(1);
		l.insertNode(2);
		l.insertNode(3);
		l.insertNode(4);
		l.insertNode(3);
		l.insertNode(2);
		//l.insertNode(1);
		//l.printList();
		m.createLinkList(2);
		m.insertNode(3);
		m.insertNode(4);
		//m.printList();
		t.setIntersection(l.head, m.head);
		//m.printList();
		//l.printList();
		if(t.isIntersection(l.head, m.head))
			System.out.println("Intersection Exist...");
		else
			System.out.println("NO Intersection Exist...");
	}
}


