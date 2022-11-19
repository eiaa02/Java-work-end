package main;
import java.util.Scanner;

public class Test1118{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n,s,i,x,y;
		n=input.nextInt();
		s=0;
		for(i=1;i<=n;i++)
		{
			x=input.nextInt();
			y=input.nextInt();
			s+=f(x,y);}
		System.out.print(s);
	}

	static int f(int x,int y)
	{
		int z,i;
		for(z=2;;z++)
			if(z%x==0&&z%y==0)
				break;
		return z;
	}
}