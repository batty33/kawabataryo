package curriculum_B;

// スキャナーをimportする
import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {

		// scannerを初期化する
		Scanner scanner = new Scanner(System.in);

		// 教科を配列に
		String subject[] = {"英語", "数学", "理科", "社会"};
		
		// 教科の合計点を教科の数でまとめる
		int totalScores[] = new int[subject.length];
		
		// 生徒の番号を宣言
		int studentsNum;

		// 1度は実行される処理
		do {
			System.out.print("生徒の人数を入力してください（2以上）: ");
			// 入力された数字を変数に代入
			studentsNum = scanner.nextInt();
			
		// 条件は生徒数が2より少ない
		} while (studentsNum < 2);
		// 点数を人数分まとめる
		int scores[][] = new int[studentsNum][subject.length];
		// 平均点を人数分でまとめる
		double averages[] = new double[studentsNum];
		// 個人の合計点をまとめる
		int allScores[] = new int[studentsNum];
		
		
		// 生徒の数だけ繰り返す
		for (int i = 0; i < studentsNum; i++) {
		
			// 教科の数だけ繰り返す
			for (int j = 0; j < subject.length; j++) {
				// i人目のjの科目の処理
				System.out.print((i + 1) + "人目の" + subject[j] + "の点数を入力してください : ");
				scores[i][j] = scanner.nextInt();
				// 教科ごとに合計点足していく
				totalScores[j] += scores[i][j];
				// 個人の合計点を足していく
				allScores[i] += scores[i][j]; 
			}
			System.out.println("");
			// 各生徒の平均値を配列にいれる
			averages[i] = (double)allScores[i] / subject.length;
					
		}

		// 生徒数まで繰り返す
		for (int i = 0; i < studentsNum; i++) {

			System.out.printf("%d人目の平均点は%.2f点です%n", i + 1, averages[i]);
		}
		System.out.println("");
		
		// 教科ごとの平均点を宣言
		double averageSubject[] = new double[subject.length];
	
		//全体の平均点を宣言
		double averageAll = 0;
		
		// 教科数まで繰り返す
		for (int j = 0; j < subject.length; j++) {
			// 教科ごとに合計点数を生徒数で割る
			averageSubject[j] = (double) totalScores[j] / studentsNum;
			// 全体の平均値のために上の数字を足していく
			averageAll += averageSubject[j];
		}
		
		// 足してたものを教科数で割る
		averageAll /= subject.length;
		
		// 教科数まで繰り返す
		for (int j = 0; j < subject.length; j++) {
			// 教科ごとの出力
			System.out.printf("%sの平均点は%.2f点です%n", subject[j], averageSubject[j]);
		}
		// 全体の合計点出力
		System.out.printf("全体の平均点は%.2f点です%n", averageAll);
		scanner.close();
	}

}
