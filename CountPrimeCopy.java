package array_day8;

import java.util.*;

public class CountPrimeCopy {
	public static boolean isPrime(int n) {
		if (n < 2) {
	        return false;
	    }

	    int count = 0;

	    for (int i = 1; i <= n; i++) {
	        if (n % i == 0) {
	            count++;
	        }
	    }
		return count==2;
	}
	
	public static int countPrime(int a[]) {
		int count=0;
		for(int i=0;i<=a.length-1;i++) 
		{
			if(i%2==1 && isPrime(a[i])) {
				count++;
			}
			
		}
		return count;
	}
	
//	public static int countOdd(int temp[]) {
//	int odd=0;
//	for(int i=0;i<=temp.length-1;i++) {
//		if(i%2!=0) {
//	
//		odd++;
//		}
//	
//	}
//	 return odd;
//	}
	
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
        
        int count1=countPrime(arr);
        int count2=countPrime(arr1);
        
        int c[]=new int[count1+count2];
        
        int index=0;
        
        for(int i=0;i<=arr.length-1;i++) {
        	if(isPrime(arr[i]) && i%2!=0) {
        	
        	 c[index]=arr[i];
        	 index++;
        	
        	}
        }
        for(int i=0;i<=arr1.length-1;i++) {
        	if(isPrime(arr1[i])&& i%2!=0) {
        	
        	 c[index]=arr1[i];
        	 index++;
        	
        	}
        }
System.out.println(Arrays.toString(c));
	}

}
