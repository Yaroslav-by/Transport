package FlyingTransport;

public abstract class Aircraft implements FlyingTransport {

	private double wingspan;
	private int crew;
	private int cruisingSpeed;
	private int practicalCeiling;
	
	public double getWingspan() {
		return wingspan;
	}
	
	public void setWingspan(double wingspan) {
		this.wingspan = wingspan;
	}
	
	public int getCrew() {
		return crew;
	}
	
	public void setCrew(int crew) {
		this.crew = crew;
	}
	
	public int getCruisingSpeed() {
		return cruisingSpeed;
	}
	
	public void setCruisingSpeed(int cruisingSpeed) {
		this.cruisingSpeed = cruisingSpeed;
	}
	
	public int getPracticalCeiling() {
		return practicalCeiling;
	}
	
	public void setPracticalCeiling(int practicalCeiling) {
		this.practicalCeiling = practicalCeiling;
	}
	
	
}
