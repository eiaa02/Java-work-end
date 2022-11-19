package main;
import java.util.Scanner;

public class Test1154{
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		double n,a,i;
		a=input.nextDouble();
		for(i=1;i<=a;i++)
		{
			n=input.nextDouble();
			System.out.print(f((int) n) + " ");
		}
	}

	static int f(int n)
	{ int s=0;
		if(n<=9) s=n;
		else
			while(n!=0)
			{
				while(n!=0)
				{
					s+=n%10;
					n/=10;
				}
				if(s<10) break;
				if(s>9)
				{n=s;
					s=0;}
			}
		return s;
	}
}