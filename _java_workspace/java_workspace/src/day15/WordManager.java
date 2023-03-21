package day15;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class WordManager {
	
	private ArrayList<Word> word = new ArrayList<Word>();
	
	public WordManager() {
		word.add(new Word("cat","고양이"));
		word.add(new Word("dog","개"));
		word.add(new Word("apple","사과"));
		word.add(new Word("book","책"));
		word.add(new Word("hi","안녕"));
	}
	

	public void add(Scanner scan) {
		System.out.println("단어추가:");
		String word = scan.next();
		System.out.println("뜻추가:");
		String mean = scan.next();
		Word w = new Word(word,mean);
		this.word.add(w);
	}
	 
	public void printWord() throws IOException {
		//정렬
		Collections.sort(word, new Comparator<Word>() {

			@Override
			public int compare(Word o1, Word o2) {
				// TODO Auto-generated method stub
				return o1.getWord().compareTo(o2.getWord());
			}
		} );
		
		//출력
		PrintWriter pw = new PrintWriter("word.txt");
		System.out.println("---단어장---");
		for(int i=0; i<word.size(); i++) {
			System.out.println(word.get(i));
			pw.println(word.get(i));
		}
		System.out.println("----------");
		pw.close();
	}
	
	public void pick(Scanner scan) {
		System.out.println("검색할 단어를 입력하세요.");
		String dan = scan.next();
		for(int i=0; i<word.size(); i++) {
			if(word.get(i).getWord().equals(dan))
				System.out.println(word.get(i).getMean());
		}
		
	}
	
	public void replace(Scanner scan) {
		System.out.println("수정할 단어를 입력하세요.");
		String re = scan.next();
		int index = -1;
		
		for(int i=0; i<word.size(); i++) {
			if(word.get(i).getWord().equals(re)) {
				index = i;
			}
		}
		
		System.out.println("수정될 단어를 입력하세요.");
		String redan = scan.next();
		word.get(index).setWord(redan);
	}
	
	public void delete(Scanner scan) {
		System.out.println("삭제할 단어를 입력하세요.");
		String del = scan.next();
		for(int i=0; i<word.size(); i++) {
			if(word.get(i).getWord().equals(del)) {
				word.remove(i);
				System.out.println("삭제완료.");
			}
		}
	}
	
//	public void fileprint() throws IOException {
//		pw.println(word);
//		
//	}
	
	public void printMenu() {
		System.out.println(" [WordMenu]");
		System.out.println("1.단어추가");
		System.out.println("2.단어출력");
		System.out.println("3.단어검색");
		System.out.println("4.단어수정");
		System.out.println("5.단어삭제");
		System.out.println("6.종료");
		System.out.println("----------");
	}
	
}
