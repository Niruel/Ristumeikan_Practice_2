import java.util.Arrays;
/**
 * 2020/07/07
 * Exercise in Merging two arrays coping to two diffrernt arrays and sorting them into a final array 
 * Created By: Nicholas Ruppel
 * Student ID: 26001904476
 * 
 */
public class Exercise21 {
	int[] list3 = {6,8,2,1,4,3,7};
	
	public static void main(String[] args ) {
		new Exercise21();
	}
	
	public Exercise21() {
		printList("list",list3);
		mergeSort(list3);
		printList("result", list3);
	}

	public void mergeSort(int[] list) {
		// Complete this part
		int n = list.length;
		
		if(n<2) {
			return;
		}
		int mid =n/2;
		int[] list1 =Arrays.copyOfRange(list, 0, mid);
		int[] list2 = Arrays.copyOfRange(list, mid, n);
		mergeSort(list1);
		mergeSort(list2);
		merge(list1,list2,list);
		printList("list", list);
		
	}
	public void merge(int[] list1, int[] list2, int[] list) {
		int i = 0;
		int j = 0;
		
		
		while(i+j < list.length) {
			if(j==list2.length || (i<list1.length && list1[i]<list2[j]) ) {
				list[i+j]=list1[i];
				i += 1;
			}
			else {
				list[i+j]= list2[j];
				j+=1;
			}
		}
		
	}
	
	public void printList(String str, int[] list) {
		System.out.print(str + ": ");
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}
}
