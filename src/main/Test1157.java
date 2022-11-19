package main;
import java.util.Scanner;

public class Test1157{
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		double s,e,num;
		s=0;
		num=0;
		e=input.nextDouble();
		while(true)
		{ if(1/f(num)<e)
			break;
			s+=1/f(num);
			num++;
		}
		System.out.print(s);
	}

	static double f(double num)
	{
		if(num==0||num==1)
			return 1;
		else
			return f(num-1)+f(num-2);
	}
}