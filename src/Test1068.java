import java.util.Scanner;

public class Test1068 {
	public static void main(String[] args) {
		int t,wage;
		t = new Scanner(System.in).nextInt();
		if(t<=4)
			wage=50;
		else
		if(t<=8)
			wage=(t-4)*20+50;
		else
			wage=(t-8)*30+130;
		System.out.println(wage);
	}
}
