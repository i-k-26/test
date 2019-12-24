
public class MyYear {

	private int year;
	//	private boolean leap;

	public MyYear(int year) {
		this.year = year;
	}

	public String toString() {
		String str = Integer.toString(year);
		return str;
	}

	public boolean isLeap() {

		if (year % 4 == 0) {
			if (year % 100 != 0) {
				return true;
			} else if (year % 400 == 0) {
				return true;
			} else {
			return false;
			}
	}
		return false;
	}
}
