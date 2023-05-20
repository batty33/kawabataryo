package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// 問1
		
		// byte型のtenを宣言
		byte ten;
		// 短整数型のhundredを宣言する
		short hundred;
		// 整数型のthousandを宣言する
		int thousand;
		// 長整数型のten_thousandを宣言する
		long ten_thousand;
		// 単精度浮動小数点数型のdecimal_1を宣言する
		float decimal_1;
		//倍精度浮動小数点数型のdecimal_2を宣言する
		double decimal_2;
		// 文字型のletterを宣言する
		char letter;
		// 文字列型のsentenceを宣言する
		String sentence;
		// ブーリアン型のboolを宣言する
		boolean bool;
		
		// 問2
		
		//tenに初期値を設定する
		ten = 0;
		// hundredに初期値を設定する
		hundred = 0;
		// thousandに初期値を設定する
		thousand = 0;
		// ten_thousandに初期値を設定する
		ten_thousand = 0L;
		// decimal_1に初期値を設定する
		decimal_1 = 0.0f;
		// decimal_2に初期値を設定する
		decimal_2 = 0.0;
		// letterに初期値を設定する
		letter = '\u0000';
		// sentenceに初期値を設定する
		sentence = null;
		// boolに初期値を設定する
		bool = false;

		// 問3
		
		// tenに「10」を代入する
		ten = 10;
		// hundredに「100」を代入する
		hundred = 100;
		// thousandに「1000」を代入する
		thousand = 1000;
		// ten_thousandに「10000」を代入する
		ten_thousand = 10000;
		// decimal_1に「9.5」を代入する
		decimal_1 = 9.5f;
		// decimal_2に「10.5」を代入する
		decimal_2 = 10.5;
		// letterに「a」を代入する
		letter = 'a';
		// sentenceに「ハロー」を代入する
		sentence = "ハロー";
		// boolに「true」を代入する
		bool = true;
		
		// 問4
		
		// 「11110」を出力
		System.out.println(ten_thousand + thousand + hundred + ten);
		// 「20」を出力
		System.out.println(ten * 2);
		// 「aハローtrue」を出力
		System.out.println(letter + " " + sentence + " " + bool);
		//「11130」を出力
		System.out.println(ten + hundred + thousand + ten_thousand + decimal_1 + decimal_2);
		// 「10000000000」を出力
		System.out.println(ten * hundred * thousand * ten_thousand);
		// 「0.105」を出力
		System.out.println(decimal_2 / hundred);
		// 「-90」を出力
		System.out.println(ten - hundred);
		// 改行コード
		System.out.println();
		
		// 問5
		
		// 「ハローJAVA43」と出力できるように修正する
		int num= 20;
		int num1= 23;
		System.out.println("ハローJAVA" + (num + num1));
		// 改行コード
		System.out.println();
		
		// 問6
		
		// nemeを宣言しそれに「山田太郎」を代入
		String name = "山田太郎";
		// ageを宣言しそれに「18」を代入
		int age = 18;
		// heightを宣言しそれに「170.5」を代入
		double height = 170.5;
		// weightを宣言しそれに「62.2」を代入
		double weight = 62.2;
		// foodを宣言しそれに「寿司」を代入
		String food = "寿司";
		//「初めまして山田太郎です」を出力
		System.out.println("初めまして" + name + "です");
		// 「年齢は18歳です」を出力
		System.out.println("年齢は" + age + "歳です");
		// 「身長は170.5cmです」を出力
		System.out.println("身長は" + height + "cmです");
		// 「体重は62.2kgです」を出力
		System.out.println("体重は" + weight + "kgです");
		// 「好きな食べ物は寿司です」を出力
		System.out.println("好きな食べ物は" + food + "です");
		// 改行コード
		System.out.println();
		
		// 問7
		
		//bmiを宣言しそれにbmiの計算式「体重/(身長*身長)」を小数点第二位で四捨五入（heightはcm単位なので10000倍にしてm単位に変換）
		double bmi =((double)Math.round((weight / (height * height) * 10000) * 10) / 10);
		// 「BMIは〇〇です」を出力
		System.out.println("BMIは" + bmi + "です");
		// 改行コード
		System.out.println();
		
		// 問8
		
		// nameに「鈴木一郎」を再代入
		name ="鈴木一郎";
		// ageに24を再代入
		age =24;
		// heightに「168.5」を再代入
		height =168.5;
		// weightに「64.2」を再代入
		weight =64.2;
		// foodに「オムライス」を再代入
		food ="オムライス";
		//「初めまして鈴木一郎です」を出力
		System.out.println("初めまして" + name + "です");
		// 「年齢は24歳です」を出力
		System.out.println("年齢は" + age + "歳です");
		// 「身長は168.5cmです」を出力
		System.out.println("身長は" + height + "cmです");
		// 「体重は64.2kgです」を出力
		System.out.println("体重は" + weight + "kgです");
		// 「好きな食べ物はオムライスです」を出力
		System.out.println("好きな食べ物は" + food + "です");
		// bmiを再代入
		bmi =((double)Math.round((weight / (height * height) * 10000) * 10) / 10);
		// 「BMIは22.6です」と出力
		System.out.println("BMIは" + bmi + "です");
		// 改行コード
		System.out.println();
		
		// 問9
		
		// 年齢を48になるようにageに和算で自己代入
		age += 24;
		// 身長を337.0になるようにheightに和算で自己代入
		height += 168.5;
		// 体重を128.4になるようにweightに和算で自己代入
		weight += 64.2;
		//「初めまして鈴木一郎です」を出力
		System.out.println("初めまして" + name + "です");
		// 「年齢は48歳です」を出力
		System.out.println("年齢は" + age + "歳です");
		// 「身長は168.5cmです」を出力
		System.out.println("身長は" + height + "cmです");
		// 「体重は64.2kgです」を出力
		System.out.println("体重は" + weight + "kgです");
		// 「好きな食べ物はオムライスです」を出力
		System.out.println("好きな食べ物は" + food + "です");
		// bmiを再代入
		bmi =((double)Math.round((weight / (height * height) * 10000) * 100) / 100);
		// 「BMIは22.6です」と出力
		System.out.println("BMIは" + bmi + "です");
		// 改行コード
		System.out.println();
		
		// 問10
		
		//ageを問8で使用した値に再代入
		age = 24;
		// 年齢が25歳以上なら「true」を出力する
		System.out.println(age >= 25 ? true : false);
		// 改行コード
		System.out.println();
	
		// 問11
		
		// heightを問8で使用した値に再代入
		height = 168.5;
		// weightを問8で使用した値に再代入
		weight = 64.2;
		// ageを「age_str」に文字列型に変換して代入
		String age_str =String.valueOf(age);
		// heightを「height_str」に文字列に変換して代入
		String height_str =String.valueOf(height);
		// weightを「weight_str」に文字列に変換して代入
		String weight_str =String.valueOf(weight);
		//[年齢・身長・体重]の文字列型を繋げて出力
		System.out.println(age_str + height_str + weight_str);
		// 改行コード
		System.out.println();
		
		//問12
		
		// 変換したage_strをage_intに整数型に変換して代入
		int age_int =Integer.parseInt(age_str);
		// 変換したheihght_strをheight_dblに倍精度浮動小数点数型に変換して代入
		double height_dbl =Double.parseDouble(height_str);
		//変換したheight_dblをheight_intに整数型に変換して代入
		int height_int =(int)height_dbl;
		// age_intを出力
		System.out.println(age_int);
		// height_intを出力
		System.out.println(height_int);
		// 改行コード
		System.out.println();
		
		// 問13
		
		// 年齢が25もしくは身長が160以上ならばtrueを出力する
		System.out.println(age_int >= 25 || height_int >= 160 ? true : false);
	}

	
}
