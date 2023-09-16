package animals;

public class Animal {

	// フィールド宣言
	private String name;
	private double length;
	private int fast;
	private String scientificName;

	// ゲッターとセッターを生成
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public int getFast() {
		return fast;
	}

	public void setFast(int fast) {
		this.fast = fast;
	}

	public String getScientificName() {
		return scientificName;
	}

	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}

	// メソッドを生成
	public String toString() {
		return "動物名 : " + getName() + "\n体長 : " + getLength() + "m" + "\n速度 : " + getFast() + "km/h" + "\n学名 : "
				+ getScientificName() + "\n";
	}
}
