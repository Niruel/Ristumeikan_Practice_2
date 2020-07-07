import java.util.ArrayDeque;
/**
 * 2020/07/07
 * Exercise in using a quick sort algorithm with ArrayDeque to get a final version of a sorted array
 * Created By: Nicholas Ruppel
 * Student ID: 26001904476
 * 
 */
public class Exercise22 {
	int[] list = {6,8,2,1,4,3,7};
	ArrayDeque<Integer> data = new ArrayDeque<Integer>();
	public static void main(String[] args) {
		new Exercise22();
	}
	public Exercise22() {
		for(int i =0; i<list.length;i++) {
			data.add(list[i]);
		}
		System.out.println("original is" + data);
		quickSort(data);
		System.out.println("result is " + data);
	}
	public void quickSort(ArrayDeque<Integer> sequence) {
		
		int n = sequence.size();
		if(n<2) {
			return;
		}
		int p= sequence.getFirst();
		ArrayDeque<Integer> less = new ArrayDeque<Integer>();
		ArrayDeque<Integer> equal = new ArrayDeque<Integer>();
		ArrayDeque<Integer> greater = new ArrayDeque<Integer>();
		
		while(!sequence.isEmpty()) {
			if(sequence.getFirst()<p) {
				less.add(sequence.remove());
			}
			else if(p<sequence.getFirst()) {
				greater.add(sequence.remove());
			}
			else {
				equal.add(sequence.remove());
			}
		}
		quickSort(less);
		quickSort(greater);
		
		while(!less.isEmpty()) {
			sequence.add(less.remove());
		}
		while(!equal.isEmpty()) {
			sequence.add(equal.remove());
		}
		while(!greater.isEmpty()) {
			sequence.add(greater.remove());
		}
		
		System.out.println(sequence);
	}
}
