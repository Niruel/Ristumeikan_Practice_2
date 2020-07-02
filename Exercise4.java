/**
 * 2020/05/26
 * Exercise 4 in array stacking elements and popping one
 * Created By: Nicholas Ruppel
 * Student ID: 26001904476
 * 
 */
import java.util.ArrayDeque;
public class Exercise4 {
	
	ArrayDeque<String> stack = new ArrayDeque<String>();
	public static void main(String[]args) {
		Exercise4 ex4 = new Exercise4();
		ex4.stackTest();
	}
	public void stackTest() {
		stack.push("AA");
		stack.push("BB");
		stack.push("CC");
		System.out.println(stack);
		System.out.println(stack.pop());
		stack.push("DD");
		System.out.println(stack);
	}

}
