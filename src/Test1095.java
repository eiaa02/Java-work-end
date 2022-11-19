import java.util.Scanner;

public class Test1095{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n,i;
		double c = 0;
		n = input.nextInt();
		for(i=1;i<=n;i++){
			c+=1.0/(3*i-2);
		}
		System.out.print(c);
	}
}