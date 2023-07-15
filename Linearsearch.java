package linear_search;

import java.util.Scanner;

public class Linearsearch{
	public static void main(String args[] ) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size");
        int n= scanner.nextInt();
        System.out.println("Enter array Elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println("Enter the number need to search" );
        int b = scanner.nextInt();
        scanner.close();
        System.out.print(searching(arr,b));
	}
	static int searching(int arr[],int b) {
		int count = 0;
		for(int i=0;i<arr.length;i++){
            if(arr[i]==b) {
            	count++;
            }
        }
		return count;
	}
}