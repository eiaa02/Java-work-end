import java.util.Scanner;

public class Test1105{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n,c=0,i;
		n = input.nextInt();
		for(i=1;i<=n;i++){
			if(n%i==0)c++;
		}
		System.out.print(c);
	}
}