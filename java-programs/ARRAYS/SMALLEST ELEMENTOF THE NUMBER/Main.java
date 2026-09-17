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
		System.out.println("Enter the number");
		int arr[]=new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("The number you enter is : ");
		for(int i=0;i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println(" ");
		int min=arr[0];
		for (int i=1;i<arr.length;i++){
		if(arr[0]<min){
		    min=arr[i];
		}
		}
		System.out.println("The smallest element of ths number is : "+min);
	}
}
