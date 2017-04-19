import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		Cinema cinema = new Cinema(new Time(9, 00), new Time(24, 00));
		
		
		while (true) {
			System.out.println("enter 1 - add movie");
			System.out.println("enter 2 - Show Schedule");
			System.out.println("enter 3 - movie detail");
			System.out.println("enter 4 - remove movie");
			System.out.println("enter 5 - exit");
			int choise = scanner.nextInt();
			switch (choise) {
			case 1:{
				cinema.addMovie();
				break;
			}
			case 2:{
				System.out.println(cinema);
				break;
			}
			
			case 3:{
				cinema.detail();
				break;
			}
			
			case 4:{
				cinema.removeMovie();
			}
			
			case 5:{
				System.exit(0);
			}
				
				break;

			default:
				break;
			}
		}
		
		
	}


	
}
