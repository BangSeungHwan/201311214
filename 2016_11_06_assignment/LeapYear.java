class LeapYear {

	public static void guessLeapYear (int year) {
		if(year%4 == 0 && year%100 != 0 || year%400 == 0){
			System.out.println(year + " is LeapYear");
		} else {
		  System.out.println(year + " is not LeapYear");
		}
	}

	public static void main(String[] args){
		guessLeapYear(2016);
		guessLeapYear(2017);
	}
}