/**
 * 2020/04/07
 * Obtaining average prefix and the time it takes to run the algorithm
 * By: Nicholas Ruppel
 *
 */
public class Prefix_Average {
	int data[] = {2,5,4,5,6,9,5,3,6,5,8,3,4};
	double[] result;
	
	public static void main(String[] args) {
		Prefix_Average pa= new Prefix_Average();
		pa.messured();
	}
	public void messured() {
		long start;
		long end;
		long elapsed;
		start = System.currentTimeMillis();
		for(int i = 0; i <100000; i++) {
			result = prefAvg(data);
			
		}
		
		end=System.currentTimeMillis();
		elapsed = end - start;
		
		
		
	
		System.out.println("The execution time is "+ elapsed + " milliseconds");
		for(int i = 0; i<result.length;i++) {
			System.out.println("result[" + i + "] is "+ result[i]);
		}
	}

	public double[] prefAvg(int[] s) {
		
		int n = s.length;
		double[] A = new double[n];
		double total = 0;
		
		
		for(int j = 0; j< n; j++) {
			total += s[j];
			A[j] = total/ (j+ 1);
			
		}
		return A;
	}

	

}
