package curriculum_B;

// スキャナーをimportする
import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {

		// scannerを初期化する
		Scanner scanner = new Scanner(System.in);

		// 英語の点数の合計を宣言する
		int totalEnglish = 0;
		// 数学の点数の合計を宣言する
		int totalMath = 0;
		// 理科の点数の合計を宣言する
		int totalScience = 0;
		// 社会の点数の合計を宣言する
		int totalSocial = 0;
		// 生徒の番号を宣言
		int studentsNum;

		// 1度は実行される処理
		do {
			// 生徒の人数を入力してください（2以上）:を出力
			System.out.print("生徒の人数を入力してください（2以上）: ");
			// 入力された数字を変数に代入
			studentsNum = scanner.nextInt();
			// 条件は生徒数が2より少ない
		} while (studentsNum < 2);

		// 点数を人数分まとめる
		int scores[][] = new int[studentsNum][4];
		// 平均点を人数分でまとめる
		double averages[] = new double[studentsNum];

		// 生徒の数だけ繰り返す
		for (int i = 0; i < studentsNum; i++) {

			// 英語の点数の処理
			System.out.print((i + 1) + "人目の『英語』の点数を入力してください : ");
			scores[i][0] = scanner.nextInt();
			// 数学の点数の処理
			System.out.print((i + 1) + "人目の『数学』の点数を入力してください : ");
			scores[i][1] = scanner.nextInt();
			// 理科の点数の処理
			System.out.print((i + 1) + "人目の『理科』の点数を入力してください : ");
			scores[i][2] = scanner.nextInt();
			// 社会の点数の処理
			System.out.print((i + 1) + "人目の『社会』の点数を入力してください : ");
			scores[i][3] = scanner.nextInt();
			System.out.println("");

			// 英語の点数を合計値に足す
			totalEnglish += scores[i][0];
			// 数学の点数を合計値に足す
			totalMath += scores[i][1];
			// 理科の点数を合計値に足す
			totalScience += scores[i][2];
			// 社会の点数を合計値に足す
			totalSocial += scores[i][3];

			// 各生徒の平均値を配列にいれる
			averages[i] = ((double) scores[i][0] + (double) scores[i][1] + (double) scores[i][2]
					+ (double) scores[i][3]) / 4;
		}

		// 生徒数まで繰り返す
		for (int i = 0; i < studentsNum; i++) {

			System.out.printf("%d人目の平均点は%.2f点です%n", i + 1, averages[i]);
		}

		// 英語の平均点を宣言
		double averageEnglish = (double) totalEnglish / studentsNum;
		// 数学の平均点を宣言
		double averageMath = (double) totalMath / studentsNum;
		// 理科の平均点を宣言
		double averageScience = (double) totalScience / studentsNum;
		// 社会の平均点を宣言
		double averageSocial = (double) totalSocial / studentsNum;
		// 全体の平均点を宣言
		double averageAll = (averageEnglish + averageMath + averageScience + averageSocial) / 4;

		// 英語の平均点
		System.out.printf("%n英語の平均点は%.2f点です%n", averageEnglish);
		// 数学の平均点
		System.out.printf("数学の平均点は%.2f点です%n", averageMath);
		// 理科の平均点
		System.out.printf("理科の平均点は%.2f点です%n", averageScience);
		// 社会の平均点
		System.out.printf("社会の平均点は%.2f点です%n", averageSocial);
		// 全体の平均点
		System.out.printf("全体の平均点は%.2f点です%n", averageAll);

		scanner.close();
	}

}
