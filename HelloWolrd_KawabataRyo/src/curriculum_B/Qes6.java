package curriculum_B;
//randomをimportする
import java.util.Random;
//scannerをインポートする
import java.util.Scanner;
public class Qes6 {

	public static void main(String[] args) {
		// scannerを初期化
		Scanner scanner = new Scanner(System.in);
		// checkに入力した文字を受け取れるようにする
		String check = scanner.nextLine();
		// scannerを閉じる
		scanner.close();

		// Randomを初期化する
		Random rand = new Random();

		// 受け取った文字列を「、」で区切れるようにする
		String check_items[] = check.split("、");
		// TVDisplay_randを宣言してランダムな数字を入れる
		int TVDisplay_rand = rand.nextInt(11) + 1;
		// check_itemsに対する拡張for文を生成
		for(String item: check_items) {

			// テレビのランダム数をTV_randに代入
			int item_rand = rand.nextInt(11) + 1;

			// itemによるswitch文を生成する
			switch(item) {

			// パソコンだった時のcaseを作成
			case "パソコン":
	
				// 冷蔵庫だった時のcaseを作成
			case "冷蔵庫":

				// 扇風機だった時のcaseを作成
			case "扇風機":

				// 洗濯機だった時のcaseを作成
			case "洗濯機":
			
				// 加湿器だった時のcaseを作成
			case "加湿器":
				// 「○○の残り台数は〇台です」を出力
				System.out.println(item + "の残り台数は" + item_rand + "台です\n");
				break;

				// テレビかディスプレイだった時のcaseを作成
			case "テレビ":
			case "ディスプレイ":
				// itemがテレビだった時の条件演算子を作成。「true」だった場合「テレビの残り台数」「false」だった場合「ディスプレイの残り台数」を出力
				System.out.println(item.equals("テレビ") ? "テレビの残り台数は" + TVDisplay_rand + "台です" : "ディスプレイの残り台数は" + TVDisplay_rand + "台です" );	
				// TV_randにitem_randを代入
				TVDisplay_rand = 11 - TVDisplay_rand;
				break;

				// いずれの場合でもなかった時の処理を作成
			default :
				// itemは指定の商品ではありませんを出力
				System.out.println("『" + item + "』は指定の商品ではありません" );
				break;
			}


		}


	}

}
