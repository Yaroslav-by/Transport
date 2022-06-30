package FlyingTransport;

public class Bomber extends Aircraft implements MilitaryTransport {
	
	private String model;
	private String armament;
	
	Bomber(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getArmament() {
		return armament;
	}

	public void setArmament(String armament) {
		this.armament = armament;
	}

	@Override
	public void takeOff() {
		System.out.println(this.getModel() + " takes off.");
	}

	@Override
	public void landing() {
		System.out.println(this.getModel() + " lands.");
	}

	@Override
	public void fly() {
		System.out.println(this.getModel() + " is flying.");
	}

	@Override
	public void fire() {
		
		System.out.println(this.getModel() + " goes *bomb bomb bomb*.");
		
	}

	@Override
	public void patrol() {
		
		System.out.println(this.getModel() + " on combat duty.");
		
	}

}
