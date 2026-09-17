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
	Scanner sc=new Scanner(System.in);
	int arr[]=new int [5];
	System.out.println("Enter the number");
	for(int i=0;i<5;i++){
	    arr[i]=sc.nextInt();
	}
	for(int i=0;i<5;i++){
	    System.out.println("The number you enter is : "+arr[i]);
	}
	}
}
