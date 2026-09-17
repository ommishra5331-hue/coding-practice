/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
class name{
    void display(){
        System.out.println("hey my name is om ");
    }
}
 //default values print karana ka program:-
class obj{
    void show(){
          System.out.println("default value of int is: "+b);
           System.out.println("default value of double is :"+d);
           System.out.println("default value of int is: "+f);
           System.out.println("default value of double is :"+n);
             System.out.println("default value of int is: "+b);
    }
    int n;
    double d;
    float f;
    byte b;
    boolean p;
}
public class Main{
    public static void main(String[] args){
        //class ka object banan:-
        name b=new name();
        b.display();
        //default values print kartana ka program:-
        obj z=new obj();//object creation
        z.show();
    }
    
}
