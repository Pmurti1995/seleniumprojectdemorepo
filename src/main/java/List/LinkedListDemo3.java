package List;
import java.util.LinkedList;

public class LinkedListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		l.add("dog");
		l.add("dog");
		l.add("cat");
		l.add("horse");
		l.add("frog");
	System.out.println(l);//[dog, dog, cat, horse, frog]
	l.addFirst("lion");
	System.out.println(l); //[lion, dog, dog, cat, horse, frog]
	l.addLast("elephant");
	System.out.println(l); //[lion, dog, dog, cat, horse, frog, elephant]
	System.out.println(l.getFirst());//lion
	System.out.println(l.getLast()); //elephant
	l.removeFirst();//lion
	l.removeLast();
	System.out.println(l);
	
	
	

		
	}







}


