package status;

//インポート 
import java.util.Random;

public class StatusCheck extends StatusBase {

	// フィールド変数
	private String name;

	Random rand = new Random();

	// コンストラクタ
	public StatusCheck() {

		// セッター
		setHp(rand.nextInt(999) + 1);
		setMp(rand.nextInt(999) + 1);
		setAtk(rand.nextInt(999) + 1);
		setDex(rand.nextInt(999) + 1);
		setDef(rand.nextInt(999) + 1);

		// コンソールへ出力
		System.out.println("名前を入力してください");
	}

	// ゲッターとセッター生成
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 文字列変換メソッド
	public String toString() {

		return "こんにちは 「" + getName() + "」 さん\nステータス\n"

				+ super.toString() + "\n\nさあ冒険へ出かけよう！";
	}

}
