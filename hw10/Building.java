package hw10;

import java.util.Random;

public class Building implements CarbonFootprint{
	
	//Amount of natural gas used
	private double nGasUsed;
	private double kwUsed;
	
	public Building() {
		super();
		Random number = new Random();
		nGasUsed = 500+(number.nextInt(500));
		kwUsed = 500+(number.nextInt(500));
	}
        
        public Building(double nGasUsed, double kwUsed) {
            super();
            this.nGasUsed = nGasUsed;
            this.kwUsed = kwUsed;
	}
	
	//Getters and Setters
	public double getKwUsed() {
		return kwUsed;
	}

	public void setKwUsed(double kwUsed) {
		this.kwUsed = kwUsed;
	}

	public double getnGasUsed() {
		return nGasUsed;
	}

	public void setnGasUsed(double nGasUsed) {
		this.nGasUsed = nGasUsed;
	}
	
	//getCarbonFootprint
	public String getCarbonFootprint() {
		return "Carbon Foot print for Building is: " + ((kwUsed * 1.1661) + (nGasUsed * 11.7)) + " lbs of CO2";
	}

	//toString
	@Override
	public String toString() {
		return "Building [Natural Gas Used=" + nGasUsed + ", KiloWatts Used=" + kwUsed + "]";
	}
	
	
	/* Sources for CO2 emissions stuff
	 * https://www.epa.gov/egrid/power-profiler#/RFCW
	 * https://www.buildings.com/article-details/articleid/15438/title/how-to-calculate-your-carbon-footprint/viewall/true#:~:text=Review%20your%20utility%20bills%20and,CO2%20from%20natural%20gas%20use.
	 */
	
}
