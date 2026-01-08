// Q:- Display even elements in array using for-each l
package Vivekgahlot;
public class Ques17 {	
	public static void main(String[] args) {		
		int[] arr = { 3, 7, 8, 2, 5, 6, 4 };
		for(int i:arr) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}

}
