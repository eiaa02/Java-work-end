import java.util.Scanner;

public class Test1076 {
	public static void main(String[] args) {
		int x,y,z,s;
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		y = input.nextInt();
		z = input.nextInt();
		s = input.nextInt();
		if(x>y) x=y;
		if(x>z) x=z;
		if(x>s) x=s;
		System.out.print(x);
	}
}
