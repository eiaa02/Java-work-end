package main;
import java.util.Scanner;

public class Test1084{
	static Scanner input = new Scanner(System.in);
	static int f(int x)
	{
		int p,z;
		p=0;
		for(z=1;z<=x;z++)
			if(x%z==0) p++;
		if(p==2) p=1;
		else p=0;
		return p;
	}

	public static void main(String[] args) {
		int s,n,i,x;
		s=0;
		n=input.nextInt();
		for(i=1;i<=n;i++)
		{x=input.nextInt();
			s+=f(x);}
		System.out.print(s);
	}
}