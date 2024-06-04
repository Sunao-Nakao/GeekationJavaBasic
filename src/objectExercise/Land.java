package objectExercise;

public class Land extends Property {
	private double breadth; 
	
	Land(String name, String owner, String type, int price, double breadth) {
		super(name, owner, type, price);
		this.breadth = breadth;
	}
	
	public double getBreadth() {
		return this.breadth;
	}
	
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	@Override
	public void information() {
		super.information();
		System.out.println("広さ：" + breadth + "㎡");
	}
	
}




//RealEstateサブクラス：土地