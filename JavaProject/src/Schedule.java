import java.util.HashSet;
import java.util.Set;

public class Schedule{
	
	Set <Seance> set = new HashSet <Seance>();
	
	public void addSeance(){
		
		set.add(new Seance(new Movie("HULK", new Time(2, 30)), new Time(10, 20)));
		set.add(new Seance(new Movie("GODZILA", new Time(1, 30)), new Time(12, 30)));
		set.add(new Seance(new Movie("TOR", new Time(1, 50)), new Time(15, 10)));		

//
//			System.out.println(set);
//
//		
//
//		
//		System.out.println("enter film Name");
//		String title = Main.scanner.next();
//		
//		System.out.println("enter time duration hour");
//		int hourD = Main.scanner.nextInt();
//		System.out.println("enter time duration min");
//		int minD = Main.scanner.nextInt();
//		
//		System.out.println("enter start time: hour");
//		int hourS = Main.scanner.nextInt();
//		System.out.println("enter time duration min");
//		int minS = Main.scanner.nextInt();
//		
//		set.add(new Seance(new Movie(title, new Time(hourD, minD)), new Time(hourS, minS)));

//		System.out.println(set);
	}
	
	public void removeSeance(){
		set.add(new Seance(new Movie("HULK", new Time(2, 30)), new Time(10, 20)));
		set.add(new Seance(new Movie("GODZILA", new Time(1, 30)), new Time(12, 30)));
		set.add(new Seance(new Movie("TOR", new Time(1, 50)), new Time(15, 10)));		

		System.out.println("enter film Name for removing");
		String title = Main.scanner.next();
		
		for (Seance seance : set) {
			if(title.equalsIgnoreCase(seance.movie.getTitle())){
				System.out.println("true");
				set.remove(seance);
				break;
			}else{
				System.out.println("false");
			}
		}
		
	}

	@Override
	public String toString() {
		return " \n " + set + "\n \n";
	}



	
	
	
	
	
	
	
}
