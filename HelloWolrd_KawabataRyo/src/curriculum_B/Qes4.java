package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {

		// 左の数字が9まで繰り返すfor文を生成
		for(int i = 1; i <= 9; i++) {
			
			// 改行
			System.out.println("");
			
			// 右の数字が9まで繰り返すfor文を生成
			for(int j = 1; j <= 9; j++) {

				// 賭けた数字をansに代入
				int ans = i * j;
				// 右の数字が1の時のif文を生成

				if (j == 1) {
					// 九九を「||」なしで出力
					System.out.printf("\n%02d * %02d = %02d",i,j,ans );

					// 右の数字が1以外の処理を生成 
				} else {
					// 九九を「||」ありで出力
					System.out.printf("|| %02d * %02d = %02d",i,j,ans );
				}
			}
		
		}
	}

}
