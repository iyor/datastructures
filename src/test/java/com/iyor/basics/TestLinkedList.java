public class TestLinkedList {
	//TODO add JUnit testing instead...
	public static void main(String[] args){
		testCreation();
		testAdd();
		testContainsIfEmpty();
		testContains();
	}

	public static void testCreation() {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		System.out.println("Creation successful: " + (0==ll.size()));
	}

	public static void testAdd() {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		System.out.println("Addition successful: " + (ll.size==3));
	}

	public static void testContainsIfEmpty(){
		LinkedList<Integer> ll = new LinkedList<Integer>();
		System.out.println("Contains if empty successful: " +
			!ll.contains(4));
	}

	public static void testContains() {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		System.out.println("Contains successful " 
			+ (ll.contains(1) && ll.contains(2) && ll.contains(3) ));
	}
}
