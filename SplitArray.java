package array_day9;

import java.util.Arrays;
import java.util.Scanner;

public class SplitArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        
        int size = sc.nextInt();
        
        int a[]=new int[size];
       
        for(int i=0;i<=a.length-1;i++) {
        	System.out.println("Enter the value for index: "+i);
        	a[i]=sc.nextInt();
        }
        
        System.out.println(Arrays.toString(a));
        int countE=0,countO=0;
        for(int i:a) {
        	if(i%2==0) 
        	  countE++;
        	else
        	  countO++;
        }
        
        int even[]=new int[countE];
        int odd[]=new int[countO];
        int evenI=0,oddI=0;
        for(int i=0;i<=a.length-1;i++) {
        	if(a[i]%2==0) {
        		even[evenI]=a[i];
        		evenI++;
        	}
        	else {
        		odd[oddI]=a[i];
        		oddI++;
        	}
        }
     
        System.out.println(Arrays.toString(even));
        System.out.println(Arrays.toString(odd));
        
	}

}
