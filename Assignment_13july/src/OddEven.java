import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int i=sc.nextInt();
		if(i%2==0)
		{
		System.out.println("Even");
		}
		else if(i%2!=0)
		{
		System.out.println("odd");
		}

	}

}
