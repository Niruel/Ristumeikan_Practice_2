
public class prefix_EL {
	int[] data = { 2, 5, 4, 5, 6, 9, 5, 3, 6, 5, 8, 3, 4 };
	//double result = 0;
	double[] result;
	
	//int count = 0; why??

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prefix_EL gm = new prefix_EL();
		gm.measure();
	}

	public void measure() {

		long start, end, elapsed;

		start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			result = get_avg(data);
		}

		end = System.currentTimeMillis();
		elapsed = end - start;

		System.out.println("The execution time is " + elapsed + " milliseconds.");
		/*for (int i = 0; i < data.length; i++) {
			System.out.println("Result [" + data.length + "] is " + result + ".");
		}*/
		for (int i = 0; i < data.length; i++) {
			System.out.println("Result [" + i + "] is " + result[i] + ".");
		}
	}

	/*public double get_avg(int[] data) {
		double avg = 0;

		for (int i = 0; i < data.length; i++) {
			avg = avg + data[i];
		}
		return avg;
	}

	}*/
	
	public double[] get_avg(int[] data) {
		int n = data.length;
		double[] A = new double[n];
		double avg = 0;
		
		for(int j = 0; j<n;j++) {
			avg += data[j];
			A[j]= avg/(j+1);
		}
		return A;
	}
}
