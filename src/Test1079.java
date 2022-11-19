import java.util.Scanner;

public class Test1079 {
	public static void main(String[] args) {
		double a;
		Scanner input = new Scanner(System.in);
		a = input.nextDouble();
		if(a<=50)
			System.out.print(a*0.15);
		else
			System.out.print((a-50)*0.25+7.5);
	}
}
