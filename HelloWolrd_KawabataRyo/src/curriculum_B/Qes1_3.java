package curriculum_B;

import java.util.Objects;
// ランダムをimportする
import java.util.Random;
//スキャナーをimportする
import java.util.Scanner;

public class Qes1_3 {
	public static void main(String[] args) {
		// 問1
		Scanner scanner = new Scanner(System.in);
		// 文字列の入力を受け取れるようにする
		String user_name = scanner.nextLine();

		scanner.close();

		// 入力された文字数によって場合分け		
		if (Objects.isNull(user_name) || user_name.length() <= 0) {
			// 文字数がnullか0以下の場合
			System.out.println("名前を入力してください");

		} else if (user_name.length() > 10) {
			// 文字数が10文字以上の場合
			System.out.println("名前を10文字以内にしてください");

		// 問2
		} else if (!user_name.matches("^[a-zA-Z0-9]+$")) {
			// 指定した文字以外を入力している場合
			System.out.println("半角英数字のみで名前を入力してください");

		} else {
			// 上記以外の場合
			System.out.println("ユーザー名「" + user_name + "」を登録しました");
			// じゃんけんのメソッドを呼び出す
			rsp(user_name);
		}
	}

	// 問3
	public static void rsp(String name) {
		// 合計回数の変数を宣言
		int totalGames = 0;
		// 勝ち数の変数を宣言
		int wins = 0;

		Random rand = new Random();
		// 手の配列
		String hands[] = { "グー", "チョキ", "パー" };

		// 勝ち数が0の間繰り返す
		while (wins == 0) {
			// 自分の手の数字をランダムに
			int myHandNum = rand.nextInt(3);
			// 相手の手の数字をランダムに
			int enemyHandNum = rand.nextInt(3);

			// 自分の手を文字で宣言
			String myHand = hands[myHandNum];
			// 相手の手を文字で宣言
			String enemyHand = hands[enemyHandNum];

			// 自分の手を出力
			System.out.println(name + "の手は「" + myHand + "」");
			// 相手の手を出力
			System.out.println("相手の手は「" + enemyHand + "」\n");
			// 合計をインクリメント
			totalGames++;
			
			// じゃんけんの結果で場合分け
			if (myHand == enemyHand) {
				// あいこの場合
				System.out.println("DROW あいこ もう一回しましょう！\n");
				

			// 自分が負けた場合
			} else if ((myHandNum == 0 && enemyHandNum == 2) || (myHandNum == 1 && enemyHandNum == 0)
					|| (myHandNum == 2 && enemyHandNum == 1)) {

				// 負けた手で場合分け
				if (enemyHandNum == 0) {
					// グーで負けた場合	
					System.out.println("""
										負けは次につながるチャンスです！
										ネバーギブアップ！
										
										""");

				} else if (enemyHandNum == 1) {
					// チョキで負けた場合
					System.out.println("""
							 			俺の勝ち！
							 			たかがじゃんけん、そう思ってないですか？
							 			それやったら次も、俺が勝ちますよ
							 			
							 			""");

				} else {
					// パーで負けた場合
					System.out.println("""
										俺の勝ち！
										なんで負けたか、明日まで考えといてください。
										そしたら何かが見えてくるはずです
										
										""");
				}
			
			// 自分が勝った場合
			} else {
				// 勝ち数をインクリメントする
				wins++;

				System.out.println("やるやん。\n次は俺にリベンジさせて\n");
			}
		}

		// 「勝つまでにかかった合計回数は〇回です」を出力
		System.out.println("勝つまでにかかった合計回数は" + totalGames + "回です");
	}
}
