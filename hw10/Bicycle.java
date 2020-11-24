package hw10;

import java.util.Random;

public class Bicycle implements CarbonFootprint{
	//Calories burned
	private int calBurned;

	public Bicycle() {
		super();
		Random number = new Random();
		calBurned = (number.nextInt(2500));
	}
       
        public Bicycle(int calBurned) {
	super();
	this.calBurned = calBurned;
	}

	public int getCalBurned() {
		return calBurned;
	}

	public void setCalBurned(int calBurned) {
		this.calBurned = calBurned;
	}
	
	public String getCarbonFootprint() {
		return "Carbon Foot print for the Bicycle is: " + (((calBurned/50)*153.75)/453.592) + " lbs of CO2";
	}

	@Override
	public String toString() {
		return "Bicycle [calories Burned=" + calBurned + "]";
	}
	
	/*Sources for calories to carbon footprint
	 * https://www.theguardian.com/environment/2010/jun/08/carbon-footprint-cycling  	I took the average of some foods on this to get the 153
	 * 
	 */
	
}
