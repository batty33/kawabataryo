package introduction;

class Main {
	public static void main(String[] args) {

		// 問5 引数を追加
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		Person person2 = new Person("山田二郎", 30, 1.8, 70);
		Car car = new Car();
		Bicycle bicycle = new Bicycle();

		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.height);

		// メソッドの呼び出し
		person1.print();

		// 問10 合計人数を出力
		System.out.println("合計" + Person.count + "人です");

		// 所有者をセットする
		car.setOwner(person1.name);
		bicycle.setOwner(person2.name);

		// コンソールへ出力
		System.out.println(car.getOwner());
		System.out.println(bicycle.getOwner());

		// 購入するメソッドの呼び出し
		person1.buy(car);
		person2.buy(bicycle);
	}
}
