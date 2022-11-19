package main;
import java.util.Scanner;

public class Test1087{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int s,n,i,x,y;
		s=0;
		n=input.nextInt();
		for(i=1;i<=n;i++)
		{
			x=input.nextInt();
			y=input.nextInt();
			if(s<f(x,y))
				s=f(x,y);
		}
		System.out.print(s);
	}
	static int f(int x,int y)
	{
		int p,z;
		p=0;
		for(z=x;z<=y;z++)
			if(z%2!=0) p+=z;
		return p;
	}

}