import java.util.Scanner;

public class Test1077 {
	public static void main(String[] args) {
		int x,a,b,c,d;
		x = new Scanner(System.in).nextInt();
		a=x/10000;
		b=x/1000%10;
		c=x/10%10;
		d=x%10;
		if(a==d&&b==c)
			System.out.print("YES");
		else
			System.out.print("No");
	}
}
