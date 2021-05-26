import java.util.Scanner;
public class Main
{
	public static void main(String[] args) { 
	    int choice ;
		System.out.println("pick one 1.hi\t 2.hey\t 3.hello\t");
		Scanner s =  new Scanner(System.in);
		choice = s.nextInt();
		switch (choice)
		{
		case 1: System.out.print("you said hi");
		break;
		case 2: System.out.println("you said hey");
		break;
		case 3 : System.out.println("you said hello");
		break;
		default : System.out.println("invalid choice");
		}
		    
		}
}
