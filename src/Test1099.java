public class Test1099{
	public static void main(String[] args) {
		int n,i;
		for(i=100;i<1000;i++){
			int c=0,temp=i;
			while(temp != 0)
			{
				c+=(temp%10)*(temp%10)*(temp%10);
				temp/=10;
			}
			if(i==c)
				System.out.print(i + "");
		}
	}
}