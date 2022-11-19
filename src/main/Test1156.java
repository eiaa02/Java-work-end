package main;
import java.util.Scanner;

public class Test1156{
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int n,m,s,p,c,t;
		n=input.nextInt();
		m=input.nextInt();
		s=f(n,m);
		if(n>m)
		{t=n;n=m;m=t;}
		else
			for(p=n;p<=m;p++)
				for(c=2;c<=p;c++)
				{
					if(p==2) {System.out.print(p+" "); break;}
					if(p%c==0) break;
					if(c==p-1) System.out.print(p+" ");}
	}

	static int f(int n, int m)
	{ int s,x,i;
		for(x=1;x<=m;x++)
			for(s=0,i=1;i<x;i++)
			{if(x%i==0) s+=i;
				if(s==x&&i==x-1) {System.out.print(x+" ");
					break;}
				if(i==x-1) break;
			}
		System.out.println();
		return 0;
	}
}