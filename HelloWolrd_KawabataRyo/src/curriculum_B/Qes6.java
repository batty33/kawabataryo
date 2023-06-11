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
		
		// checkで受け取った文字列を「、」で区切れるようにする
		String check_items[] = check.split("、");
		// TV_randを宣言して初期化する
		int TV_rand = 0;
		// check_itemsに対する拡張for文を生成
		for(String item: check_items) {
			
			// テレビのランダム数をTV_randに代入
			int item_rand = rand.nextInt(11) + 1;
		
			// itemによるswitch文を生成する
			switch(item) {
			
				// itemがパソコンだった時のcaseを作成
				case "パソコン":
					// 「パソコンの残り台数はrand台です」と出力
					System.out.println("パソコンの残り台数は" + item_rand +"台です");
					break;

				// itemが冷蔵庫だった時のcaseを作成
				case "冷蔵庫":
					// 「冷蔵庫の残り台数はrand台です」を出力
					System.out.println("冷蔵庫の残り台数は" + item_rand + "台です");
					break;
					
				// itemが扇風機だった時のcaseを作成
				case "扇風機":
					// 「扇風機の残り台数はrand台です」を出力
					System.out.println("扇風機の残り台数は" + item_rand +"台です");
					break;
					
				// itemが洗濯機だった時のcaseを作成
				case "洗濯機":
					// 「洗濯機の残り台数はrand台です」を出力
					System.out.println("洗濯機の残り台数は" + item_rand + "台です");
					break;
					
				// itemが加湿器だった時のcaseを作成
				case "加湿器":
					// 「加湿器の残り台数はrand台です」を出力
					System.out.println("加湿器の残り台数は" + item_rand + "台です");
					break;
					
				// itemがテレビかディスプレイだった時のcaseを作成
				case "テレビ":
				case "ディスプレイ":
					// itemがテレビだった時の条件演算子を作成。「true」だった場合「テレビの残り台数」「false」だった場合「ディスプレイの残り台数」を出力
					System.out.println(item.equals("テレビ") ? "テレビの残り台数は" + item_rand + "台です" : "ディスプレイの残り台数は" + (11 - TV_rand) + "台です" );	
					// TV_randにitem_randを代入
					TV_rand = item_rand;
					break;
					
				// いずれの場合でもなかった時の処理を作成
				default :
					// itemは指定の商品ではありませんを出力
					System.out.println("『" + item + "』は指定の商品ではありません" );
					break;
			}
			
			// 改行
			System.out.println("");
		}
		

	}

}
