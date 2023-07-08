package Animal;

public class Capsule {

	// メンバ変数を宣言
	private String animalName;
	private double bodyLength;
	private int fast;

	// ゲッターを生成
	public String getAnimalName() {

		// 変数を返す
		return this.animalName;
	}

	public double getBodyLength() {

		// 変数を返す
		return this.bodyLength;
	}

	public int getFast() {

		// 変数を返す
		return this.fast;
	}

	// セッターを生成
	public void setAnimalName(String name) {

		// 変数を更新
		this.animalName = name;

	}

	public void setBodyLength(double bodyLength) {

		// 変数を更新
		this.bodyLength = bodyLength;
	}

	public void setFast(int fast) {

		// 変数を更新
		this.fast = fast;
	}
}
