package introduction;

class Person {

	// 問1 インスタンスフィールドを定義
	public String name;
	public int age;
	public double height;
	// 問4 インスタンスフィールドを追加
	public double weight;
	// 問10 人数の合計用のクラス変数を追加
	public static int count = 0;

	// 問2 コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight) {

		// 問3 引数をセット
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;

		// 人数を追加
		Person.count++;
	}

	// 問6 インスタンスメソッドを定義
	public double bmi() {

		// 問7 インスタンスのBMIをリターンさせる
		return weight / (height * height);
	}

	// 問8 インスタンスメソッドを定義
	public void print() {

		// 問9 コンソールへ出力
		System.out.println(
				"名前は" + this.name + "です\n" + "年は" + this.age + "です\n" + "BMIは" + Math.floor(bmi()) + "です\n");

	}
}
