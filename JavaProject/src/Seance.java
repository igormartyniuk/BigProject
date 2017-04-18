import java.util.Set;
import java.util.TreeSet;

public class Seance {

	Movie movie;
	Time StartTime;
	Time EndTime;
	
	public Seance(Movie movie, Time startTime) {
		super();
		this.movie = movie;
		StartTime = startTime;
		EndTime = endTimeSeance();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((EndTime == null) ? 0 : EndTime.hashCode());
		result = prime * result + ((StartTime == null) ? 0 : StartTime.hashCode());
		result = prime * result + ((movie == null) ? 0 : movie.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seance other = (Seance) obj;
		if (EndTime == null) {
			if (other.EndTime != null)
				return false;
		} else if (!EndTime.equals(other.EndTime))
			return false;
		if (StartTime == null) {
			if (other.StartTime != null)
				return false;
		} else if (!StartTime.equals(other.StartTime))
			return false;
		if (movie == null) {
			if (other.movie != null)
				return false;
		} else if (!movie.equals(other.movie))
			return false;
		return true;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Time getStartTime() {
		return StartTime;
	}

	public void setStartTime(Time startTime) {
		StartTime = startTime;
	}

	public Time getEndTime() {
		return EndTime;
	}

	public void setEndTime(Time endTime) {
		EndTime = endTime;
	}

	public Time endTimeSeance(){
		
		int EndTimeM = ((StartTime.getHour()*60) + (StartTime.getMin())  +  ((movie.getTimeDuration().getHour())*60)+ movie.getTimeDuration().getMin())%60;
		int EndTimeH= ((StartTime.getHour()*60) + (StartTime.getMin())  +  ((movie.getTimeDuration().getHour())*60)+ movie.getTimeDuration().getMin())/60;
		EndTime = new Time(EndTimeH, EndTimeM);
		return EndTime;
	}
	
	@Override
	public String toString() {
//		return "Seance [movie=" + movie + ", StartTime=" + StartTime + ", EndTime=" + EndTime + "]\n";
		return  movie + "\n Start time - " + StartTime + "  ||   End time - " + EndTime + "\n \n";
	}

	
	
	
}
