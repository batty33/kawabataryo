package process;

import java.text.SimpleDateFormat;
// インポート
import java.util.Date;

public class Greeting {

	// フィールド変数の宣言
	public String country;
	public String food;
	public String foodType;

	// コンストラクタを生成
	public Greeting(String country, String food, String foodType) {

		//フィールド変数の初期化
		this.country = country;
		this.food = food;
		this.foodType = foodType;
	}

	// 挨拶メソッド
	public void greet() {
		// インスタンスを生成
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		// インスタンスを生成
		String today = dateFormat.format(date);

		// コンソールへ出力
		System.out.println("こんにちは！ここは" + country + "です！");
		System.out.println("この" + food + "はうまい");
		System.out.println(food + "は" + foodType + "です");
		System.out.println("今の現在日時は" + today + "です");
	}

}
