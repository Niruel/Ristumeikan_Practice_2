/**
 * 2020/06/03
 * Exercise in creating link list stacks push then pop.
 * Created By: Nicholas Ruppel
 * Student ID: 26001904476
 * 
 */

public class LinkedStack {
	Node head = null;
	
	
	
	
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
	public void push(String e) {
		if(head ==null) {
			head = new Node(e,null);
		}
		else {
			head = new Node(e,head); 
			
		}
		
		
		
	}
	public String pop() {
		String e = "";
		if(head == null) {
			e = "null";
		}
		else {
			
			e = head.getElement();
			if (head.getNext() == null) {
				head = null;
			} else {
				head = head.getNext();
			}
			
			
			
		}
		return e;
	}
	
	

}
