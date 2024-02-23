package List;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declare Linked list
		//LinkedList <Integer> l = new LinkedList <Integer>();
		//LinkedList <String> l1 = new LinkedList <String>();

		LinkedList l = new LinkedList();

		//Add element into linked list
		l.add(100);
		l.add('A');
		l.add("Shipra");
		l.add(50.5);
		l.add(true);
		l.add(null);
		System.out.println(l);
		System.out.println(l.size());
		l.remove(1);
		System.out.println("After removing, new list:"+l);
		l.add(4, "java");
		System.out.println("After inserting, new list:"+l);
		System.out.println(l.get(3));
		l.set(0, 20);
		System.out.println("After replacing, new list:"+l);

		//contains
		l.contains("Shipra");
		System.out.println(l.contains("Shipra"));
		System.out.println(l.contains("Prasanna"));
		System.out.println(l.isEmpty());

		//reading element from ll using for loop
		for(int i = 0;i<l.size();i++) {
			System.out.println(l.get(i));

		}
		//reading element from ll using for each  loop
		for(Object e:l) {
			System.out.println(e);


		}

		//iterator method
		Iterator it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}







}


