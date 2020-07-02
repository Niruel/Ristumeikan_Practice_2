/**
 * 2020/06/03
 * Exercise in creating an enqueue dequeue linked list
 * Created By: Nicholas Ruppel
 * Student ID: 26001904476
 * 
 */
public class LinkedQueue {
	
	Node head = null;
	Node tail = null;
	int size = 0;
	
	public void showList() {
		showList(head);
	}
	public void showList(Node node) {
		if(node==null) {
			System.out.println(" ");
		}
		else {
			
				System.out.print(node.element + " ");
				showList(node.getNext());
			}
		
	}
	public String dequeue() {
		String e = "";
		if (size == 0) {
			e = "null";
		} else {
			e = head.getElement();
			if (head.getNext() == null) {
				head = null;
			} else {
				head = head.getNext();
			}
			size = size - 1;			
		}
		return e;
	}
	public void enqueue(String e) {
		Node node = new Node(e, null);
		if (size == 0) {
			head =  node;
		} else {
			 tail.setNext(node);
		}
		tail = node;
		size = size + 1;
	}
	

}
