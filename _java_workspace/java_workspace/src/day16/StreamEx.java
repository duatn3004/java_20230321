package day16;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamEx {

	public static void main(String[] args) {
		/*
		 * 문자열(이름)을 담는 리스트 생성후, 스트림으로 생성 정렬하여 출력
		 */
		ArrayList<String> name = new ArrayList<String>();
		name.add("kim");
		name.add("hong");
		name.add("tomas");
		name.add("edward");
		name.add("jack");
		name.add("park");
		name.add("lee");

		Stream<String> st = name.stream();
		st.sorted().forEach(s -> System.out.println(s));
		System.out.println("----------");
		// 글자수가 5글자 이상인 이름만 출력
		name.stream().sorted().forEach(n -> System.out.println(n));
		System.out.println("----------");		
		name.stream().filter(b -> b.length() >= 5).forEach(System.out::println);
		System.out.println("----------");
		//각자 이름의 글자수를 출력
		name.stream().map(b->b.length()).forEach(System.out::println);
	}
}
