package array_day8;

import java.util.*;

public class IndexvalueofLastOccurence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        
        int size = sc.nextInt();
        
        int arr[]=new int[size];
       
        for(int i=0;i<=arr.length-1;i++) {
        	System.out.println("Enter the value for index: "+i);
        	arr[i]=sc.nextInt();
        }
        
        System.out.println("Select a key:");
        int key=sc.nextInt();
        System.out.println(Arrays.toString(arr));
        for(int i=arr.length-1;i>=0;i--) {
        	if(arr[i]==key){
        		System.out.println("Element found at index:"+i);
        		return;
        	}	
        }
        System.out.println("Element not present");
	}

}
