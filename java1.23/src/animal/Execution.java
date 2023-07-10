package animal;

import java.util.Objects;

/*
	
	下記がコンソールに出力されるように作成してください
	※thisとsetterとgetterとフィールドを使ってください
	
	動物名：ライオン
体長：2.1m
速度：80km/h
	
*/

public class Execution {

	public static void main(String[] args) {
		// インスタンスを生成
		Capsule capsule = new Capsule();

		// 変数をセット
		capsule.setAnimalName("ライオン");
		capsule.setBodyLength(2.1);
		capsule.setFast(80);

		// ゲッター
		String name = capsule.getAnimalName();
		double length = capsule.getBodyLength();
		int fast = capsule.getFast();

		// コンソールに出力
		if (Objects.nonNull(name)) {

			System.out.println("動物名: " + name);
		}

		if (Objects.nonNull(length)) {

			System.out.println("体長: " + length + "m");
		}

		if (Objects.nonNull(fast)) {

			System.out.println("速度: " + fast + "km/h");
		}
	}

}
