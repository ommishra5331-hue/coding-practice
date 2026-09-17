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
		int flage=0,j;
		Scanner sc =new Scanner(System.in);
		int arr[]=new int[5];
		System.out.print("Enter the numbers : ");
		for (int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("the number you entered is : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +",");
		}
		System.out.println(" ");
		System.out.println("Enter the number you want to search : ");
		int search=sc.nextInt();
		for(j=0; j<arr.length; j++) {
			if(arr[j]==search) {
				flage=1;
				break;
			}
		}
		if(flage==1) {
			System.out.println("The number has been found at the index "+j);
		}
		else {
			System.out.println("The number has not been found");
		}
	}
}
