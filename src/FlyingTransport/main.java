package FlyingTransport;

import GroundTransport.Taxi;

public class main {

	public static void main(String[] args) {
		
		Fighter a = new Fighter("F - 16");
		a.takeOff();
		a.fly();
		a.patrol();
		a.fire();
		a.landing();
		
		System.out.println();
		
		Taxi b = new Taxi("Lexus", "GX 460");
		b.startEngine();
		b.go();
		b.stop();
		b.getPassenger();
		b.setRate(3.50);
		System.out.println("Rate for a ride is " + b.getRate() + " rubles per km");
		b.go();
		b.stop();
		b.setDistance(5.9);
		System.out.println("Clients paid " + b.getRate() * b.getDistance() + " rubles");
		b.dropOffPassengers();
		

	}

}
