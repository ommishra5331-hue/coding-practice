/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
class Student{
    private int age ;
    public void setage(int a ){
        age=a;
    }
    public int getage(){
        return age;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Student s=new Student();
	     s.setage(18);
	     int n=s.getage();
	     System.out.println(n);
	}
}
