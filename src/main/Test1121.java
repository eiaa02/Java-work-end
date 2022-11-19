package main;
import java.util.Scanner;

public class Test1121{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int i,a,p,n;
		p=0;
		a=input.nextInt();
		n=input.nextInt();
		for(i=1;i<=n;i++)
			p=p+f(a,i);
		System.out.print(p);
	}

	static int f(int a,int i)
	{
		int z,s;
		s=0;
		for(z=1;z<=i;z++)
			s=s*10+a;
		return s;
	}
}