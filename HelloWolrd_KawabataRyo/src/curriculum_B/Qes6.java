package curriculum_B;

import java.util.Random;
//scannerをインポートする
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Random rand = new Random();

		// 受け取った文字列を「、」で区切る
		String check_items[] = scanner.nextLine().split("、");
		scanner.close();

		// テレビとディスプレイの残数をランダムに宣言
		int tvDisplay_rand = rand.nextInt(12);

		// 入力されたものを1つずつ処理
		for (String item : check_items) {

			// 残数をランダムに宣言
			int item_rand = rand.nextInt(12);

			// 入力されたものによる場合分け
			switch (item) {

			// パソコンだった場合
			case "パソコン":

			// 冷蔵庫だった場合
			case "冷蔵庫":

			// 扇風機だった場合
			case "扇風機":

			// 洗濯機だった場合
			case "洗濯機":

			// 加湿器だった場合
			case "加湿器":

				System.out.println(item + "の残り台数は" + item_rand + "台です\n");
				break;

			// テレビかディスプレイだった場合
			case "テレビ":
			case "ディスプレイ":

				// アイテムの中身がテレビか否かで場合分け
				System.out.println(item.equals("テレビ") ? "テレビの残り台数は" + tvDisplay_rand + "台です\n"
						: "ディスプレイの残り台数は" + tvDisplay_rand + "台です\n");
				// テレビとディスプレイの残数を更新
				tvDisplay_rand = 11 - tvDisplay_rand;
				break;

			// いずれの場合でもなかった場合
			default:

				System.out.println("『" + item + "』は指定の商品ではありません\n");
				break;
			}

		}

	}

}
