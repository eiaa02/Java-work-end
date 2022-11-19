import java.util.Scanner;

public class Test1063 {
	public static void main(String[] args) {
		int num = new Scanner(System.in).nextInt();
		if(num % 17 != 0)
			System.out.print("0");
		else
			System.out.print("1");
	}
}