package array_day8;

import java.util.Scanner;

public class CountNumberOfOccurence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        
        int size = sc.nextInt();
        
        int arr[]=new int[size];
       
        for(int i=0;i<=arr.length-1;i++) {
        	System.out.println("Enter the value for index: "+i);
        	arr[i]=sc.nextInt();
        }
        int count=0;
        System.out.println("Select a element:");
        int search=sc.nextInt();
        for(int i=0;i<=arr.length-1;i++) {
        	if(search==arr[i]) {
        		count++;
        	}
        	
        	
        }
        if(count==0)
        	System.out.println("Element not present");
        else
        	System.out.println(search+" Occurenced "+count);

	}

}
