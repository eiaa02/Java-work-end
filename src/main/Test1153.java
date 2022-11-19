package main;
import java.util.Scanner;

public class Test1153{
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		double n,a,i,s,x;
		x=0;
		s=0;
		a=input.nextDouble();
		for(i=1;i<=a;i++)
		{
			n=input.nextDouble();
			if(f((int) n)==1)
			{ s+=n;
				x++;}
		}
		System.out.print(s/x);
	}

	static double f(int n)
	{ int p = 0;
		if(n>0)
			p=1;
		if(n==0) p=0;
		if(n<0)
			p=-1;
		return p;
	}
}