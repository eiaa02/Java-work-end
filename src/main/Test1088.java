package main;
import java.util.Scanner;

public class Test1088{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int s,n,i,x;
		s=0;
		n=input.nextInt();
		for(i=1;i<=n;i++)
		{
			x=input.nextInt();
			s+=fac(x);
		}
		System.out.print(s*1.0/n);
	}

	static int fac(int x)
	{
		int p=1,z;
		for(z=1;z<=x;z++)
			p*=z;
		return p;
	}
}