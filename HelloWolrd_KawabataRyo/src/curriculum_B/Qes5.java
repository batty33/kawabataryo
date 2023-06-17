package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		// 右の数字が9まで繰り返すfor文を生成
		for(int i = 1; i <= 9; i++) {
			// 改行
			System.out.println("");
			// 左の数字が20まで繰り返すfor文を生成
			for(int j = 1; j <= 20; j++) {

				// 掛けた数字をansに代入
				int ans = i * j;
				// 左の数字が1の時のif文を生成
				if (j == 1) {
					// 九九を「||」なしで出力
					System.out.printf("\n%03d * %03d = %03d",j,i,ans );

					// 右の数字が1以外の処理を生成 
				} else {
					// 「j * i = ans」を「||」ありで出力
					System.out.printf("|| %03d * %03d = %03d",j,i,ans );
				}
			}
		
		}

	}

}
