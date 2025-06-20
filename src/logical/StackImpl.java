package logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StackImpl {
	
	List<Integer> list = new ArrayList<>();
	

	void pushTest(int val){
	   list.add(val);
	}
	

	int popTest(){
	 int lastVal = list.get(list.size()-1);
	 list.remove(list.get(list.size()-1));
	 return lastVal;
	}

	int peekTest(){
	 return list.get(list.size()-1);
	}

	int minTest(){
		List<Integer> copiedList = new ArrayList<>(list);
	 Collections.sort(copiedList);
	 return list.get(0);
	}
	
	List<Integer> display(){
		return list;
	}

}
