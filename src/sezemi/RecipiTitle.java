package sezemi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RecipiTitle {
	public static void main(String args[]) throws FileNotFoundException{
		try {
			// 読み取りファイルの指定
			File target_file = new File("recipi_title.txt");
			FileReader filereader = new FileReader(target_file);
			
			// 書き出す文字が残っているかの判定
			int exist_title = filereader.read();
			
			while(exist_title != -1){
				// 一文字ずつ書き出す
				System.out.print((char)exist_title);
				
				exist_title = filereader.read();
			}
			
			filereader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
