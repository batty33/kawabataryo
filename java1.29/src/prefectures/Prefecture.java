package prefectures;

public class Prefecture {

	// フィールド宣言
	private String name;
	private String capital;
	private int area;

	// コンストラクタ
	public Prefecture(String name, String capital, int area) {

		this.name = name;
		this.capital = capital;
		this.area = area;
	}

	// ゲッター、セッター
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	// オーバーライド
	public String toString() {
		return "都道府県名: " + name + "\n県庁所在地： " + capital + "\n面積: " + area + "km2\n";
	}

}
