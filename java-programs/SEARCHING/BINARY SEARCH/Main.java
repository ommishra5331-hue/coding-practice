/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want to search: ");
		int search=sc.nextInt();
		int low=0;
		int high=arr.length-1;
		while(low< =high) {
			int mid=(low+high)/2;
			if(arr[mid]==search) {
				System.out.println("The number has been found at  index : "+mid);
				break;
			}
			else if(search>arr[mid]) {
				low=mid+1;
			}
			else if(search<arr[mid]) {
				low=mid-1;
			}
			else {
				System.out.println("The number you want to search is not available in the array");
			}
		}


	}
}
