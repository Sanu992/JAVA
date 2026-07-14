package array_day8;

import java.util.Arrays;
import java.util.Scanner;

class CopyArrayOddElementAtEvenIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array 1: ");
        
        int size1 = sc.nextInt();
        
        int arr[]=new int[size1];
        
        for(int i=0;i<=arr.length-1;i++) {
        	System.out.println("Enter the value for index: "+i);
        	arr[i]=sc.nextInt();
            
        }
        
        System.out.print("Enter the size of Array 2: ");
        
        int size2 = sc.nextInt();
        
        int arr1[]=new int[size2];
        for(int i=0;i<=arr1.length-1;i++) {
        	System.out.println("Enter the value for index: "+i);
        	arr1[i]=sc.nextInt();
            
        }
        
        int count=0;
        for(int i=0;i<=arr.length-1+arr1.length;i++) {
        	count++;
        }
        int c[]=new int[count];
        
        int index=0;
        
        for(int i=0;i<=arr.length-1;i++) {
        	if(arr[i]%2!=0 && i%2==0) {
        	 c[index]=arr[i];
        	 index++;
        	}
        }
        for(int i=0;i<=arr1.length-1;i++) {
        	if(arr1[i]%2==0 && i%2==0) {
        	 c[index]=arr1[i];
        	 index++;
        	}
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println("New array C");
        System.out.println(Arrays.toString(c));

	}

}
