import java.util.Scanner;

public class Test1100{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n,i=0;
		n = input.nextInt();
		while(n != 0){
			i+=n%10;
			n/=10;
		}
		System.out.print(i);
	}
}