import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Schedule{
	
	Set <Seance> set = new HashSet <Seance>();
	List<Time> listStartTime = new ArrayList<>();
	
	public void addSeance(){
		
		
			

		System.out.println("enter film Name");
		String title = Main.scanner.next();
		
		System.out.println("enter time duration hour");
		int hourD = Main.scanner.nextInt();
		System.out.println("enter time duration min");
		int minD = Main.scanner.nextInt();
		boolean on = true;
		while(on == true){
			System.err.println("enter 1 - add seance");
			System.err.println("enter 2 - continue");
			int choise = Main.scanner.nextInt(); 
			switch (choise) {
			case 1:{
				
				System.out.println("enter start time: hour");
				int hourS = Main.scanner.nextInt();
				System.out.println("enter time duration min");
				int minS = Main.scanner.nextInt();
				List<Time> list = new ArrayList<>();
				list.add(new Time(hourS, minS));
				listStartTime = list;
				break;
			}
			
			case 2:{
				on = false;
			}
				
				break;

			default:
				System.out.println("wrong input");
				break;
			}
			
		
			
		}
		set.add(new Seance(new Movie(title, new Time(hourD, minD)), listStartTime));
		
//
//		listStartTime.add(new Time(9, 30));
//		listStartTime.add(new Time(9, 50));
//		listStartTime.add(new Time(11, 30));
//		
//		set.add(new Seance(new Movie("HULK", new Time(2, 30)), listStartTime));
//		
//		set.add(new Seance(new Movie("GODZILA", new Time(1, 20)), listStartTime));
	}
	
	public void removeSeance(){
	
		System.out.println("enter film Name for removing");
		String title = Main.scanner.next();
		boolean status = false;
		for (Seance seance : set) {
			System.out.println(seance.movie.getTitle());
				if(title.equalsIgnoreCase(seance.movie.getTitle())){
					System.out.println("film - "+ title + " is remove");
					set.remove(seance);
					status = true;
					break;
	
			}
				
		}
		if(status == false){
		System.out.println("wrong film name");
		}
	}
	
	public void filmDetail(){
		System.out.println("enter film Name");
		String title = Main.scanner.next();
		boolean status = false;
		for (Seance seance : set) {
			System.out.println(seance.movie.getTitle());
				if(title.equalsIgnoreCase(seance.movie.getTitle())){
					System.out.println("film - "+ title);
					System.out.println("duration time - " + seance.getMovie().getTimeDuration());
					System.out.println(seance.StartTime);
					System.out.println("");
					status = true;
					break;
	
			}
				if(status == false){
					System.out.println("wrong film name");
					}
				
		}
	}

	@Override
	public String toString() {
		return " \n " + set + "\n \n";
	}



	
	
	
	
	
	
	
}
