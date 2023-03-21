package product;

public class Product {
	//메뉴,가격 구성
	private String menu;
	private int price;
	
	public Product() {}
	
	public Product(String menu, int price) {
		this.menu = menu;
		this.price = price;
	}

	//getter/setter는 필수
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//출력을 해야한다면 toString
	@Override
	public String toString() {
		return menu + ":" + price;
	}

	
	
}
