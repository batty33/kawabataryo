/*
 	
 	0, "北海道:札幌市:83424"
	1, "青森県:青森市:9646"
	2, "岩手県:盛岡市:15275"
	3, "宮城県:仙台市:7282"
	4, "秋田県:秋田市:11638"
	5, "山形県:山形市:9323"
	6, "福島県:福島市:13784"
	7, "茨城県:水戸市:6097"
	8, "栃木県:宇都宮市:6408"
	9, "群馬県:前橋市:6362"
	10, "埼玉県:さいたま市:3798"
 	
 	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
 	都道府県がソートされてコンソールに出力されるように作ってください
   	※Packageを2つ作ってください
   	※複数選択できるようにしてください
   	
   	例:
   	8,5,9,.....
   	と入力された場合（昇順）
   	
   	都道府県名：山形県
	県庁所在地：山形市
	面積：9323.0km2
   	
   	都道府県名：栃木県
	県庁所在地：宇都宮市
	面積：6408.0km2

   	都道府県名：群馬県
	県庁所在地：前橋市
	面積：6362.0km2
	
 */

package execution;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

import prefectures.Prefecture;

public class Introduction {

	private static Integer[] intSplit;

	public static void main(String[] arggs) {

		// インスタンスを生成
		Scanner scanner = new Scanner(System.in);

		// 配列を生成
		Prefecture prefectures[] = new Prefecture[11];

		// 配列に中身を入れる
		prefectures[0] = new Prefecture("北海道", "札幌市", 83424);
		prefectures[1] = new Prefecture("青森県", "青森市", 9646);
		prefectures[2] = new Prefecture("岩手県", "盛岡市", 15275);
		prefectures[3] = new Prefecture("宮城県", "仙台市", 7282);
		prefectures[4] = new Prefecture("秋田県", "秋田市", 11638);
		prefectures[5] = new Prefecture("山形県", "山形市", 9323);
		prefectures[6] = new Prefecture("福島県", "福島市", 13784);
		prefectures[7] = new Prefecture("茨城県", "水戸市", 6097);
		prefectures[8] = new Prefecture("栃木県", "宇都宮市", 6408);
		prefectures[9] = new Prefecture("群馬県", "前橋市", 6362);
		prefectures[10] = new Prefecture("埼玉県", "さいたま市", 3798);

		// コンソールへ出力
		System.out.println("0から10の数字を入力してください。複数選択する場合は「,」で区切ってください。");

		// 入力されたものを受け取る
		String strNum = scanner.nextLine();

		if (Objects.nonNull(strNum)) {

			// コンマで区切る
			String strSplit[] = strNum.split(",");

			// 配列を生成
			intSplit = new Integer[strSplit.length];

			// for文を生成
			for (int i = 0; i < strSplit.length; i++) {

				// 区切った物を整数に変換
				intSplit[i] = Integer.parseInt(strSplit[i]);

			}

		} else {
			System.out.println("入力が不正です。もう一度やり直してください。");
		}
		// コンソールへ出力
		System.out.println("「昇順」か「降順」を入力してください");

		// 繰り返し
		do {

			// ソートを入力で受け取る
			String orderSort = scanner.nextLine();

			// 場合分け
			if (Objects.nonNull(orderSort) && orderSort.equals("昇順")) {

				// 昇順に並び替え
				Arrays.sort(intSplit);
				break;

			} else if (Objects.nonNull(orderSort) && orderSort.equals("降順")) {

				// 降順に並び替え
				Arrays.sort(intSplit, Collections.reverseOrder());
				break;

			} else {

				// コンソールへ出力
				System.out.println("入力が不正です。もう一度正しい値を入力してください。");
			}

		} while (true);

		// スキャナーを閉じる
		scanner.close();

		// 繰り返し
		for (int i = 0; i < intSplit.length; i++) {

			// コンソールへ出力
			System.out.println(prefectures[intSplit[i]].toString());
		}
	}
}
