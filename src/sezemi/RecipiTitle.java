package sezemi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RecipiTitle {
	public static void main(String args[]) throws FileNotFoundException{
		try {
			// 読み取りファイルの指定
			File target_file = new File("recipi_title.txt");
			BufferedReader br = new BufferedReader(new FileReader(target_file));
			
			// タイトルを一行ずつ読み取る
			String recipi_title = br.readLine();
			
			while(recipi_title != null){
				// 一行ずつ書き出す
				System.out.println(recipi_title);
				// 次のタイトルを取得
				recipi_title = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
