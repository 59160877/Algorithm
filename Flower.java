public class Flower {

	String name;
	int flower;
	float price;
	
	public Flower (String name,int flower,float price) {
		this.name =name;
		this.flower = flower;
		this.price = price;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFlower() {
		return this.flower;
	}
	public void setFlower(int flower) {
		this.flower = flower;
	}
	public float getPrice() {
		return this.price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}