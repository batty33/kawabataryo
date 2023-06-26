package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {

		// 左の数字が9まで繰り返す
		for (int i = 1; i <= 9; i++) {

			System.out.println("");

			// 右の数字が9まで繰り返す
			for (int j = 1; j <= 9; j++) {

				// 掛けた数字を宣言
				int ans = i * j;

				// 右の数字で場合分け
				if (j == 1) {
					// 仕切りなしで出力
					System.out.printf("%n%02d * %02d = %02d", i, j, ans);

				// 1以外の場合
				} else {
					// 仕切りありで出力
					System.out.printf("|| %02d * %02d = %02d", i, j, ans);
				}
			}

		}
	}

}
