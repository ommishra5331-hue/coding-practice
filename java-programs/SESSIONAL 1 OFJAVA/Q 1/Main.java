/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
/*Create a java class player containing the following data members,playername,runs scored ,matches played,wicket taken,implements approprate constructors and member method to initialize and display player information,create two player objects to store the detail of the two players ,write a java program to perform the following operations:
1)display the player with highest run scored
2)dis[play the player with highest number of wickets
3)calculate and dispalyu the average runs per match for each player

*/
class player {
	String name;
	int run;
	int matches;
	int wickets;
	void display() {
		System.out.println("The name of the player is : "+ name);
		System.out.println("The run scored by the player is : "+ run);
		System.out.println("The matches played by the player is : "+matches);
		System.out.println("The wickets taken by the player is : "+wickets);
	}

}
public class Main {
	public static void main(String[] args) {

		player p1=new player();
		System.out.println("The information of the first player:- ");
		System.out.println( " ");
		p1.name="hardik pandya";
		p1.run=99;
		p1.matches=3;
		p1.wickets=12;

		player p2=new player();
		p2.name="shami";
		p2.run=67;
		p2.matches=3;
		p2.wickets=22;
		p1.display();
		System.out.println( " ");
		System.out.println("The information of the second player :-");

		p2.display();
		System.out.println( " ");
		if (p1.run>p2.run) {
			System.out.println(p1.name+" is scored highest score of "+p1.run);
		}
		else if(p2.run>p1.run) {
			System.out.println(p2.name+" is scored highest score of "+p2.run);
		}
		else {
			System.out.println("can not find");
		}
		
		System.out.println( " ");
		if (p1.wickets>p2.wickets) {
			System.out.println(p1.name+" is scored highest wicket taker with wickets  "+p1.wickets);
		}
		else if(p2.wickets>p1.wickets) {
			System.out.println(p2.name+ "is scored highest wicket taker with wickets  "+p2.wickets);
		}
		else {
			System.out.println("can not find");
		}
	System.out.println( " ");
	int avg1=p1.run/p1.matches;
	int avg2=p2.run/p2.matches;
	System.out.println("the average of the "+ p1.name+ " is "+ avg1);
	System.out.println("the average of the "+ p2.name+ " is "+ avg2);
	
	}
}
