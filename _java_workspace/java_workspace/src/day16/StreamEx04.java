package day16;

import java.util.ArrayList;

public class StreamEx04 {

	public static void main(String[] args) {
		
		ArrayList<Customer> trip = new ArrayList<Customer>();
		trip.add(new Customer("이순신",40,0));
		trip.add(new Customer("신사임당",35,0));
		trip.add(new Customer("이아들",10,0));

		trip.stream().filter(n->n.getAge()>=15).forEach(n->n.setMoney(100));
		trip.stream().filter(n->n.getAge()<15).forEach(n->n.setMoney(50));
		
		System.out.println("--------고객명단--------");
//		trip.stream().forEach(System.out::println);
		trip.stream().forEach(n->System.out.println(n));
		
		System.out.println("----------------------");
		//총비용
		int sum = trip.stream().mapToInt(n->n.getMoney()).sum();
		System.out.println("총 여행비용=>"+sum+"만원");
		
		//20세 이상 성인만 이름을 정렬하여 출력
		
		trip.stream().filter(n->n.getAge()>=20).map(n->n.getName()).sorted().forEach(System.out::println);
	}


}
