import java.util.Scanner;

public class Test1112{
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int repeat,n,x,c;
		repeat=input.nextInt();
		while(repeat-- != 0){
			x=input.nextInt();
			n=input.nextInt();
			c=1;
			while(n-- != 0){
				c*=x;
			}
			System.out.print(c + " ");
		}
	}
}