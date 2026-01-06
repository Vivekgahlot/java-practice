// Q:- Count odd numbers in the given array.
package Vivekgahlot;
public class Ques13 {	
	public static void main(String[] args) {		
		int count=0;
		int[] arr = {3, 7, 8, 2, 5, 6, 4};
		for(int i=0;i<arr.length;i++) {
        	if(arr[i]%2!=0) {
        		count++;
        	}
        }
		System.out.println(count);
	}
}
