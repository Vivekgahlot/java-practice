// Q:- Display sum of elements using for each loop.
package Vivekgahlot;
public class Ques16 {	
	public static void main(String[] args) {
		
		int sum=0;
		int[] arr = { 3, 7, 8, 2, 5, 6, 4 };
		for(int i:arr) {
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
