package FlyingTransport;

public class main {

	public static void main(String[] args) {
		
		Fighter a = new Fighter("F - 16");
		a.takeOff();
		a.fly();
		a.patrol();
		a.fire();
		a.landing();

	}

}
