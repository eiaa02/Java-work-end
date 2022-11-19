import java.util.Scanner;

public class Test1069 {
	static int[] day_num={0,31,28,31,30,31,30,31,31,30,31,30,31};

	public static void main(String[] args) {
		int year,month;
		Scanner input = new Scanner(System.in);
		year = input.nextInt();
		month = input.nextInt();
		if(month==2&&(year%100!=0 && year%4==0 ||year%400==0))
			System.out.print(29);
		else System.out.print(day_num[month]);
	}
}
