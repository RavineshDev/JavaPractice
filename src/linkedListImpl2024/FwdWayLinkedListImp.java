package linkedListImpl2024;

public class FwdWayLinkedListImp {
	
	Node head;
	Node tail;
	
	public void insVal(int data) {
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
	
	public void findFirst() {
		if(head != null) {
			System.out.println("First value: "+head.data);
		}
	}
	
	public void findLast() {
		if(tail != null) {
			System.out.println("Last value: "+tail.data);
		}
	}
	
	public void removeFirst() {
		if(head != null && head.next !=null) {
			System.out.println("Removing first value: "+head.data);
			head = head.next;
		}else if(head != null) {
			System.out.println("Only one val and Removing that from first: "+head.data);
			head = null;
			tail = null;
		}
	}
	
	public void removeLast() {
		
		if(head == tail) {
			System.out.println("Only one val and Removing that from last: "+head.data);
			head = null;
			tail = null;
		}else if(head.next.next == null) {
			head.next = null;
			this.tail = head;
		}
		else {
			Node temp = head;
			while(temp.next.next != tail) {
				temp = temp.next;
			}
			System.out.println("Removing last value: "+tail.data+" , temp val: "+temp.next.data);
			temp.next.next = null;
			this.tail = null;
			this.tail = temp.next;
			
		}
	}
	
	public void preAdd(int data) {
		Node n= new Node(data);
		if(head != null) {
			Node temp = head;
			head = n;
			head.next = temp;
		}
	}
	
	
	public void display() {
		Node temp = head;
		System.out.println("Display all values: ");
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	

}
