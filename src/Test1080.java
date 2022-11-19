import java.util.Scanner;

public class Test1080 {
	public static void main(String[] args) {
		double a,b,c;
		Scanner input = new Scanner(System.in);
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		if(a+b==c)
			System.out.print("right");
		else
			System.out.print("error");;
	}
}
