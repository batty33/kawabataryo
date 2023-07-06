package process;

//インポート
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Greeting {

	// フィールド変数の宣言
	public String country;
	public String food;
	public String foodType;

	// コンストラクタを生成
	public Greeting(String country, String food, String foodType) {

		// フィールド変数の初期化
		this.country = country;
		this.food = food;
		this.foodType = foodType;
	}

	// 挨拶メソッド
	public void greet() {
		// インスタンスを生成
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		String today = dateFormat.format(date);

		// ヌルチェック
		if (Objects.nonNull(country)) {

			// コンソールへ出力
			System.out.println("こんにちは！ここは" + country + "です！");
		}

		// ヌルチェック
		if (Objects.nonNull(food)) {

			// コンソールへ出力
			System.out.println("この" + food + "はうまい");
		}

		// ヌルチェック
		if (Objects.nonNull(foodType)) {

			// コンソールへ出力
			System.out.println(food + "は" + foodType + "です");
		}

		// コンソールへ出力
		System.out.println("今の現在日時は" + today + "です");

	}

}
