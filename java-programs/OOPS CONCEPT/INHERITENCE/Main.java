/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner; 
class parent{
    void dispaly(){
    System.out.println("om");
}
}
class dog extends parent{
    void show(){
        System.out.println("bark");
    }
}
class cat extends dog{
    void meow(){
        System.out.println("meow");
    }
}
public class Main
{
	public static void main(String[] args) {
	    cat d=new cat();
	    d.show();
	    d.dispaly();
	    d.meow();
	}
}
