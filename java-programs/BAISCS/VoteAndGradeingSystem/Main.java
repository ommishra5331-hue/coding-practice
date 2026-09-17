/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
    //VOTE ELIGIBLITY PROGRAM:-
	public static void main(String[] args) {
	    int age;
	System.out.println("Enter your age");
	Scanner sc =new Scanner(System.in);
	age=sc.nextInt();
	if (age>=18){
	    System.out.println("You are cable of giving vote");
	}
	else{
	    System.out.println("YOU ARE NOT CABLE OF GIVING VOTE");
	}
	//GREADE  SHOWING SYSTEM:-
	int n;
    System.out.println("Enter your number");
    n=sc.nextInt();
    if(n>95){
        System.out.println("A");
    }
    else if (n>=90&&n<=95) {
        System.out.println("B");
    }
      else if (n>=80&&n<=90) {
        System.out.println("C");
    }
      else if (n>=70&&n<=80) {
        System.out.println("D");
	}
	  else if(n>=50&&n<=70) {
        System.out.println("E");
}
      else if(n>=30&&n<=50) {
        System.out.println("F");
  }
    else{
        System.out.println("FAIL");
    }
	}
	}