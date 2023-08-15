package introduction;

class Person {
	public static int count = 0;
	public String firstName;
	public int age;
	public double height, weight;
	// 問1 フィールドを追加
	public String lastName;

	// 問2 引数を追加
	Person(String firstName, String lastName, int age, double height, double weight) {
		Person.count++;
		this.firstName = firstName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		// 問3 セット
		this.lastName = lastName;
	}

	public String fullName() {
		return this.firstName + this.lastName;
	}

	public void print() {
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}

	public double bmi() {
		return this.weight / this.height / this.height;
	}

	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}
}