/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
	class student{
		    void display(int a,String b){
		         int age=a;
		        String name=b;
		        System.out.println(age);
		        System.out.println(name);
		    }
		    void display(String e,int d ,String c){
		        int n=d;
		        String m=e;
		        String p=c;
		        System.out.println(n);
		        System.out.println(m);
		        System.out.println(p);
		    }
	}
		      
public class Main
{
	public static void main(String[] args) {
	    student s=new student();
	    s.display(18,"om");
	   // System.out.println();
		}
}
