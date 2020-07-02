/*
 * 2020/05/19
 * Exercise on ArrayLists to find index of colors in ArrayList
 * Created By: Nicholas Ruppel
 * Student ID: 26001904476
 * 
 * */
import java.util.ArrayList;
public class Exercise1 {
	String colorData[] = {"yellow","blue","red","yellow","green",
			"red", "yellow","red","green", "blue", "blue","yellow","blue",
			"red","green","red","yellow","blue","green","red","yellow",
			"blue","red","green","yellow", "green","yellow","red"};

	ArrayList<String> colors = new ArrayList<String>();

	public static void main(String[]args) {
		Exercise1 ex1 = new Exercise1();
	}
	public Exercise1() {
		for(int i=0; i <colorData.length;i++) {
			colors.add(colorData[i]);
		}

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

}
