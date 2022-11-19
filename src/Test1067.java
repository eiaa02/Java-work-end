import java.util.Scanner;

public class Test1067 {
	public static void main(String[] args) {
		int x;
		x = new Scanner(System.in).nextInt();
		if(x>100||x<0)
			System.out.print("illegal");
		else if(x>=90)
			System.out.print("A");
		else if(x>=60)
			System.out.print("B");
		else
			System.out.print("C");
	}
}
