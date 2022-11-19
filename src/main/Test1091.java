package main;
import java.util.Scanner;

public class Test1091{
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		double x,s,n;
		s=1;
		x=input.nextInt();
		n=input.nextInt();
		s*=f(n,x);
		System.out.print(s);
	}

	static double f(double n,double x)
	{
		if(n==0)
			return 1;
		if(n==1)
			return x;
		else
			return f(n-1,x)*x;
	}
}