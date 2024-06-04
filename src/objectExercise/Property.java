package objectExercise;

public class Property {
	protected String name;
	protected String owner;
	protected String type;
	protected int price;
	
	Property(String name, String owner, String type, int price) {
		this.name = name;
		this.owner = owner;
		this.type = type;
		this.price = price;
	}
	
	public void information() {
		System.out.println("物件名：" + name);
		System.out.println("物件所有者：" + owner);
		System.out.println("物件種別：" + type);
		System.out.println("物件価格：" + price + "円");
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getOwner() {
		return this.owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}


//スーパークラス：物件
