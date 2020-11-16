package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {
		Date today = null,tomorrow=null;
		
		try {
			today = new Date(11,10,2020);
			tomorrow = new Date(12,12,2020);
			System.out.println(today);
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}

		System.out.println( " Is Same Year " + tomorrow + "? " + today.isSameYear(tomorrow)+"\nIs same month?"+today.isSameMonth(tomorrow)+"\nIs same day?"+today.isSameDay(tomorrow)+"\nIs same date?"+today.isSame(tomorrow));
		
		//sin ifs
		System.out.println("\nSin ifs queda :");
		System.out.println(" Is Same Year " + tomorrow + "? " + today.isSameYear2(tomorrow)+"\nIs same month?"+today.isSameMonth2(tomorrow)+"\nIs same day?"+today.isSameDay2(tomorrow)+"\nIs same date?"+today.isSame2(tomorrow)+"\n");
		System.out.println("Todays month is\n"+today.getmonthName());
		System.out.println("Is month/day rite?"+today.dayMonthRite());
		System.out.println("todays season is:\n"+today.getSeasonName());
		System.out.println(  "\nmonths till the end of the year\n"+today.getMonthsLeft() );
		System.out.println("date printed is ;\n"+today.toString());
		System.out.println("days left from today till end of the month\n"+today.getDaysLeftMonth());
		System.out.println("Months with same number of days are;\n"+today.getMonthsSameDays());
		//System.out.println("tries to generate random date are;\n"+today.randomDate());
		System.out.println("days passed from the start of the year: \n"+today.daysPast()+"\n");
		//System.out.println("tomorrows name day is\n"+tomorrow.dayWeek());
	}

}