import java.util.ArrayList;
import java.util.List;

public class Seance {

	Movie movie;
	List<Time> StartTime;
	Time EndTime;
	public void setStartTime(List<Time> startTime) {
		StartTime = startTime;
	}


	
	public Seance(Movie movie, List<Time> startTime) {
		super();
		this.movie = movie;
		StartTime = startTime;
		EndTime = endTimeSeance();
	}



	public Movie getMovie() {
		return movie;
	}



	public void setMovie(Movie movie) {
		this.movie = movie;
	}



	public Time getEndTime() {
		return EndTime;
	}



	public void setEndTime(Time endTime) {
		EndTime = endTime;
	}



	public List<Time> getStartTime() {
		return StartTime;
	}



	public Time endTimeSeance(){
		
		for (int i = 0; i < StartTime.size(); i++) {
			int EndTimeM = ((StartTime.get(i).getHour()*60) + (StartTime.get(i).getMin())  +  ((movie.getTimeDuration().getHour())*60)+ movie.getTimeDuration().getMin())%60;
			int EndTimeH = ((StartTime.get(i).getHour()*60) + (StartTime.get(i).getMin())  +  ((movie.getTimeDuration().getHour())*60)+ movie.getTimeDuration().getMin())/60;;
			EndTime = new Time(EndTimeH, EndTimeM);
		}
		
		
		return EndTime;
	}
	
	@Override
	public String toString() {
		return  movie + "\n Start time - " + StartTime + "\n \n";
	}

	
	
	
}
