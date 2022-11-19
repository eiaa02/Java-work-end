import java.util.Scanner;

public class Test1096{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n,i;
		n = input.nextInt();
		for(i=0;n>=0;i++){
			n = n/2-2;
		}
		System.out.print(i);
	}
}