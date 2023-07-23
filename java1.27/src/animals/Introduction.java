/*
 
 	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
 	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
  	
  	コンソール出力結果
  	
  	コンソールに文字を入力してください
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
	学名：パンテラ レオ
	
	動物名：ゾウ
	体長：3.2m
	速度：40km/h
	学名：ロキソドンタ・サイクロティス
	
	動物名：パンダ
	体長：1.9m
	速度：30km/h
	学名：アイルロポダ・メラノレウカ
	
	動物名：チンパンジー
	体長：0.94m
	速度：25km/h
	学名：パン・トゥログロディテス
	
	動物名：シマウマ
	体長：2.4m
	速度：65km/h
	学名：チャップマンシマウマ
	
	動物名：インコ
	体長：0.1m
	速度：50km/h
	学名：不明

  
  */

package animals;

//インポート
import java.util.Scanner;

public class Introduction {

	public static void main(String[] args) {
		
		// インスタンス
		Scanner scanner = new Scanner(System.in);
		// インスタンスで配列を生成。
		Animal animals[]= new Animal[6];
		
		// コンソールに出力
		System.out.println("コンソールに文字を入力してください");
		
		// 入力されたものを「,」で区切る
		String animalData[] = scanner.nextLine().split(",");
		
		// for文生成
		for (int i = 0; i < 6; i ++) {
			
			// インスタンスを生成し、配列に代入
			animals[i] = new Animal();
			
			// 区切った物をさらに「:」で区切る
			String data[] = animalData[i].split(":");
			
			// 区切った物をフィールドに更新
			animals[i].setName(data[0]);
			animals[i].setLength(Double.parseDouble(data[1]));
			animals[i].setFast(Integer.parseInt(data[2]));
			animals[i].setScientificName(scientificName(data[0]));
		}
		
		// for文生成
		for (int i = 0; i < 6; i++) {
			
			// メソッドの呼び出し
			System.out.println(animals[i].toString());
		}
		
		scanner.close();
	}

	// 学名メソッド生成
	private static String scientificName(String name) {
		
		// 場合分け
		switch (name) {
		
		case "ライオン" : return "パンテラ レオ";
		
		case "ゾウ" : return "ロキソドンタ・サイクロティス";
		
		case "パンダ" : return "アイルロポダ・メラノレウカ";
		
		case "チンパンジー" : return "パン・トゥログロディテス";
		
		case "シマウマ" : return "チャップマンシマウマ";
		
		default : return "不明";
		}
	}
}
