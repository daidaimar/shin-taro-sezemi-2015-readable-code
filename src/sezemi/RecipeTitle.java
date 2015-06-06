package sezemi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RecipeTitle {
	public static void main(String args[]) throws FileNotFoundException{
		try {
			// 読み取りファイルの指定
			File target_file = new File("recipi_title.txt");
			BufferedReader br = new BufferedReader(new FileReader(target_file));
			
			// タイトルを一行ずつ読み取る
			String recipe_title = br.readLine();
			
			// レシピIDの宣言
			int recipe_id = 1;
			
			while(recipe_title != null){
				// レシピIDを付加して一行ずつ書き出す
				System.out.println(recipe_id + ": " + recipe_title);
				// 次のタイトルを取得
				recipe_title = br.readLine();
				// レシピIDをインクリメント
				recipe_id ++;
			}
			
			// ファイルを閉じる
			br.close();
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
