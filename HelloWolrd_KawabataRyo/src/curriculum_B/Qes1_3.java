package curriculum_B;
//オブジェクトをインポートする
import java.util.Objects;
// ランダムをimportする
import java.util.Random;
//スキャナーをimportする
import java.util.Scanner;

public class Qes1_3 {
	public static void main(String[] args) {
		// 問1
		// スキャナーを初期化する
		Scanner scanner = new Scanner(System.in);
		// 文字列の入力を受け取れるようにする
		String user_name = scanner.nextLine();
		// スキャナーを閉じる
		scanner.close();

		//入力された文字数が10より大きかった時のif文を生成
		if (user_name.length() > 10) {
			// 「名前を10文字以内にしてください」を出力
			System.out.println("名前を10文字以内にしてください");

			// 入力された文字列が0以下またはnullの時のelseif文を生成
		} else if (user_name.length() <= 0 || Objects.isNull(user_name)) {
			// 「名前を入力してください」を出力
			System.out.println("名前を入力してください");

			// 問2 半角英数字でない場合のelseif文を生成
		} else if (! user_name.matches("^[a-zA-Z0-9]+$")) {
			System.out.println("半角英数字のみで名前を入力してください");

			// 入力された文字列が上記以外の正常な値だった時のelseを生成
		} else {
			// ユーザー名「」を入力しましたを出力
			System.out.println("ユーザー名「" + user_name + "」を登録しました");
			//じゃんけんメソッドに引数user_nameを指定して呼び出す
			rsp(user_name);
		}	
	}
	// 問3
	// じゃんけんのメソッドを生成
	public static void rsp(String name) {
		// 合計回数の変数を宣言
		int totalGames = 0;
		// 勝ち数の変数を宣言
		int wins = 0;

		// ランダムを初期化
		Random rand = new Random();
		// グーチョキパーを配列に入れる
		String hands[] = {"グー","チョキ","パー"};

		// 勝ち数が0の間繰り返すwhile文を生成
		while (wins == 0) {
			// 自分の手の数字をランダムに宣言
			int myHandNum = rand.nextInt(3);
			// 相手の手の数字をランダムに宣言
			int enemyHandNum = rand.nextInt(3);

			// 自分の手を文字で宣言
			String myHand = hands[myHandNum];
			// 相手の手を文字で宣言
			String enemyHand = hands[enemyHandNum];

			// 自分の手を出力
			System.out.println(name + "の手は「" + myHand + "」");
			// 相手の手を出力
			System.out.println("相手の手は「" + enemyHand + "」\n");

			// 自分が勝った時のif文を生成
			if((myHandNum == 0 && enemyHandNum == 1) || (myHandNum == 1 && enemyHandNum == 2) || (myHandNum == 2 && enemyHandNum == 0)) {
				// 勝ち数をインクリメントする
				wins ++;
				// 合計数をインクリデントする
				totalGames ++;

				// 「やるやん次は俺にリベンジさせて」を出力
				System.out.println("やるやん。\n次は俺にリベンジさせて\n");		

				// 自分が負けた時の処理を生成
			} else if ((myHandNum == 0 && enemyHandNum  == 2) || (myHandNum == 1 && enemyHandNum == 0) || (myHandNum == 2 && enemyHandNum == 1)) {
				// 合計数をインクリデントする
				totalGames ++;

				// グーで負けた時の処理を生成
				if (enemyHandNum == 0) {
					// 負けは次につながるチャンスです！ネバーギブアップ！を出力
					System.out.println("負けは次につながるチャンスです！\nネバーギブアップ！\n");

					// チョキで負けた時の処理を生成
				} else if (enemyHandNum == 1) {
					// 俺の勝ち！たかがじゃんけん、そう思ってないですか？それやったら次も、俺が勝ちますよを出力
					System.out.println("俺の勝ち！\nたかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ\n");

					// パーで負けた時の処理を出力
				} else {
					// 俺の勝ち！なんで負けたか、明日まで考えといてください。そしたら何かが見えてくるはずですを出力
					System.out.println("俺の勝ち！\nなんで負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです\n");
				}

				// あいこの時の処理を生成	
			} else {
				// 合計数をインクリデントする
				totalGames ++;

				// 「DROW あいこ もう一回しましょう！」を出力
				System.out.println("DROW あいこ もう一回しましょう！\n");
			}
		}

		// 「勝つまでにかかった合計回数は〇回です」を出力
		System.out.println("勝つまでにかかった合計回数は" + totalGames + "回です");
	}
}
