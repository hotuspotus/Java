public class LinkedList436Test {
	public static LinkedList436 linkedList436;
	 
	public static void main(String[] args) {
 
		linkedList436 = new LinkedList436();
 
		// add more elements to LinkedList
		linkedList436.add("1");
		linkedList436.add("2");
		linkedList436.add("3");
		linkedList436.add("4");
		linkedList436.add("5");
		/*
		 * Check whether your methods work.
		 */
 
		System.out.println("Print: \t\t" + linkedList436.toString());
		System.out.println(".size(): \t\t\t\t" + linkedList436.size());
		System.out.println(".get(3): \t\t\t\t" + linkedList436.get(3) + " (get element at index:3 - list starts from 0)");
		System.out.println(".remove(2): \t\t\t\t" + linkedList436.remove(2) + " (element removed)");
		System.out.println(".get(3): \t\t\t\t" + linkedList436.get(3) + " (get element at index:3 - list starts from 0)");
		System.out.println(".size(): \t\t\t\t" + linkedList436.size());
		System.out.println("Print again: \t" + linkedList436.toString());
		
		
		// do something more.
		linkedList436.add("3", 2);
		System.out.println("Print: are we getting 3 back: \t\t" + linkedList436);
		System.out.println(".get(3): \t\t\t\t" + linkedList436.get(3) + " (get element at index:3 - list starts from 0)");
		System.out.println(".size(): \t\t\t\t" + linkedList436.size());

		
		
	}
}
