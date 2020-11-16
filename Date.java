package es.unileon.prg1.date;

public class Date {
	private int day;
	private int month;
	private int year;
	//
	private int same;
	public Date (int day, int month, int year) throws DateException {
		//this.month = month;
		this.setMonth(month);
		//this.day = day;
		this.setDay(day);
		//this.year = year;
		this.setYear(year);
	}
	
	public void setDay(int day) throws DateException {
		if ( day < 1 || day > this.getDaysOfMonth() ) {
			throw new DateException("Date error: Day " + day + " of month " + this.month + " not valid");			
		}
		this.day = day;
	}
	
	public void setMonth (int month) throws DateException {
		if ( month < 1 || month > 12) {
			throw new DateException("Date error: Month " + month + " not valid");
		}
		this.month = month;
	}
	
	public void setYear (int year) {
		this.year = year;
	}
	//Metodos get
	public int getYear(){
		return this.year;
	}
	public int getMonth(){
		return this.month;
	}
	public int getDay(){
		return this.day;
	}
	public int getSame(){
		return this.same;
	}
	//Metodos is same con if
	boolean isSameYear(Date another){
		if ( this.year == another.getYear() ){
			return true;
		}
		return false;
	}
	
	boolean isSameMonth(Date another){
		
		if ( this.month == another.getMonth() ){
			return true;
		}
		return false;
	}
	
	boolean isSameDay(Date another){
		
		if ( this.day == another.getDay() ){
			return true;
		}
		return false;
	}
	
	boolean isSame(Date another){
		
		if ( this.isSameDay(another) && this.isSameMonth(another) && this.isSameYear(another)){
			return true;
		}
		return false;
	}
	//metodos sin if
	boolean isSameYear2(Date another){
		while(this.year == another.getYear()) {
			return true;
		}
		return false;
		
	}
	
	boolean isSameMonth2(Date another){
		boolean x=(this.getMonth()==another.getMonth());
		return x;
		
	}
	
	boolean isSameDay2(Date another){
		
		int x=this.getDay();
		int y=another.getDay();
		int comp=(x==y) ? 1: 0;
			switch(comp) {
			case 1:
				return true;
			default:
				return false;
			}
		
		
	}
	
	boolean isSame2(Date another){
		
		while(this.year != another.getYear()) {
			return false;
		}
		return true;
	}
	//
	private int getDaysOfMonth() {
		int numDays;
		
		numDays = 0;
		switch (this.month) {
		case 1: //next
		case 3: //next
		case 5: //next
		case 7: //next
		case 8: //next
		case 10: //next
		case 12:
			numDays = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			numDays = 30;
			break;
		case 2:
			numDays = 28;
			break;			
		}
		
		return numDays;
	}
	
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}

}