package hw10;

import java.util.Random;

public class Car implements CarbonFootprint{
	//MPG
	//Miles Driven
	
	private double mpg;
	private double milesDriven;
	
	public Car() {
		super();
		Random number = new Random();
		mpg = 20+(number.nextInt(10));
		milesDriven = 1000+(number.nextInt(1000));
	}
        
        public Car(double mpg, double milesDriven) {
            super();
            this.mpg = mpg;
            this.milesDriven = milesDriven;
	}
        
	public double getMpg() {
		return mpg;
	}

	public void setMpg(double mpg) {
		this.mpg = mpg;
	}

	public double getMilesDriven() {
		return milesDriven;
	}

	public void setMilesDriven(double milesDriven) {
		this.milesDriven = milesDriven;
	}
	
	public String getCarbonFootprint() {
		return "Carbon Foot print for Car is: " + (19.60 * (milesDriven * (mpg/100))) + " lbs of CO2";
	}

	//toString
	@Override
	public String toString() {
		return "Car [miles per gallon =" + mpg + ", Miles Driven=" + milesDriven + "]";
	}
	/* Sources on average miles driven and mpg in US (used random values meant to be around the averages)
	 * https://www.idrivesafely.com/defensive-driving/trending/average-miles-driven-per-year-us#:~:text=According%20to%20the%20US%20Department,of%20850%20miles%20per%20month.
	 * https://www.epa.gov/automotive-trends/highlights-automotive-trends-report#:~:text=Figure%20ES%2D1.&text=Fuel%20economy%20increased%20by%200.2,0.4%20mpg%20to%2025.5%20mpg.
	 * https://www.eia.gov/environment/emissions/co2_vol_mass.php
	 */
}
