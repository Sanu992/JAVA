package array_day8;

import java.util.Scanner;

public class PrintUniqueElementArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        
        int size = sc.nextInt();
        
        int arr[]=new int[size];
       
        for(int i=0;i<=arr.length-1;i++) {
        	System.out.println("Enter the value for index: "+i);
        	arr[i]=sc.nextInt();
       
        }
        
        for(int i=0;i<=arr.length-1;i++) {
        	int count=0;
        	int val=arr[i];
        	for(int j=0;j<=arr.length-1;j++) {
        		if(val==arr[j])
        			count++;
        	}
        	if(count==1) {
        		System.out.println(val);
        	}
        }
        
  }

}
