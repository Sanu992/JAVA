package array_day8;

import java.util.Arrays;
import java.util.Scanner;

public class LessThanAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        
        int size = sc.nextInt();
        
        int arr[]=new int[size];
       
        for(int i=0;i<=arr.length-1;i++) {
        	System.out.println("Enter the value for index: "+i);
        	arr[i]=sc.nextInt();
            
        }
        int sum=0;
        double avg=0;
        for(int i=0;i<=arr.length-1;i++) {
        	 
        	   sum+=arr[i];
        	 }
        System.out.println("Average of element of the array:");
        avg=(double)sum/arr.length; 
        System.out.println(avg);
        
        System.out.println("Element in array which less than avg of all elements:");
        for(int i=0;i<=arr.length-1;i++) {
        	if(arr[i]<avg) {
        		System.out.println(arr[i]);
        	}
        }
	}

}
