package main;
import java.util.Scanner;

public class Test1086{
	static Scanner input = new Scanner(System.in);

	static int f(int n, int m)
	{
		int a,b,i,c;
		a=1;
		b=1;
		for(i=1;;i++)
		{
			c=a+b;
			a=b;
			b=c;
			if(c>m&&c<n) System.out.print(c + " ");
			if(c>=n) break;
		}
		return 0;
	}

	public static void main(String[] args) {
		int n,m;
		n=input.nextInt();
		m=input.nextInt();
		f(n,m);
	}
}