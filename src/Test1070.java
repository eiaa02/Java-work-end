import java.util.Scanner;

public class Test1070 {
	public static void main(String[] args) {
		int x,y,z;
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		y = input.nextInt();
		z = input.nextInt();
		if(x+y>z&&x+z>y&&y+z>x)
			System.out.print("Yes");
		else
			System.out.print("No");
	}
}
