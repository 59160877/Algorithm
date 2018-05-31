import java.util.Scanner;

public class Flower {
	Scanner kb = new Scanner (System.in);

	String name;
	int flower;
	float price;
	

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = kb.next();
	}
	public int getFlower() {
		return this.flower;
	}
	public void setFlower(int flower) {
		this.flower = kb.nextInt();
	}
	public float getPrice() {
		return this.price;
	}
	public void setPrice(float price) {
		this.price = kb.nextFloat();
	}
	
	
}
