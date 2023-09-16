package basicClass;

import java.text.SimpleDateFormat;
// インポート
import java.util.Date; 

public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		// インスタンスを生成
		Dog dog = new Dog();
		
		// コンソールへ出力
		System.out.println(dog.animalName);
		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		// インスタンスを生成
		Dog dogNum = new Dog(3);
		
		// コンソールへ出力
		System.out.println(dogNum.animalNum);
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		// インスタンスを生成
		Date date = new Date();
		// フォーマット指定
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd H:m:s");
		//文字列を宣言 
		String formatDate = format.format(date);
		
		// コンソールに出力
		System.out.println(formatDate);
	}
}
