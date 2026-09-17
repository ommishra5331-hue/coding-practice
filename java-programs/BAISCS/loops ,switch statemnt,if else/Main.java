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
	    //for loop:
	    int n,i=0,fact=1,factorial=1,fac=1,a,b,button;
	    System.out.println("Enter the number");
	    Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    for(int j=0;j<n;j++){
	         fact=fact*(n-j);
	    }
	    System.out.println("the factorial of the number is : "+fact);
	    //while loop 
	    while(i<n){
	        factorial=factorial*(n-i);
	        i++;
	    }
	    System.out.println("the factorial of the number is "+factorial);
	    //do while:-
	    do{
	          fac=fac*(n-i);
	          i++; 
	    }while(i<=n);
	    System.out.println("the factorial of the number is "+ fac);
	    System.out.print("Enter the first number : ");
	    a=sc.nextInt();
	    	    System.out.print("Enter the second number : ");
	    b=sc.nextInt();
	    System.out.println("Press 1 for addition");
	      System.out.println("Press 2 for substraction");
	        System.out.println("Press 3 for multiplication");
	          System.out.println("Press 4 for division");
	    button=sc.nextInt();
	    //switch Statement:
	    switch(button){
	        case 1:
	             System.out.println(a+b);
	             break;
	        case 2:
	                 System.out.println(a-b);
	                 break;
	         case 3:
	                System.out.println(a*b);
	                break;
	         case 4:
	                  System.out.println(a/b);
	                  break;
	    }
	    
	    //if else:
	    if(a>b){
	             System.out.println("a is greater than b");
	    }
	    else{
	            System.out.println("Not defined");
	    }
	}
	
}
