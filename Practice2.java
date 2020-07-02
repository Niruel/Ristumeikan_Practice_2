/*
 * 2020/05/12
 * Find factorials of recursive function numbers 1- 10
 * Created By: Nicholas Ruppel
 * Student ID: 26001904476
 * 
 * */
public class Practice2 {

	public static void main(String[]args) {
		new Practice2();
	}
	public Practice2() {
		for(int i = 0; i< 11;i++) {
			System.out.println(i + "!=" + factorial(i));
		}
	}
	public int factorial(int n) {
		if(n==0) {
			return 1;
		}
		else {
			
			return n*factorial(n-1);
		} 
	}
}

