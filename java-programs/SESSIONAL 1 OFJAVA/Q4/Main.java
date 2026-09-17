/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
/*create a class movie ticket containhg the following data members movie name,seat type(silver /gold/platinium),nuymber of tickets
,tickets price,implement approprate consuctors and member method to calculate thetotalbooking account:
apply the following discount policy :_
1)more than 5 tickets :-10% discount 
2)more than 10 tickerts :-20 % discount
*/
import java.util.Scanner;
class movieticket{
    String name;
    String seattype;
    int tickets;
    int price;
    
}
public class Main
{
	public static void main(String[] args) {
	    int sum1,sum2;
	    movieticket m1=new movieticket();
	    Scanner sc=new Scanner(System.in);
	    
	    System.out.println("enter the movie name : ");
	    m1.name=sc.next();
	    	    System.out.println("enter the seat type name : ");
	    m1.seattype=sc.next();
	    	    System.out.println("enter the number of tickets : ");
	    m1.tickets=sc.nextInt();
	    	    System.out.println("enter the price of the tickets : ");
	    m1.price=sc.nextInt();
	    if (m1.tickets>5){
	         sum1=m1.price-(m1.price)/10;
	         System.out.println("the price the of tickets after the discount is : "+sum1);
	    }
	    else if (m1.tickets>10){
	         sum2=m1.price-(m1.price)/5;
	         System.out.println("the price the of tickets after the discount is : "+sum2);
	    }
	  
	}
}
