/**
 * 2020/05/26
 * Exercise 3 in array deque queing elements and removing one
 * Created By: Nicholas Ruppel
 * Student ID: 26001904476
 * 
 */
import java.util.ArrayDeque;
public class Exercise3 {

	ArrayDeque<String> queue = new ArrayDeque<String>();
	
	public static void main(String[]args) {
		Exercise3 ex3 = new Exercise3();
		ex3.queueTest();
		
	}
	
	
	public void queueTest() {
		queue.addLast("AA");
		queue.addLast("BB");
		queue.addLast("CC");
		queue.addLast("DD");
		System.out.println(queue);
		System.out.println(queue.removeFirst());
		queue.addLast("EE");
		System.out.println(queue);
		
		
	}
	
}
