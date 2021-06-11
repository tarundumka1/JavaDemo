package practicals;

import java.util.Scanner;

public class print5integers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter how many integers you want to print:");
		int n  = sc.nextInt();
		for(int i =1 ; i <= n; i++ )
		{
			  System.out.println(i);
		}

	}

}
