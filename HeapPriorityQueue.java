/**
 * 2020/06/16
 * Exercise in Heap stack that achives upheap and downheap elements
 * Created By: Nicholas Ruppel
 * Student ID: 26001904476
 * 
 */
import java.util.ArrayList;
public class HeapPriorityQueue {
	ArrayList<Tuple> data=null;
	Tuple tp;
	
	public HeapPriorityQueue(ArrayList<Tuple> data_) {
		data= data_;
	}
	public void showQueue() {
		if(data == null) {
			System.out.println("Queue is empty");
		}
		else {
			
			
			for(Tuple tp: data) {
				
				System.out.print("("+ tp.getKey() + "," + tp.getElement() +")");
				
			}
			System.out.println();
		}
	}
	public int parent(int j) {
		return (j-1)/2;
		
	}
	public int left(int j) {
		return (2*j)+1;
	}
	public int right(int j) {
		return(2*j)+2;
	}
	public int len() {
		return data.size();
	}
	public void add(int key, String element) {
		data.add(new Tuple(key,element));
		upheap(len()-1);
		
	}
	public void swap(int i, int j) {
		Tuple temp = data.get(i);
		data.set(i, data.get(j));
		data.set(j, temp);
	}
	public void upheap(int j) {
		System.out.print("upheap: ");
		showQueue();
		
		if(j>0 && data.get(j).getKey()<data.get(parent(j)).getKey()) {
			swap(j,parent(j));
			upheap(parent(j));
		}
		
		
	}
	public Tuple remove_min() {
		if(data.isEmpty()) {
			System.out.println("Priority Queue is empty");
			return null;
		}
		else {
			swap(0,len()-1);
			Tuple temp = data.get(len()-1);
			data.remove(len()-1);
			downheap(0);
			return temp;
		}
		
	}
	public void downheap(int j) {
		int left;
		int right;
		int small_child;
		
		System.out.print("down heap");
		showQueue();
		if(left(j)<len()-1) {
			left = left(j);
			small_child=left;
			if(right(j)<len()-1) {
				right = right(j);
				if(data.get(right).getKey()<data.get(left).getKey()) {
					small_child=right;
				}
			}
			if(data.get(small_child).getKey()<data.get(j).getKey()) {
					swap(j, small_child);
					downheap(small_child);
			}
		}
	}
}
