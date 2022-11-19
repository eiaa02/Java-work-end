import java.util.Scanner;

public class Test1064 {
	public static void main(String[] args) {
		double x,count=0;
		x = new Scanner(System.in).nextDouble();
		if(x<10) count+=(x*0.1);
		else if(x<=20) count+=((x-10)*0.075+1);
		else if(x<=40) count+=((x-20)*0.05+1.75);
		else if(x<=60) count+=((x-40)*0.03+2.75);
		else if(x<=100) count+=((x-60)*0.015+3.35);
		else if(x>100) count+=((x-100)*0.01+3.95);
		System.out.print(count);
	}
}
