package logical;

public class CustomLinkedList {
	
	Node head;
	Node tail;
	
	public void add(int data) {
		
		Node n = new Node(data);
		
		if(head == null) {
			head = n;
			tail = n;
			return;
		}
		
		tail = head;
		
		while(tail.next != null) {
			tail = tail.next;
		}
		tail.next = n;
		tail = tail.next;
	}
	
	public int findFirst() {
		return head.data;
	}
	
	public int findLast() {
		return tail.data;
	}
	
	
	
	public void display() {
		
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

}
