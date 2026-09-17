/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
class student{
void display(){
    System.out.println("I AM STUDENT");
}
}
class teacher extends student{
void display(){
    super.display();
    System.out.println("I AM WAR TEACHER");
}
}
public class Main
{
	public static void main(String[] args) {
	    teacher t= new teacher();
	    t.display();
	
	}
}
