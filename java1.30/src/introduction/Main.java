package introduction;

class Main {
	public static void main(String[] args) {

		// 問5 引数を追加
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);

		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.height);

		// メソッドの呼び出し
		person1.print();

		// 問10 合計人数を出力
		System.out.println("合計" + Person.count + "人です");
	}
}
