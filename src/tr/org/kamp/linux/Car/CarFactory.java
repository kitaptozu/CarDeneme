package tr.org.kamp.linux.Car;

public class CarFactory {

	public static void main(String[] args) {

		Car myCar = new Car();
		
		myCar.setSpeed(100);
		myCar.setGear(3);
		myCar.setBrand("Audi");

		Car myCar2 = new Car("BMW", 1, 150);

		System.out.println(
				"MyCar hızı: " + myCar.getSpeed() + " vites: " + myCar.getGear() + " marka: " + myCar.getBrand());
		System.out.println("MyCar2 hızı: " + myCar2.getSpeed());
		myCar2.speedUp(10);
		System.out.println("MyCar2 hızı: " + myCar2.getSpeed() + " vites: " + myCar2.getGear());

		myCar2.changeGear(2);
		System.out.println("MyCar2 hızı: " + myCar2.getSpeed() + " vites: " + myCar2.getGear());

	}

}
