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
		int arr1[][]=new int[2][2];
		int arr2[][]=new int[2][2];
		int sum[][]=new int[2][2];
		System.out.println("Enter the  1 determinent value : ");
		Scanner  sc=new Scanner(System.in);
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("The  1 determinent you formed is : ");
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println(" ");
	}
	System.out.println("The  2 determinent you formed is : ");
	for(int i=0; i<2; i++) {
		for(int j=0; j<2; j++) {
			arr2[i][j]=sc.nextInt();
		}
	}
	for(int i=0; i<2; i++) {
		for(int j=0; j<2; j++) {
			System.out.print(arr2[i][j]+" ");
		}
		System.out.println(" ");
	}
		System.out.println("The  sum of the  determinent you formed is : ");
	for(int i=0; i<2; i++) {
		for(int j=0; j<2; j++) {
		    sum[i][j]=arr1[i][j]+arr2[i][j];
		    System.out.print(sum[i][j]+" ");
		}
		System.out.println(" ");
	}
}


}
