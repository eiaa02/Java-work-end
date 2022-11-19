import java.util.Scanner;

public class Test1123{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int x,n=0,c=0;
		while((x=input.nextInt()) != 0){
			n++;
			c+=x;
		}
		System.out.print(c*1.0/n);
	}
}