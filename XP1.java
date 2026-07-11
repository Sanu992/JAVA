package day4;

import java.util.Scanner;

public class XP1 {
	
	public static void isPerfect(int n) {
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		if(sum==n) {
			System.out.println("Sum is perfect number");
		}
		else {
			System.out.println("Sum is not perfect number");
		}
	}
	
	public static void isSpyNumber(int n) {
		int sum=0;
		int pro=1;
		while(n>0) 
		{
			int ld=n%10;
			sum+=ld;
			pro*=ld;
			n/=10;
		}
		if(sum==pro) {
			System.out.println("Spy number");
		}
		else {
			System.out.println("Not a Spy Number");
		}
	}
	
	
	public static boolean isXhylem(int n) {
		int last=n%10;
		n=n/10;
		int meanSum=0;
		while(n>9)
		{
			int ld=n%10;
			meanSum+=ld;
			n/=10;
		}
		int extermeSum=last+n;
		if(meanSum==extermeSum) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n =  sc.nextInt();
		
		int pro=1;
		int sum=0;
		int temp1=n,temp2=n;
		if(isXhylem(n)) {
			while(temp1>0) {
				int ld=temp1%10;
				sum+=ld;
				temp1/=10;
			}
			isPerfect(sum);
		}
		else{
			while(temp2>0) {
				int ld=temp2%10;
				pro*=ld;
				temp2/=10;
			}
			isSpyNumber(pro);
		}
		
   }
      
	

}
