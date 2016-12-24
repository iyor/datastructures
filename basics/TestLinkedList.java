public class TestLinkedList {

	public static void main(String[] args){
		testCreation();

	}

	public static void testCreation() {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		System.out.println("Creation successful: "+ (0==ll.size()));
	}
}
