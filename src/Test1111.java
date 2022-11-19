import java.util.Scanner;

public class Test1111{
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int n;
		double a,c=0;
		n=input.nextInt();
		int i=n;
		while(i-- != 0){
			a=input.nextInt();
			c+=a;
		}
		System.out.print(c/n);
	}
}