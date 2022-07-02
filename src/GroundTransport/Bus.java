package GroundTransport;

public class Bus extends Transport implements PublicTransport {
	
	private int amountOfPassengers;
	private String route;
	
	public int getAmountOfPassengers() {
		return amountOfPassengers;
	}
	
	public void setAmountOfPassengers(int amountOfPassengers) {
		this.amountOfPassengers = amountOfPassengers;
	}
	
	public String getRoute() {
		return route;
	}
	
	public void setRoute(String route) {
		this.route = route;
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

	@Override
	public void getPassenger() {
		System.out.println(this.getModel() + " gets passengers");	
	}

	@Override
	public void dropOffPassengers() {
		System.out.println(this.getModel() + " gets off passengers");
	}
	

}
