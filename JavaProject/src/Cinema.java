import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Cinema {

	private Time open;
	private Time close;
	
	Map<Days, Schedule> map = new TreeMap<>();
	
	public Cinema(Time open, Time close) {
		super();
		this.open = open;
		this.close = close;
	}

	public Time getOpen() {
		return open;
	}

	public void setOpen(Time open) {
		this.open = open;
	}

	public Time getClose() {
		return close;
	}

	public void setClose(Time close) {
		this.close = close;
	}
	
	public void addMovie(){
		System.out.println("enter day");
		String myDay = Main.scanner.next();
		for (Days day: Days.values()) {
			if(myDay.equalsIgnoreCase(day.name())){

				Schedule schedule = new Schedule();
				schedule.addSeance();
				
				map.put(day, schedule);
			}
			
		}
		Set<Entry<Days, Schedule>> setMap = map.entrySet();	
		for (Entry<Days, Schedule> entry : setMap) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		System.out.println();
		System.out.println();
	
	}
	

	@Override
	public String toString() {
		return " CINEMA OPEN - " + open + "   ||   CINEMA CLOSE - " + close + "\n \n" + map;
	}
}
