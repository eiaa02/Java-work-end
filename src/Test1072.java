import java.util.Scanner;

public class Test1072 {
	public static void main(String[] args) {
		int x,y;
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		y = f(x);
		System.out.print(y);
	}

	public static int f(int x){
		if(x>0)
			return 1;
		if(x==0)
			return 0;
		return -1;
	}
}
