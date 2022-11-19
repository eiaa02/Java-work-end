package main;
import java.util.Scanner;

public class Test1089{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n;
		n=input.nextInt();
		System.out.print(f(n));
	}
	static int f(int n){
		int p;
		if(n==1||n==2||n==3)
		{p=1;
			return p;}
		else
			return f(n-3)+f(n-1);
	}
}