package List;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList l = new LinkedList();
		l.add('x');
		l.add('y');
		l.add('z');
		l.add('a');
		l.add('b');
		l.add('c');
		
		
		LinkedList new_1 = new LinkedList();
		new_1.addAll(l);
		System.out.println(new_1);
		new_1.removeAll(l);
		System.out.println(new_1);
		
		//sorting collection collections.sort();
		System.out.println("Before sorting list:"+l);
		
		Collections.sort(l);
		System.out.println("After sorting list:"+l);
		
		//reverse order
		Collections.sort(l,Collections.reverseOrder());
		System.out.println("After sorting list in reverse order:"+l);
		
		//after shuffling
		Collections.shuffle(l);
		System.out.println("After shuffling :"+l);
		
		
		
		
		
		
		

	}

}
