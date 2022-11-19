package main;
import java.util.Scanner;

public class Test1119{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int s,n;
		s=0;
		n = input.nextInt();
		while(n != 0)
		{
			n=input.nextInt();
			s+=f(n);}
		System.out.print(s);
	}

	static int f(int n)
	{
		int p;
		p=0;
		while(n!=0)
		{p=p*10+n%10;
			n=n/10;}
		return p;
	}
}