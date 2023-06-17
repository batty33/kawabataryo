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

		// 1度でも実行されるdowhile文を作成
		do {
			// 生徒の人数を入力してください（2以上）:を出力
			System.out.printf("生徒の人数を入力してください（2以上）: ");
			// 入力された数字を変数に代入
			studentsNum = scanner.nextInt();
			// dowhileの条件を生徒数が2以上とする	
		} while (studentsNum < 2);

		// 英語の点数を配列で人数分でまとめる
		int englishScores[] = new int[studentsNum];
		// 数学の点数を配列で人数分でまとめる
		int mathScores[] = new int[studentsNum];
		// 理科の点数を配列で人数分でまとめる
		int scienceScores[] = new int[studentsNum];
		// 社会の点数を配列で人数分でまとめる
		int socialScores[] = new int[studentsNum];
		// 平均点を配列で人数分でまとめる
		double averages[] = new double[studentsNum];

		// 生徒の数だけ繰り返されるfor文を生成
		for (int i = 0; i < studentsNum; i++) {

			// 〇人目の英語の点数を入力してくださいを出力
			System.out.printf((i + 1) + "人目の『英語』の点数を入力してください : ");
			englishScores[i] = scanner.nextInt();
			//〇人目の数学の点数を入力してくださいを出力
			System.out.printf((i + 1) + "人目の『数学』の点数を入力してください : ");
			mathScores[i] = scanner.nextInt();
			//〇人目の理科の点数を入力してくださいを出力
			System.out.printf((i + 1) + "人目の『理科』の点数を入力してください : ");
			scienceScores[i] = scanner.nextInt();
			// 〇人目の社会の点数を入力してくださいを出力
			System.out.printf((i + 1) + "人目の『社会』の点数を入力してください : ");
			socialScores[i] = scanner.nextInt();
			System.out.println("");
			
			// 英語の点数を合計値に足していく
			totalEnglish += englishScores[i];
			// 数学の点数を合計値に足していく
			totalMath += mathScores[i];
			// 理科の点数を合計値に足していく
			totalScience += scienceScores[i];
			// 社会の点数を合計値に足していく
			totalSocial += socialScores[i];

			// 各生徒の平均値を配列にいれる
			averages[i] = ((double)englishScores[i] + (double)mathScores[i] + (double)scienceScores[i] + (double)socialScores[i]) / 4;
		}

		// 生徒数までのfor文を生成
		for (int i = 0; i < studentsNum; i++) {
			// 〇人目の平均点は〇点ですと出力
			System.out.println((i + 1) + "人目の平均点は" + formatDouble(averages[i]) + "点です");
		}

		// 英語の平均点を変数に代入
		double averageEnglish = (double) totalEnglish / studentsNum;
		// 数学の平均点を変数に代入
		double averageMath = (double) totalMath / studentsNum;
		// 理科の平均点を変数に代入
		double averageScience = (double) totalScience / studentsNum;
		// 社会の平均点を変数に代入
		double averageSocial = (double) totalSocial / studentsNum;
		// 全体の平均点を変数に代入
		double averageAll = (averageEnglish + averageMath + averageScience + averageSocial) / 4;

		// 英語の平均点を出力
		System.out.println("\n英語の平均点は" + formatDouble(averageEnglish) + "点です");
		// 数学の平均点を出力
		System.out.println("数学の平均点は" + formatDouble(averageMath) + "点です");
		// 理科の平均点を出力
		System.out.println("理科の平均点は" +formatDouble(averageScience) + "点です");
		// 社会の出力
		System.out.println("社会の平均点は" + formatDouble(averageSocial) + "点です");
		// 全体の平均点を出力
		System.out.println("全体の平均点は" + formatDouble(averageAll) + "点です");

		// scannerを閉じる
		scanner.close();
	}

	// formatDoubleメソッドを作成
	private static String formatDouble(double value) {
		// 小数点2桁までの値でリターンする
		return String.format("%.2f", value);
	}

}
