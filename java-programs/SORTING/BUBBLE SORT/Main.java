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
		int arr[]=new int[10];
		System.out.println("Enter the numbers : ");
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The number you enter is : ");
		for(int i=0; i<arr.length; i++) {                                
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
        System.out.println("The sorted array is : ");
   for(int i=0;i<arr.length-1;i++){
		for(int j=0; j<arr.length-1-i; j++) {
		 if (arr[j]>arr[j+1]){
		     int temp=arr[j];
		     arr[j]=arr[j+1];
		     arr[j+1]=temp;
		 }
		}
   }
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
