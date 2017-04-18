
public class Time {

	private int hour;
	private int min;
	
	public Time(int hour, int min) {
		super();
		if(min >= 0 && min < 60){
			this.min = min;
			}else{
				System.out.println("a mistyped min - "+ min);
			}
		if(hour >= 0 && hour <=24){
		this.hour = hour;
		}else{
			System.out.println("a mistyped min - "+ hour);
		}
	}
	
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		if(min < 0 && min > 60){
		this.min = min;
		}else{
			System.out.println("Incorect input");
		}
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hourTry) {
		if(hourTry >= 0 && hourTry <= 24){
			hour = hourTry;	
		}else{
			System.out.println("Incorrect input");
		}
	}


	@Override
	public String toString() {
		return "( hour - " + hour + ", min - " + min + ") ";
	}

	
}
