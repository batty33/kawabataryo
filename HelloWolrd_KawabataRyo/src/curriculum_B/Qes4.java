package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		
		// iが9まで繰り返すfor文を生成
		for(int i = 1; i <= 9; i++) {
			// 改行
			System.out.println("");
			// jが9まで繰り返すfor文を生成
			for(int j = 1; j <= 9; j++) {
				
				// i*jをansに代入
				int ans = i * j;
				// jが1の時のif文を生成
				
				if (j == 1) {
					// 九九を「||」なしで出力
					System.out.printf("%02d * %02d = %02d",i,j,ans );
					
					// jが1以外の処理を生成 
				} else {
					// 九九を「||」ありで出力
					System.out.printf("|| %02d * %02d = %02d",i,j,ans );
				}
			}
			// 改行
			System.out.println("");
		}
	}

}
