package day17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class BufferedReaderEx03 {

	public static void main(String[] args) throws IOException {
		/* out.txt파일을 읽어들여 map에 저장후
		 * 이름:점수
		 * 총 합계 총인원 출력
		 * */ 
		String name;
		int score;
		int sum = 0;
		int count = 0;
		BufferedReader br = new BufferedReader(new FileReader("out.txt"));
		Map<String, Integer> map = new TreeMap<String, Integer>();
		while(true) {
			String line = br.readLine(); //홍길동 79
			if(line == null) {break;} //마지막라인일 경우 null 입력되면 반복문 빠져나감.
			
			//홍길동 79 substring(starindex=포함, endindex=미포함)
			name = line.substring(0,line.indexOf(" "));//처음부터 공백까지
			//endindex를 적지 않으면 끝까지
			score = Integer.parseInt(line.substring(line.indexOf(" ")+1));
			map.put(name, score);
		}
		for(String s : map.keySet()) {
			System.out.println(s+":"+map.get(s));
			sum+=map.get(s);
			count++;
		}
		System.out.print("총 합계:"+sum);
		System.out.println(" 총 인원"+count);

	}

}