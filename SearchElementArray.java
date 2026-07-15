package array_day8;

import java.util.Scanner;

public class SearchElementArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        
        int size = sc.nextInt();
        
        int arr[]=new int[size];
       
        for(int i=0;i<=arr.length-1;i++) {
        	System.out.println("Enter the value for index: "+i);
        	arr[i]=sc.nextInt();
        }
        System.out.println("Search a element:");
        int search=sc.nextInt();
        for(int i=0;i<=arr.length-1;i++) {
        	if(search==arr[i]) {
        		System.out.println("Element found:");
        		System.out.print(arr[i]);
        		break;
        	}
        	else {
        		 System.out.println("Element not found"); 
        		 break;
        	}
        	
        }
       
	}

}
