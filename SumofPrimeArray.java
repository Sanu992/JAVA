package array_day8;

import java.util.Scanner;

public class SumofPrimeArray {
	public static boolean isPrime(int n) {
		int count=0;
		for(int i=0;i<=n;i++) 
		{
			if(n%1==0) {
				count++;
			}
			
		}
		return count == 2;
	}
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        
        int size = sc.nextInt();
        
        int arr[]=new int[size];
       
        for(int i=0;i<=arr.length-1;i++) {
        	System.out.println("Enter the value for index: "+i);
        	arr[i]=sc.nextInt();
            
        }
        int sum=0;
        for(int i=0;i<=arr.length-1;i++) {
        	if(i%2!=0) {
        	if(isPrime(arr[i])) {
        		sum+=arr[i];
        	}
        	}
        }
        System.out.println("Prime Sum at odd index:"+sum);
        sc.close();
	}
	

}
