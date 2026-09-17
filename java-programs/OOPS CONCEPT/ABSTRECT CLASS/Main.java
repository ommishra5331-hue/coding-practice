/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

 abstract class student{
    abstract void sound();
     void eat(){
         System.out.println("eating");
     }
 }
     
    class animal extends student{
    void sound()
    {
        System.out.println("Dog Barks");
    }

    }
public class Main
{
	public static void main(String[] args) {
	 
	 animal s=new animal();
	 s.sound();
	}
}
