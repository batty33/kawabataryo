package status;

// インポート
import java.util.Random;
import java.util.Scanner;

public class StatusCheck extends StatusBase {

	// コンストラクタ
	public StatusCheck() {

		System.out.println("名前を入力してください");
	}

	// インスタンスを生成
	Random rand = new Random();
	Scanner scanner = new Scanner(System.in);

	// メソッドを生成
	public void check() {

		// 入力された値を変数に代入
		String name = scanner.next();

		// セッターで値を代入
		setHp(rand.nextInt(999));
		setMp(rand.nextInt(999));
		setAtk(rand.nextInt(999));
		setDex(rand.nextInt(999));
		setDef(rand.nextInt(999));

		// ゲッターで値を獲得
		int hp = getHp();
		int mp = getMp();
		int atk = getAtk();
		int dex = getDex();
		int def = getDef();

		System.out.println("こんにちは 「" + name + "」 さん");
		System.out.println("ステータス");
		System.out.println("HP : " + hp);
		System.out.println("MP : " + mp);
		System.out.println("攻撃力 : " + atk);
		System.out.println("素早さ : " + dex);
		System.out.println("防御力 : " + def);
		System.out.println("\nさあ冒険へ出かけよう！");

	}
}
