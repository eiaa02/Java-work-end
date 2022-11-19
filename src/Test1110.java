import java.util.Scanner;

public class Test1110{
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int n,c;
		n=input.nextInt();
		while(n>9){
			c=0;
			while(n != 0){
				c+=n%10;
				n/=10;
			}
			n=c;
		}
		System.out.print(n);
	}
}