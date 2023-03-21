package day17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedReaderEx02 {

	public static void main(String[] args) throws IOException {
		/* BufferedReader, PrintWriter
		 * 파일을 읽어들여 복사하여 객체생성
		 * out.txt에서 파일을 읽어서 => out2.txt로 쓰기
		 * */
		BufferedReader br = 
				new BufferedReader(new FileReader("out.txt"));
		PrintWriter pw = new PrintWriter("out2.txt");
		while(true) {
			String line = br.readLine();
			if(line == null) {
				break;
			}
			pw.println(line);
			System.out.println(line);
		}
		System.out.println("읽고있는 중입니다.");
		br.close();
		pw.close();
		
	}

}
