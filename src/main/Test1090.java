package main;
import java.util.Scanner;

public class Test1090{
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		double n,a,i,s,m;
		s=0;
		a=input.nextInt();
		for(i=1;i<=a;i++)
		{
			n=input.nextInt();
			m=input.nextInt();
			s+=f((int) n, (int) m);
		}
		System.out.print(s);
	}

	static int f(int n,int m)
	{ int p=0,i;
		for(i=1;i<=n||i<=m;i++)
			if(n%i==0&&m%i==0) p=i;
		return p;
	}
}