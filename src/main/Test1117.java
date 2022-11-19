package main;
import java.util.Scanner;

public class Test1117{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int min,max,s,i;
		min=input.nextInt();
		max=input.nextInt();
		s=0;
		for(i=min;i<=max;i++)
			s+=f(i);
		System.out.print(s);
	}

	static int f(int i)
	{
		int z;
		for(z=2;z<i;z++)
		{if(i%z==0) i=0;
		else i=i;}
		return i;
	}
}