package curriculum_B;
// randomをimportする
import java.util.Random;
//scannerをimportする
import java.util.Scanner;
public class Qes1_3 {
	public static void main(String[] args) {
		// 問1
		// Scannerで初期化する
		Scanner scanner = new Scanner(System.in);
		// 文字列の入力を受け取れるようにする
		String user_name = scanner.nextLine();
		// scannerを閉じる
		scanner.close();
		
		//「user_name」の文字数が10より大きかった時のif文を生成
		if(user_name.length() > 10) {
			// 「名前を10文字以内にしてください」を出力
			System.out.println("名前を10文字以内にしてください");
			
		// 「user_name」の文字列が0以下またはnullの時のelseif文を生成
		}else if(user_name.length() <= 0 || user_name == null) {
			// 「名前を入力してください」を出力
			System.out.println("名前を入力してください");
			
		// 問2 半角英数字でない場合のelseif文を生成
		}else if(! user_name.matches("^[a-zA-Z0-9]+$")) {
			System.out.println("半角英数字のみで名前を入力してください");
			
			// 「user_name」が上記以外の正常な値だった時のelseを生成
		}else {
			// ユーザー名「」を入力しましたを出力
			System.out.println("ユーザー名「" + user_name + "」を登録しました");
			//メソッドrspに引数user_nameを指定して呼び出す
			rsp(user_name);
		}	
	}
			// 問3
			// じゃんけんのメソッドであるrspを引数nameで生成
			public static void rsp(String name) {
				// 勝利数wを定義し初期値に0を代入
				int w = 0;
				// 敗北数lを定義し初期値を0に代入
				int l = 0;
				// 引き分け数dを定義し初期値を0に代入
				int d = 0;
				// wが1になった時終了するwhile文を生成
				
				while(w == 0) {
					// Randomを初期化する
					Random rand = new Random();
					// enemy_handNumに0-3での乱数を代入
					int enemy_handNum = rand.nextInt(3);
					// my_handNumに0-3の乱数を代入
					int my_handNum = rand.nextInt(3);
					// enemy_handを宣言
					String enemy_hand = "";
					// my_handを宣言
					String my_hand = "";
					
					// enemy_handNumの数字によるswitch文を生成
					switch(enemy_handNum) {
				   		// enemy_handNumが0の時enemy_handに「グー」を代入
						case 0: enemy_hand = "グー";
						break;
						// enemy_handNemが1の時enemy_handに「チョキ」を代入
						case 1: enemy_hand = "チョキ";
						break;
						// enemy_handNumが2の時enemy_handに「パー」を代入
						case 2: enemy_hand = "パー";
						break;
					}
					
					// my_handNumの数字によるswitch文を生成
					switch(my_handNum) {
						// my_handが0の時my_handに「グー」を代入
						case 0: my_hand = "グー";
						break;
						// my_handNumが1の時my_handに「チョキ」を代入
						case 1: my_hand = "チョキ";
						break;
						// my_handNumが2の時my_handに「パー」を代入
						case 2: my_hand = "パー";
						break;
					}
					
					// 「user_nameの手はmy_hand」を出力
					System.out.println(name + "の手は「" + my_hand + "」");
					// 「相手の手はenemy_hand」を出力
					System.out.println("相手の手は「" + enemy_hand + "」");
					// 改行する
					System.out.println("");
					
					// 自分が勝った時if文を生成
					if((my_handNum == 0 && enemy_handNum == 1) || (my_handNum == 1 && enemy_handNum == 2) || (my_handNum == 2 && enemy_handNum == 0)) {
						// 勝ち数のカウントwをインクリメントする
						w++;
						// 「やるやん」を出力
						System.out.println("やるやん。");
						// 「次は俺にリベンジさせて」を出力
						System.out.println("次は俺にリベンジさせて");
						// 改行する
						System.out.println("");
						
					// 自分が負けた時のifelse文を生成
					}else if((my_handNum == 0 && enemy_handNum  == 2) || (my_handNum == 1 && enemy_handNum == 0) || (my_handNum == 2 && enemy_handNum == 1)) {
						// 負け数のカウントlをインクリメントする
						l++;
						
						// グーで負けた時のif文を生成
						if(enemy_handNum == 0) {
							//「俺の勝ち！」を出力
							System.out.println("俺の勝ち！");
							// 「負けは次につながるチャンスです！」を出力
							System.out.println("負けは次につながるチャンスです！");
							// 「ネバーギブアップ！」を出力
							System.out.println("ネバーギブアップ！");
							// 改行する
							System.out.println("");
							
						// チョキで負けた時のelseif文を生成	
						}else if(enemy_handNum == 1) {
							//「俺の勝ち！」を出力
							System.out.println("俺の勝ち！");
							// 「たかがじゃんけん、そう思ってないですか？」を出力
							System.out.println("たかがじゃんけん、そう思ってないですか？");
							// 「それやったら次も、俺が勝ちますよ」を出力
							System.out.println("それやったら次も、俺が勝ちますよ");
							// 改行する
							System.out.println("");
							
						// ぱーで負けた時であるelse文を生成
						}else {
							//「俺の勝ち！」を出力
							System.out.println("俺の勝ち！");
							// 「なんで負けたか、明日まで考えといてください。」を出力
							System.out.println("なんで負けたか、明日まで考えといてください");
							// 「そしたら何かが見えてくるはずです」を出力
							System.out.println("そしたら何かが見えてくるはずです");
							// 改行する
							System.out.println("");
						}
						
					// あいこの時になるelse文を生成
					}else {
						//あいこ数のカウントdをインクリデントする
						d++;
						// 「DROW あいこ もう一回しましょう！」を出力
						System.out.println("DROW あいこ もう一回しましょう！");
						// 改行する
						System.out.println("");
					}
				}
				
				// w l dの合計値を使って「勝つまでにかかった合計回数は〇回です」を出力
				System.out.println("勝つまでにかかった合計回数は" + (w + l + d) + "回です");
			}
}
