package pattern_day5;
//Error!
import java.util.Scanner;

public class OneZeroPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int rows=sc.nextInt();
		int step=0;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				step++;
				if(step%2==0) 
				System.out.print("0");
				else
				System.out.print("1");
			}
			System.out.println();
		
	}
}

}
