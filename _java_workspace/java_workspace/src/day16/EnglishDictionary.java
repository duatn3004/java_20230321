//package day16;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class EnglishDictionary {
//	//main 등록, 출력
//	public static void main(String[]args) {
//		Scanner scan = new Scanner(System.in);
//
//		Word w = new Word();
//		int menu = 0;
//
//		do {
//			System.out.println("--단어장--");
//			System.out.println("1.단어등록|2.단어출력|3.종료");
//			System.out.println("메뉴선택>");
//			menu = scan.nextInt();
//			
//			switch (menu) {
//			case 1:
//				w.makeWord(scan);
//				break;
//			case 2:
//				w.printWord();
//				break;
//			case 3:break;
//			default:
//				System.out.println("잘못된 메뉴");
//				break;
//			}
//			
//		}while(menu!=3);
//		System.out.println("종료!!");
//	}
//	
//
//}
//
//class Word{
//	//hello : 안녕, 아침인사, 반가움, 잘가
//	private Map<String, ArrayList<String>> words = new HashMap<>();
//	private ArrayList<String> word = new ArrayList<>();
//	/* y를 입력하면 단어를 입력, n을 입력하면 종료
//	 * 단어가 이미 있다면 '이미 있는 단어입니다.' 등록 금지
//	 * 메서드명 : makeWord
//	 * */
//	public void makeWord(Scanner scan) {
//		char is = 'y';
//		char wIs = 'y';
//		a:while(wIs == 'y') {
//			System.out.println("단어입력:");
//			String newword = scan.next();
//			word.add(newword);
//			
//			for(String s : words.keySet()) {
//				if (newword.equals(s)) {
//					System.out.println("이미있는 단어입니다.");
//					break a;
//				}
//			}
//		}
//			System.out.println("의미입력:");
//			scan.nextLine();
//			String mean = scan.nextLine();
//			
//			ArrayList<String> meanList = new ArrayList<String>();
//			meanList.add(mean);
//			System.out.println(newwsord+"에 대한 뜻을 추가하시겠습니까?(y/n)");
//			is=scan.next().charAt(0);
//			if(is=='y') {
//				while(is == 'y') {
//					System.out.println(newword+"의 다른 의미:");
//					scan.nextLine();
//					mean=scan.nextLine();
//					meanList.add(mean);
//					System.out.println(newword+"에 대한 뜻을 추가하시겠습니까?(y/n)");
//					is=scan.next().charAt(0);
//					if(!(is=='y' || is=='n')) {
//						System.out.println("잘못된 입력입니다.");
//					}
//				}				
//			}else {
//				System.out.println("입력종료");
//			}
//			words.put(newword, meanList);
//		}
//	
//	/* 단어 출력 메서드
//	 * 메서드명 : printWord
//	 * */
//	public void printWord() {
//		for(String s : words.keySet()) {
//			System.out.println(words.get(s));
//		}
//	}
//	
//}