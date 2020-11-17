package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {
		Date today = null, tomorrow = null;

		try {
			today = new Date(4, 8, 2020);
			tomorrow = new Date(12, 10, 2020);
			System.out.println("Today date= " + today);
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Is Same Year " + tomorrow + "? " + today.isSameYear(tomorrow) + "\nIs same month?"
				+ today.isSameMonth(tomorrow) + "\nIs same day?" + today.isSameDay(tomorrow) + "\nIs same date?"
				+ today.isSame(tomorrow));

		// sin ifs
		System.out.println("\nSin sentencias ifs queda :");
		System.out.println("Is Same Year " + tomorrow + "? " + today.isSameYear2(tomorrow) + "\nIs same month?"
				+ today.isSameMonth2(tomorrow) + "\nIs same day?" + today.isSameDay2(tomorrow) + "\nIs same date?"
				+ today.isSame2(tomorrow) + "\n");
		// El resto
		//Nombre del mes
		System.out.println("Todays month is\n" + today.getmonthName());
		//Comprobar que el dia/mes sea correcto
		System.out.println("Is month/day rite?" + today.dayMonthRite());
		//Nombre de la estación
		System.out.println("Todays season is:\n" + today.getSeasonName());
		//Nombre de los meses hasta fin de año , contando el mes actual
		System.out.println("\nMonths till the end of the year\n" + today.getMonthsLeft());
		//Imprimir fecha
		System.out.println("Date printed is ;\n" + today.toString());
		//Imprimir fecha hasta final de mes
		System.out.println("Days left from today till end of the month\n" + today.getDaysLeftMonth() + "\n");
		//Imprimir los messes con el mismo numero de dias
		System.out.println("Months with same number of days are;\n" + today.getMonthsSameDays() + "\n");
		//Intentos de generar una fecha aleatoria
		System.out.println("Tries to generate random date are;\n" + today.numRandomTriesEqualDate());
		//Dias desde comienzo de año
		System.out.println("Days passed from the start of the year: \n" + today.daysPast() + "\n");
		//Nombre del dia actual
		System.out.println("Tomorrow ("+tomorrow.toString()+") name day is\n" + tomorrow.dayOfWeek(4)+" and today("+today.toString()+") is "+today.dayOfWeek(4));
	}

}