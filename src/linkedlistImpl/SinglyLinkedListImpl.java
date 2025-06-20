package linkedlistImpl;

public class SinglyLinkedListImpl {
	
	Node head;
	Node tail;
	
	public void append(int data) {
		Node newNode = new Node(data);
		
		if(head==null) {
			head=newNode;
			tail = newNode;
			return;
		}
		tail = head;
		while(tail.next != null) {
			tail = tail.next;
		}	
		tail.next = newNode;
		tail = tail.next;
	}
	
	public void prepend(int data) {
		Node newNode = new Node(data);
		Node temp = head;
		head = newNode;
		head.next = temp;
		
	}
	
	public void updateValue(int exist, int newVal) {
		Node temp = head;
		while(temp != null) {
			if(temp.data == exist) {
				temp.data = newVal;
				return;
			}
			temp = temp.next;
		}
	}
	
	public void deleteNode(int data) {
		Node temp = head;
		if(temp.data == data) {
			head = temp.next;
			return;
		}
		
		while(temp.next != null) {
			if(temp.next.data == data) {
				temp.next = temp.next.next;
                return;
			}else {
				temp = temp.next;
			}
		}
		
	}
	
	public void display() {
		Node current = head;
		if(current == null) {
			System.out.println("Emplty LinkedList");
			return;
		}
		
		while(current!=null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println();
		
	}
	public void lastValue() {
		if(tail != null) {
			System.out.println("Last value: "+tail.data);
		}
	}
	public void firstValue() {
		if(head != null) {
			System.out.println("First value: "+head.data);
		}
	}
	
	

}
