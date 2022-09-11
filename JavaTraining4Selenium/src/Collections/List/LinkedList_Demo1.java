package Collections.List;

import java.util.LinkedList;

public class LinkedList_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList ll1 = new LinkedList();
		
		ll1.add(8);
		ll1.add(12.897);
		ll1.add('p');
		ll1.add("lkjhh");
		ll1.add(false);
		
		System.out.println(ll1);
		
		ll1.remove(0);
		
		System.out.println(ll1);
		
	}

}
