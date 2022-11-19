package main;
import java.util.Scanner;

public class Test1120{
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int n;
		n=input.nextInt();
		while(n != 0)
		{n=input.nextInt();
			if(f(n)>0)
				System.out.print(f(n) + " ");
		}
	}

	static int f(int n)
	{
		int p,i,s;
		s=0;
		p=n;
		while(n>0)
		{s+=n%10;
			n=n/10;}
		if(s%2!=0)
			return p;
		return 0;
	}
}