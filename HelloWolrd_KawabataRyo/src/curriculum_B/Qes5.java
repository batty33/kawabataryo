package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		// iが9まで繰り返すfor文を生成
				for(int i = 1; i <= 9; i++) {
					// 改行
					System.out.println("");
					// jが20まで繰り返すfor文を生成
					for(int j = 1; j <= 20; j++) {
						
						// i*jをansに代入
						int ans = i * j;
						// jが1の時のif文を生成
						if (j == 1) {
							// 「j * i = ans」を「||」なしで出力
							System.out.printf("%03d * %03d = %03d",j,i,ans );
							
							// jが1以外の処理を生成 
						} else {
							// 「j * i = ans」を「||」ありで出力
							System.out.printf("|| %03d * %03d = %03d",j,i,ans );
						}
					}
					// 改行
					System.out.println("");
				}

	}

}
