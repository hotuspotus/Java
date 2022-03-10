//authored by Michael Pierce

public class LinkedList436 {
	private class Node {
		// reference to the next node in the chain, or null if there isn't one.
		Node next;
	
		// data carried by this node. could be of any type you need.
		Object data;
	
		// Node constructor
		public Node(Object dataValue) {
		// PLEASE IMPLEMENT YOUR CODE HERE
			data = dataValue;
			next = null;
		}
	
		// these methods should be self-explanatory
		public Object getData() {
			return data;
		}
	
		public void setData(Object dataValue) {
		// PLEASE IMPLEMENT YOUR CODE HERE
		data = dataValue;
		}
		 
		// return the next node of the current node
		public Node getNext() {
			return next;
		}
		 
		public void setNext(Node nextValue) {
		// PLEASE IMPLEMENT YOUR CODE HERE
		next = nextValue;
		}
	}
	
	private int counter = 0;
	private Node head = new Node(null);
 
	// appends the specified element to the end of this list.
	public void add(Object data) {
 
		//make new node for given data
		Node new_node = new Node(data);

		//if list is empty
		if(counter == 0){
			head.setData(data);
		}
		//if list only has one element
		else if(head.getNext() == null){
			head.setNext(new_node);
		}
		//if list has more than 1 element, traverse list until last node is found
		//last_node variable actually represents what will end up being the 2nd to last
		else{	
			Node last_node = new Node(null);
			last_node.setNext(head.getNext());

			for(int i = 1; i < counter; i++){	
				if(last_node.getNext().getNext() == null){
					last_node.getNext().setNext(new_node);
				}else{
					last_node.setNext(last_node.getNext().getNext());
				}
			}
		}
		//update counter
		counter += 1;
	}
	
	// inserts the specified element at the specified position in this list 
	public void add(Object data, int index){
		if(index > counter){
			System.out.println("when an index is too large, the element will be added to the end of the list");
			add(data);
		}
		else{
			//make new node for given data
			Node new_node = new Node(data);
			new_node.setNext(head.getNext());
	
			if(index == 0){
				Node old_head = new Node(head.getData());
				old_head.setNext(head.getNext());

				head.setData(data);
				head.setNext(old_head);
			}
			else if(index == 1){
				head.setNext(new_node);
			}
			else{
				Node temp_node = new Node(null);
				for(int i = 1; i < index; i++){	
					if(i == index - 1){
						System.out.println("adding " + data + "to index " + index);
						temp_node.setNext(new_node.getNext());
						
						new_node.setNext(new_node.getNext().getNext());
						temp_node.getNext().setNext(new_node);

					}else{
						new_node.setNext(new_node.getNext().getNext());
					}
				}	
			}
		//update counter
		counter += 1;
		}
	}

	// returns the element at the specified position in this list.
	public Object get(int index){

		if(index == 0){
			return head.getData();
		}
		else if(index < 0 || index > counter){
			System.out.println("out-of-range index, you get nothing \n");
			return null;
		}
		else{
			Node temp_node = new Node(null);
			temp_node.setNext(head.getNext());

			for(int i = 1; i < index; i++){	
				if(i == index - 1){
					return temp_node.getNext().getData();
				}else{
					temp_node.setNext(temp_node.getNext().getNext());
				}
			}	
		}

		return null;
	}
 
	// removes the element at the specified position in this list.
	public boolean remove(int index) {
		if(index == 0){
			head.setData(head.getNext().getData());
			head.setNext(head.getNext().getNext());
		}
		else if(index == 1){
			head.setNext(head.getNext().getNext());
		}
		else if(index < 0 || index >= counter){
			System.out.println("out-of-range index, nothing to remove\n");
			return false;
		}
		else{
			Node temp_node = new Node(null);
			temp_node.setNext(head.getNext());

			for(int i = 1; i < index; i++){	
				if(i == index - 1){
					temp_node.getNext().setNext(temp_node.getNext().getNext().getNext());
				}else{
					temp_node.setNext(temp_node.getNext().getNext());
				}
			}	
		}
		counter -= 1;
		return true;
	}
 
	// returns the String content of all the nodes in this list. 
	public String toString() {
		String list_string = "";
		if(counter == 0){
			System.out.println("List is empty!\n");
			return list_string;
		}

		list_string = list_string + (head.getData().toString());

		Node temp_node = new Node(null);
		temp_node.setNext(head.getNext());

		for(int i = 1; i < counter; i++){	
			list_string = list_string + (temp_node.getNext().getData().toString());
			temp_node.setNext(temp_node.getNext().getNext());
		}	

		return list_string;
	}
 
	// returns the number of elements in this list.
	public int size() {
		return counter;
	}
	
}
