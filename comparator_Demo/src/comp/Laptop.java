package comp;

public class Laptop {

	private int ram;
	private  String brand;
	
	Laptop(String brand,int ram){
		this.setRam(ram);
		this.setBrand(brand);
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	
}