/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
interface animal{
    void sound();
}
class dog implements animal{
    public void sound(){
        System.out.println("Dog barks");
    }
}
public class Main
{
	public static void main(String[] args) {
	    dog s=new dog();
	     s.sound();
	}
}
