package es.unileon.prg1.date;

public class Date {
	private int day;
	private int month;
	private int year;
	//
	private int same;

	public Date(int day, int month, int year) throws DateException {
		// this.month = month;
		this.setMonth(month);
		// this.day = day;
		this.setDay(day);
		// this.year = year;
		this.setYear(year);
	}

	public void setDay(int day) throws DateException {
		if (day < 1 || day > this.getDaysOfMonth()) {
			throw new DateException("Date error: Day " + day + " of month " + this.month + " not valid");
		}
		this.day = day;
	}

	public void setMonth(int month) throws DateException {
		if (month < 1 || month > 12) {
			throw new DateException("Date error: Month " + month + " not valid");
		}
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}

	// Metodos get
	public int getYear() {
		return this.year;
	}

	public int getMonth() {
		return this.month;
	}

	public int getDay() {
		return this.day;
	}

	public int getSame() {
		return this.same;
	}

	// Metodos is same con if
	boolean isSameYear(Date another) {
		if (this.year == another.getYear()) {
			return true;
		}
		return false;
	}

	boolean isSameMonth(Date another) {

		if (this.month == another.getMonth()) {
			return true;
		}
		return false;
	}

	boolean isSameDay(Date another) {

		if (this.day == another.getDay()) {
			return true;
		}
		return false;
	}

	boolean isSame(Date another) {

		if (this.isSameDay(another) && this.isSameMonth(another) && this.isSameYear(another)) {
			return true;
		}
		return false;
	}

	// metodos sin if
	boolean isSameYear2(Date another) {
		while (this.year == another.getYear()) {
			return true;
		}
		return false;

	}

	boolean isSameMonth2(Date another) {
		boolean x = (this.getMonth() == another.getMonth());
		return x;

	}

	boolean isSameDay2(Date another) {

		int x = this.getDay();
		int y = another.getDay();
		int comp = (x == y) ? 1 : 0;
		switch (comp) {
		case 1:
			return true;
		default:
			return false;
		}

	}

	boolean isSame2(Date another) {

		while (this.year != another.getYear()) {
			return true;
		}
		return false;
	}
	// devuelve el nombre de los meses

	public String getmonthName() {

		String monthName = " ";
		switch (month) {
		case 1:
			monthName = "January";
			break;
		case 2:
			monthName = "February";
			break;
		case 3:
			monthName = "March";
			break;
		case 4:
			monthName = "April";
			break;
		case 5:
			monthName = "May";
			break;
		case 6:
			monthName = "June";
			break;
		case 7:
			monthName = "July";
			break;
		case 8:
			monthName = "August";
			break;
		case 9:
			monthName = "September";
			break;
		case 10:
			monthName = "October";
			break;
		case 11:
			monthName = "November";
			break;
		case 12:
			monthName = "December";
			break;
		}

		return monthName;

	}

	// metodo dia del mes correcto

	public boolean dayMonthRite() {

		boolean dayMonthRite = true;

		switch (this.month) {
		case 1:
			if ((this.day < 0) || (this.day > 31)) {
				dayMonthRite = false;
			}

			break;

		case 2:// asumo 28 dias febrero
			if ((this.day < 0) || (this.day > 28)) {
				dayMonthRite = false;
			}

			break;

		case 3:
			if ((this.day < 0) || (this.day > 31)) {
				dayMonthRite = false;
			}

			break;

		case 4:
			if ((this.day < 0) || (this.day > 30)) {
				dayMonthRite = false;
			}

			break;

		case 5:
			if ((this.day < 0) || (this.day > 31)) {
				dayMonthRite = false;
			}

			break;

		case 6:
			if ((this.day < 0) || (this.day > 3)) {
				dayMonthRite = false;
			}

			break;

		case 7:
			if ((this.day < 0) || (this.day > 31)) {
				dayMonthRite = false;
			}

			break;

		case 8:
			if ((this.day < 0) || (this.day > 31)) {
				dayMonthRite = false;
			}

			break;

		case 9:
			if ((this.day < 0) || (this.day > 30)) {
				dayMonthRite = false;
			}

			break;

		case 10:
			if ((this.day < 0) || (this.day > 31)) {
				dayMonthRite = false;
			}

			break;

		case 11:
			if ((this.day < 0) || (this.day > 30)) {
				dayMonthRite = false;
			}

			break;

		case 12:
			if ((this.day < 0) || (this.day > 31)) {
				dayMonthRite = false;
			}

			break;

		}
		return dayMonthRite;
	}

	// Devuelve estacion
	public String getSeasonName() {

		String getSeasonName = null;
		switch (month) {
		case 1:

		case 2:

		case 12:
			getSeasonName = "WINTER";
			break;
		case 3:
		case 4:

		case 5:

			getSeasonName = "SPRING";
			break;
		case 6:
		case 7:

		case 8:

			getSeasonName = "SUMMER";
			break;
		case 10:

		case 11:

		case 9:
			getSeasonName = "AUTUMN";
			break;
		}

		return getSeasonName;

	}

	private int getDaysOfMonth() {
		int numDays;

		numDays = 0;
		switch (this.month) {
		case 1: // next
		case 3: // next
		case 5: // next
		case 7: // next
		case 8: // next
		case 10: // next
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

	// de una fecha meses hasa el final de año
	public String getMonthsLeft() {

		StringBuilder months = new StringBuilder();
		int reset = this.month;
		for (int i = this.month; i <= 12; i++) {
			this.month = this.month + 1;
			months.append("\n" + this.getmonthName());
		}
		try {
			this.setMonth(reset);
		} catch (DateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return months.toString();

	}

	// get date dd//mm/aaaa
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}

	// devuelve todos las fechas hasta fin de mes
	public String getDaysLeftMonth() {
		StringBuilder getDaysLeftMonth = new StringBuilder();
		Date fecha4 = null;
		for (int i = this.day; i <= this.getDaysOfMonth(); i++) {

			try {
				fecha4 = new Date(i, this.month, this.year);
			} catch (DateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (fecha4.dayMonthRite() == true) {
				getDaysLeftMonth.append("\n" + fecha4);
			}

		}

		return getDaysLeftMonth.toString();
	}

	// devuelve todos los meses con el mismo numero de dias
	public String getMonthsSameDays() {

		StringBuilder months = new StringBuilder();
		int filtro = 0, reset = 0;
		reset = this.month;
		filtro = this.getDaysOfMonth();
		// Para no crear un nuevo objeto date ,despues lo vuelvo a dejar como estaba
		this.month = 0;
		for (int i = 1; i <= 12; i++) {
			this.month = this.month + 1;
		
			if (this.getDaysOfMonth() == filtro) {
				months.append(this.getmonthName()).append(" ");
			}
		}
		this.month = reset;
		return months.toString();
	}
	// contar el numero de dias desde el primer dia del anyo
	public int daysPast(){
		int days=0,auxm=0,auxd=0;
		auxm=this.month;
		auxd=this.day;
		for (int i=this.month;i>0;i--){
			
			for (int j=this.day;j>0;j--){
				
				this.day = this.day-1;
				days++;
			}
			
			this.month = this.month-1;
			this.day=this.getDaysOfMonth();
		}
		this.month=auxm;
		this.day=auxd;
		days--;
		
		return days;
}
	// generar date aleatoria y contar los intentos en el mismo año while y do while
	// devolver el dia dado una fecha lo ultimo del pdf

}