package two;

public class Max {

/**
 * Print the highest number
 * 
 * @param args
 */
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		int max_value = c > (a > b ? a:b) ? c : (a > b ? a:b);
		
		System.out.println("Max = " + max_value);
	}

}
