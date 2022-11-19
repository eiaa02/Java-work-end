import java.util.Scanner;

public class Test1109{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n,c=0;
		n=input.nextInt();
		while(n != 0){
			if(n%10%2==0) c+=n%10;
			n/=10;
		}
		System.out.print(c);
	}
}