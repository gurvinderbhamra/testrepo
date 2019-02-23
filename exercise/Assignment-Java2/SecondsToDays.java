class SecondsToDays {

    public static void main(String[] args) {
	int input=500000;
	int numberOfDays, numberOfHours, numberOfMinutes, numberOfSeconds;

	numberOfDays = input / 86400;
	numberOfHours = (input % 86400 ) / 3600 ;
	numberOfMinutes = ((input % 86400 ) % 3600 ) / 60 ;
	numberOfSeconds = ((input % 86400 ) % 3600 ) % 60  ;

	System.out.println(numberOfDays + " days " + numberOfHours + " hours " + numberOfMinutes + " minutes " + numberOfSeconds + " seconds ");
    }
}
