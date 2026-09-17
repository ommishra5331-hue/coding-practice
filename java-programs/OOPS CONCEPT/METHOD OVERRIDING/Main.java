/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
	class student{
		    void display(int a,String b,String c){
		         int age=a;
		        String name=b;
		        String nam=c;
		        System.out.println(age);
		        System.out.println(name);
		              System.out.println(nam);
		    }
	}
		    
	class teacher extends student{
		      void display(int e,String f,String p){
		        int age1=e;
		        String name1=f;
		        String name2=p;
		        System.out.println(age1);
		        System.out.println(name1);
		        System.out.println(name2);
		 }   
	}
public class Main
{
	public static void main(String[] args) {
	    teacher t=new teacher();
	    t.display(18,"om mishra","vijay");
	}
}
