package execution;

//インポート
import process.Greeting;

public class Output {

	public static void main(String[] args) {
		// インスタンスを生成
		Greeting greet = new Greeting("日本", "寿司", "和食");

		// メソッドの呼び出し
		greet.greet();

	}

}
