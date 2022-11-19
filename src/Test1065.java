import java.util.Scanner;

public class Test1065 {
	public static void main(String[] args) {
		double x,count=0;
		x = new Scanner(System.in).nextDouble();
		if(x<=1000){
		}
		else{
			if(x<=3000)
				count = x*0.03;
			else
			if(x<=5000)
				count = x*0.04;
			else
				count = x*0.06;
		}
		System.out.print(count);
	}
}
