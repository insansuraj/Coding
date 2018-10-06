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
	 
	public void deleteDuplicate() {
		Node current = head;
		Node runner = null;
		while(current != null) {
			runner = current;
			while(runner.next != null) {
				if(runner.next.data == current.data) {
					runner.next = runner.next.next;
				}
				else {
					runner = runner.next;
				}
			}
			current = current.next;
		}
		
	}
	
	public int findKthElement(int k) {
		Node n = head;
		int count = 0;
		while(n != null) {
			count++;
			n = n.next;
		}
		n = head;
		int hop = count-k;
		for(int i=1; i<=hop; i++) {
			n = n.next;
		}
		return n.data;
	}
}
public class TestDup {
	public static void main(String[] args) {
		LinkList l = new LinkList();
		l.createLinkList(5);
		l.insertNode(2);
		l.insertNode(2);
		l.insertNode(2);
		l.insertNode(2);
		l.insertNode(2);
		l.insertNode(2);
		l.insertNode(3);
		l.insertNode(3);
		l.insertNode(1);
		l.insertNode(4);
		//l.printList();
		l.deleteDuplicate();
		l.printList();
		System.out.println("Kth Element: "+l.findKthElement(5));
	}
}*/
