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
	int arr[][]=new int[2][2];
	System.out.println("Enter the  determinent value : ");
	Scanner  sc=new Scanner(System.in);
	for(int i=0;i<2;i++){
	    for(int j=0;j<2;j++){
	        arr[i][j]=sc.nextInt();
	    }
	}
	System.out.println("The  determinent you formed is : ");
		for(int i=0;i<2;i++){
	    for(int j=0;j<2;j++){
	        System.out.print(arr[i][j]+" ");
	    }
	    System.out.println(" ");
	}
	}
}
