package day15;

import java.io.IOException;
import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WordManager wm = new WordManager();
		Scanner scan = new Scanner(System.in);

			
		int menu = -1;
		
		/*1.단어추가
		2.단어출력(추가된 모든 단어를 출력 - 정렬해서 (word를 기준으로))
		3.단어검색
		4.단어수정
		5.단어삭체
		6.종료*/
		
		do {
			wm.printMenu();
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				wm.add(scan);				
				break;
			case 2:
				wm.printWord();				
				break;
			case 3:
				wm.pick(scan);				
				break;
			case 4:
				wm.replace(scan);				
				break;
			case 5:
				wm.delete(scan);				
				break;
			case 6:				
				break;
			}
		}while(menu!=6);
		


	}

}
