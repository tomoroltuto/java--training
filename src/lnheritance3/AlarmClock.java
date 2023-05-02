package lnheritance3;

public class AlarmClock extends Clock{

	String alarmTime;

	public AlarmClock(String time) {
		super(time);
	}
	
	public void alarm() {
		time = alarmTime;
		System.out.println("アラームが鳴りました!");
	}

	public void setAlarm(String time) {
		this.time = alarmTime;
	}
	
}
