package introduction;

class Main {
	public static void main(String[] argos) {
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		person1.print();

		Person person2 = new Person("山田花子", 22, 1.5, 40);
		person2.print();

		// 問3 コンソール出力
		System.out.println("合計" + Person.count + "人です");

		// 問6 メソッドを呼び出す
		Person.printCount();
	}
}