import java.util.Scanner;

public class Test1078 {
	public static void main(String[] args) {
		char a;
		a = new Scanner(System.in).next().charAt(0);
		if(a>64&&a<91)
			a+=32;
		System.out.print(a);
	}
}
