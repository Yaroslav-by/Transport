package GroundTransport;

public class Car extends Transport {

	private int seats;
	private double weight;
	private String colour;
	
	public Car(String brand, String model) {
		this.setBrand(brand);
		this.setModel(model);
	}
	
	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public void startEngine() {
		System.out.println(this.getModel() + " engine goes *vz vz vz*");
	}

	@Override
	public void go() {
		System.out.println(this.getModel() + " is moving");
	}

	@Override
	public void stop() {
		System.out.println(this.getModel() + " is stoping");
	}

	@Override
	public void turnLeft() {
		System.out.println(this.getModel() + " turns left");
	}

	@Override
	public void turnRight() {
		System.out.println(this.getModel() + " turns right");
	}

}
