package array_day8;

import java.util.Scanner;

public class ArrayEvenOdd {

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
        	 if(i%2!=0 && arr[i]%2==0) {
        	   sum+=arr[i];
        	 }
        	 
        }
        System.out.println("Even Sum");
        System.out.print(sum);

	}

}
