package status;

public class StatusBase {

	// フィールド変数を宣言
	private int hp;
	private int mp;
	private int atk;
	private int dex;
	private int def;

	public StatusBase() {

		// 変数の初期化
		this.hp = 0;
		this.mp = 0;
		this.atk = 0;
		this.dex = 0;
		this.def = 0;

	}

	// ゲッターとセッターを生成
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDex() {
		return dex;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	// メソッドを生成
	public String toString() {

		return "HP : " + getHp() + "\nMP : " + getMp()

				+ "\n攻撃力 : " + getAtk() + "\n素早さ : " + getDex() + "\n防御力 : " + getDef();
	}
}
