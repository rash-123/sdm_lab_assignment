// wap to check is number is evenor odd.

package assignment1;

import java.util.Scanner;
public class EvenOdd {
	

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int num;
		System.out.println("enter the no");
		num = s.nextInt();
		
		String res = (num % 2 == 0) ? "even" : "odd";
		
		System.out.println(res);
	}

}
