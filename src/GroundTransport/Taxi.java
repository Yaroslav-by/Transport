package GroundTransport;

public class Taxi extends Car implements PublicTransport {

	private double rate;
	private double distance;
	
	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public Taxi(String brand, String model) {
		super(brand, model);
	}

	@Override
	public void getPassenger() {
		System.out.println(this.getModel() + " gets passengers");
	}

	@Override
	public void dropOffPassengers() {
		System.out.println(this.getModel() + " gets off passengers");
	}

}
