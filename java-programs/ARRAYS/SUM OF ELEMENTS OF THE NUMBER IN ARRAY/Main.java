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
	    int sum=0;
	    System.out.println("Enter the  number : ");
	    Scanner sc=new Scanner(System.in);
	    int arr[]=new int[5];
	 for(int i=0;i<arr.length;i++){
	        arr[i]=sc.nextInt();
	 }
	    System.out.print("The number you enter is : ");
	for(int i=0;i<arr.length;i++){
	    System.out.print(arr[i]);
	}

	for(int i=0;i<arr.length;i++){
	    sum=sum+arr[i];
	}
	System.out.println(" ");
	System.out.println("the sum of the digits of the number you entered is "+sum);
	}
}
