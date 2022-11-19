import java.util.Scanner;

public class Test1102{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n,c=0;
		while((n = input.nextInt()) != 0)
			c+=n;
		System.out.print(c);
	}
}