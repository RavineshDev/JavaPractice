package linkedListImpl2024;


public class UserInputMain {
	
	public static void main(String[] args) {
		FwdWayLinkedListImp mList = new FwdWayLinkedListImp();
		mList.insVal(12);
		mList.insVal(21);
		mList.insVal(22);
		//mList.insVal(13);
		//mList.insVal(31);
		mList.display();
		
		mList.findFirst();
		mList.findLast();
		
		//mList.removeFirst();
		//mList.removeLast();
		
		mList.preAdd(12345);
		mList.display();
		mList.findFirst();
		
	}

}
