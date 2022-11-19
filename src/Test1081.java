import java.util.Scanner;

public class Test1081 {
	public static void main(String[] args) {
		double a;
		a = new Scanner(System.in).nextDouble();
		if(a<=10)
			System.out.print("30");
		else
		if(a<=50) System.out.print(a*3);
		else System.out.print(a*2.5);
	}
}
