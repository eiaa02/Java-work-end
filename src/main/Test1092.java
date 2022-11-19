package main;
import java.util.Scanner;

public class Test1092{
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		double k,n,i,s;
		s=0;
		n=input.nextDouble();
		k=input.nextDouble();
		for(i=1;i<=n;i++)
			s+=f(i,k);
		System.out.print(s);
	}

	static int f(double i,double k)
	{
		int p=1,a;
		for(a=1;a<=k;a++)
			p*=i;
		return p;
	}
}