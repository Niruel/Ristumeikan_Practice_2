/**
 * 2020/05/19
 * Exercise to remove the color green from the array
 * Created By: Nicholas Ruppel
 * Student ID: 26001904476
 * 
 *
 */
import java.util.ArrayList;
import java.util.Iterator;
public class Exercise2 {
	String colorData[] = {"yellow","blue","red","yellow","green",
			"red", "yellow","red","green", "blue", "blue","yellow","blue",
			"red","green","red","yellow","blue","green","red","yellow",
			"blue","red","green","yellow", "green","yellow","red"};

	ArrayList<String> colors = new ArrayList<String>();

	public static void main(String[]args) {
		Exercise2 ex2 = new Exercise2();
	}
	public Exercise2() {
		for(int i=0; i <colorData.length;i++) {
			colors.add(colorData[i]);
		}

		ShowColor("blue");
		ShowColor("green");
		ShowColor("red");
		ShowColor("yellow");
		deleteColor("green");
		ShowColor("blue");
		ShowColor("green");
		ShowColor("red");
		ShowColor("yellow");
	}
	public void ShowColor(String color) {
		String elementText = color + " is at ";
		for(int n=0; n< colors.size();n++) {

			if(color.equals(colors.get(n)))
				elementText= elementText +  n + " ";

		}
		System.out.println(elementText+  " ");
	}
	public void deleteColor(String color) {
		Iterator<String> iterator =colors.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().equals(color)) {
				iterator.remove();
			}
		}
		System.out.print(color + " has been removed.\n");


	}

}
