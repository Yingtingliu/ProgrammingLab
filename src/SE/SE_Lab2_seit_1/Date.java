package SE.SE_Lab2_seit_1;

import java.io.PrintStream;

public class Date {
	private int date;
	private int month;
	private int year;	
	
	public Date(int date, int month, int year) {
		super();
		this.date = date;
		this.month = month;
		this.year = year;
	}

	public void print(PrintStream ps) {
		ps.print(date+"/"+month+"/"+year);
	}
	
	public int diffInYears(Date d) {
		int Year = d.getYear() - this.year;
		int month = d.getMonth() - this.month;
		int date = d.getMonth() - this.date;
		
		if(date>=0) {
			if(month>=0) {
				return Year;
			}
		} else {
			month -- ;
			if(month>=0) {
				return Year;
			} else {
				return Year--;
			}
		}		
		return 0;
	}

	public int getDate() {
		return date;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}	
	
}
