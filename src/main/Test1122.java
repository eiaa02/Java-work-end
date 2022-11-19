package main;
import java.util.Scanner;

public class Test1122{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		double n,x,y,m;
		n=input.nextInt();
		m=input.nextInt();
		x=(1+n)*n/2;
		y=(1+m)*m/2;
		System.out.print(x+y);
	}
}