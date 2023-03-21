package day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EnglishDictionary2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
	}

}
class Word{
	private Map<String, ArrayList<String>> Dic = new HashMap<>();
	
	public Word() {}

	public void makeWord(Scanner scan) {
		char Wis = 'y';
		while(Wis == 'y') {
			System.out.println("단어입력>>");
			String word =scan.next();
			System.out.println("y=계속/n=종료");
			Wis = scan.next().charAt(0);
			if(Wis == 'n') {
				System.out.println("종료되었습니다.");
				break;
			}
			//중복된 단어가있으면 이미존재합니다라고 말하기
			for(String s : Dic.keySet()) {
				if(s.equals(word)) {
					System.out.println("이미존재합니다.");
				}
			}
			
			ArrayList<String> meanList = new ArrayList<String>();
			char is = 'y';
			while(is == 'y') {
				System.out.println("뜻입력>>");
				String mean = scan.next();
				meanList.add(mean);
			}
			
		}
	}

	
	
	
	
	
}