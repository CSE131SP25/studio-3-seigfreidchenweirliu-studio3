package studio3;

import java.util.Scanner;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter an integer");
		int num = in.nextInt();
		int prime = 2;
		boolean [] numArray = new boolean [num];
			for (int i=0; i< numArray.length; i++) {
				numArray[i] = true;
			}
			
			for (int j = 2; j < numArray.length; j++) {
				
				if (numArray[j] == true) {
				
				for (int k = 2 *j; k < numArray.length; k= k+j ) {
					numArray[k] = false;
				}
				}
			}
			
			for (int h = 2; h < numArray.length; h++) {
				if (numArray[h] == true) {
					System.out.println(h);
				}
			}
	}

}
