package linkedlistImpl;

public class Main {
	
	public static void main(String[] args) {
		SinglyLinkedListImpl impl = new SinglyLinkedListImpl();
		impl.append(5);
		impl.append(3);
		impl.append(8);
		impl.append(9);
		impl.append(12);
		
		System.out.println("Original value: ");
		impl.display();
		impl.prepend(1);
		System.out.println("Appended new value as 1st value: ");
		impl.display();
		impl.deleteNode(12);
		System.out.println("Deleted a value, now values are: ");
		impl.display();
		impl.firstValue();
		impl.lastValue();
	}

}
