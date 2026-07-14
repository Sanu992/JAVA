package array_day8;

import java.util.Scanner;

public class CountFrequencyArray {

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
        	int val=arr[i];
        	if(val==-1)
        		continue;
        	 int count=0;
        	for(int j=0;j<=arr.length-1;j++) {
        		if(val==arr[j]) {
        			arr[j]=1;
        			count++;
        		}
        	}
        	System.out.println("Frequency of "+val+" is "+count);
        }
        
        
	}

}
