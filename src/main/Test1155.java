package main;
import java.util.Scanner;

public class Test1155{
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num,i=0,n;
		while(true)
		{
			num=input.nextInt();
			if(num==0)
				break;
			n=f(num);
			if(n==1)
				i++;
		}
		System.out.print(i);
	}

	static int f(int num)
	{ int p=0;
		if(num%2==1)
		{System.out.print(num+" ");
			p=1;}
		return p;
	}
}