package SE.SE_Lab2_Solution2;

import java.io.PrintStream;

public class Date {
	private int day, month, year;
	
	public Date(int d_day, int d_month, int d_year) {
		day = d_day;
		month = d_month;
		year = d_year;
	}
	
	public int getDay() {
		return this.day;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public int getYear() {
		return this.year;
	}
	

	public	void print(PrintStream ps, Date d_date)	{
		ps.print(String.format("first date: %02d/%02d/%4d", day, month, year));	
		ps.print(String.format("   second date: %02d/%02d/%4d", d_date.day, d_date.month, d_date.year));
		ps.print(String.format("   difference in years: %d", this.diffInYears(d_date)));
	}
		
	public int diffInYears(Date date) {
		return(date.year - this.year);
	}

}
