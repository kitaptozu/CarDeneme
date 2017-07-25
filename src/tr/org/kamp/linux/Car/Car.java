package tr.org.kamp.linux.Car;

public class Car {

	// Değişken tanımlamaları
	private int gear;
	private int speed;
	private String brand;

	// Constructor tanımlamaları
	public Car(String brand, int gear, int speed) {
		this.brand = brand;
		if (gear >= 0) {
			this.gear = gear;
		}
		if (speed >= 0) {
			this.speed = speed;
		}

	}

	public Car() {

	}

	// Getter ve Setter methodları
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setGear(int gear) {
		if (gear >= 0) {
			this.gear = gear;
		}
	}

	public void setSpeed(int speed) {
		if (speed >= 0) {
			this.speed = speed;
		}
	}

	public String getBrand() {
		return brand;
	}

	public int getGear() {
		return gear;
	}

	public int getSpeed() {
		return speed;
	}

	// Hız arttırma methodu
	public void speedUp(int inc) {
		if (inc > 0) {
			this.speed += inc;
		}

	}

	// Hız düşürme methodu
	public void speedDown(int dec) {
		if (dec >= 0) {
			this.speed -= dec;
		}

	}

	// Vites değiştirme methodu
	public void changeGear(int gear) {
		if (gear >= 0) {
			this.gear = gear;
		}

	}

}
