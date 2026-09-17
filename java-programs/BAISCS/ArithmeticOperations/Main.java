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
	   int a ,b,sum,mul,sub;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the first Number");
	   a=sc.nextInt();
	   System.out.println("enter the second number");
	   b=sc.nextInt();
	   //addition 
	  sum=a+b;
	   System.out.println("the adddition of the two number is :"+sum);
	   //multiplicatiobn
	   mul=a*b;
	    System.out.println("the multiplicatiobn of two numbver is:"+mul);
	    //subtraction
	    sub=a-b;
	    System.out.println("the substraction of the number is :"+sub);
}
}