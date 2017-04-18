import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		Cinema cinema = new Cinema(new Time(9, 00), new Time(24, 00));
		
		
		while (true) {
			System.out.println("enter 1 - add movie");
			System.out.println("enter 2 - exit");
			int choise = scanner.nextInt();
			switch (choise) {
			case 1:{
				cinema.addMovie();
			}
			case 2:{
				System.exit(0);
			}
				
				break;

			default:
				break;
			}
		}
		
		
	}


	
}
