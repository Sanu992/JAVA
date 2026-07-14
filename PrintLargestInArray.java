package array_day8;

import java.util.Scanner;

public class PrintLargestInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        
        int size = sc.nextInt();
        
        int arr[]=new int[size];
       
        for(int i=0;i<=arr.length-1;i++) {
        	System.out.println("Enter the value for index: "+i);
        	arr[i]=sc.nextInt();
            
        }
        int largest=arr[0];
        for(int i:arr) {
        	if(i>largest) {
        		largest=i;
        	}
        }
        System.out.println("The largest element:"+largest);
        int smallest=arr[0];
        for(int i:arr) {
        	if(i<smallest) {
        		smallest=i;
        	}
        }
        System.out.println("The smallest element:"+smallest);
	}

}
