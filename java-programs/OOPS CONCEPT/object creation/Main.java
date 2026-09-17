/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
class Student{
    String name;
    int age;
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}
public class Main
{
	public static void main(String[] args) {
	    Student s1=new Student();
	    s1.age=20;
	    s1.name="om";
	    s1.display();
	
	}
}
