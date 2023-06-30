package curriculum_New_question;
import java.util.Random;

public class Curriculum_New_1_18{
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void hello(String str, int i) {
		// 変数の宣言
		str = "Hello JavaSE";
		i = 11;
		
		// コンソールに出力
		System.out.println(str + " " + i);
	}
	
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void 	calculation(int i, int j) {
		// コンソールに出力
		System.out.println(i * j);
	}
	
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void retNum(int num[]) {
		// numの数だけ繰り返す
		for(int i: num) {
			
			// コンソールへ出力
			System.out.print(i + " ");
		}
		
		// 改行
		System.out.println("");
	}
	
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void calculation(double i, double j) {
		// コンソールへ出力
		System.out.println(i + j);
	}
	
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	public static int[] randHandred(int num) {
		// 格納する配列を宣言
		int rHandred[] = new int[num];
		Random rand = new Random();
		
		// 引数分繰り返す
		for (int i = 0; i < num; i++) {
			
			// 配列に格納
			rHandred[i] = rand.nextInt(100) + 1;
			
			// コンソールへ出力
			System.out.println(rHandred[i]);
		}
		
		// 戻り値
		return rHandred;
	}
	
	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static double ave(int num) {
		// 戻り値の受け取り
		int rHandred[] = randHandred(num);
		// 合計値を宣言
		int sum = 0;
		
		// 配列分繰り返す
		for (int i : rHandred) {
			
			// 配列を足す
			sum += i;
		}
		
		// 平均値
		double average = (double)sum / num;	
		
		// コンソールを出力
		System.out.println(average);
		
		// 戻り値
		return average;
	}
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static void judgeHalf(int num) {
		// 戻り値の受け取り
		double average = ave(num);
		
		// 50以上か以下で場合分け
		if (average >= 50) {
		
			System.out.println(true);
		
		} else {
		
			System.out.println(false);
		}
	}
	public static void main(String[] args) {
    // 作成したメソッドをここで呼び出してください
		// 問1呼び出し
		hello("hi",1);
		
		// 改行
		System.out.println("");
		
		// 問2呼び出し
		calculation(2,4);
		
		// 改行
		System.out.println("");
		
		// 配列を宣言
		int arr[] = {1,3,4,6,7,8};
		
		// 問3呼び出し
		retNum(arr);
		
		// 改行
		System.out.println("");
		
		// 問4呼び出し
		calculation(0.3,0.7);
		
		// 改行
		System.out.println("");
		
		// 問5呼び出し
		randHandred(5);
		
		// 改行
		System.out.println("");
		
		// 問6呼び出し
		ave(5);
		
		// 改行
		System.out.println("");
		
		// 問7呼び出し
		judgeHalf(5);
	}
}