import java.util.Scanner;

public class Test1093{
	public static void main(String[] args) {
		int a,max=-1111000;
		while((a = new Scanner(System.in).nextInt()) > 0){
			if(a>max)
				max=a;
		}
		System.out.print(max);
	}
}