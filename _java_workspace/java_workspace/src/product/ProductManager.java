package product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager implements ProductInterface {
	
	private ArrayList<Product> menu = new ArrayList<>();
	private ArrayList<Order> order = new ArrayList<Order>();
	
	public void addMenu() {
		menu.add(new Product("햄버거",15000));
		menu.add(new Product("피자",20000));
		menu.add(new Product("음료",2000));
		menu.add(new Product("과자",1000));
		menu.add(new Product("사탕",500));
		
	}

	@Override
	public void add(Scanner scan) {
		System.out.println("추가할 메뉴를 입력하세요.");
		String menu = scan.next();
		System.out.println("메뉴의 가격을 입력하세요.");
		int price = scan.nextInt();
		this.menu.add(new Product(menu,price));
	}

	@Override
	public void printProduct() {
		System.out.println("----menu----");
		for(Product p : menu) {
			System.out.println(p);
		}
		System.out.println("------------");
		
	}

	@Override
	public void orderPick(String name, int count) { //메뉴명,개수
		for(int i=0; i<menu.size(); i++) {
			if(menu.get(i).getMenu().equals(name)) {
				int price = menu.get(i).getPrice();
				Order order = new Order();
				order.setMenu(name);
				order.setPrice(price);
				order.setCount(count);
				order.setTotal(price*count);
				this.order.add(order);
			}
		}
		
	}

	@Override
	public void printOrder() {
		int sum = 0;
		System.out.println("----주문내역----");
		for(int i=0; i<order.size(); i++) {
			order.get(i).print();
			sum += order.get(i).getTotal();
		}
		System.out.println("-------------");
		System.out.println("지불하실 총 금액 : "+sum);
		
	}

	@Override
	public void delete(Scanner scan) {
		//메뉴 삭제
		System.out.println(">> 삭제할 제품을 입력해주세요.");
		String del = scan.next();
		for(int i=0; i<menu.size(); i++) {
			if(menu.get(i).getMenu().equals(del)) {
				menu.remove(i);
				System.out.println("삭제완료.");
			}
		}
		
		
		
	}

	@Override
	public void update(Scanner scan) {
		System.out.println(">> 수정할 제품을 입력해주세요");
		String re = scan.next();
		int index = -1;
		
		for(int i=0; i<menu.size(); i++) {
			if(menu.get(i).getMenu().equals(re)) {
				index=i;
			}
		}
		
		if(index == -1) {
			System.out.println("잘못입력했습니다.");
			return;
		}
		
		System.out.println(">> 수정할 가격을 입력해주세요");
		int g = scan.nextInt();
		menu.get(index).setPrice(g);
		
	} 
	
	
}