import java.util.Scanner;

public class Test1071 {
	public static void main(String[] args) {
		int x,y,z;
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		y = input.nextInt();
		z = input.nextInt();
		if(x<y) x=y;
		if(x<z) x=z;
		System.out.print(x);
	}
}
