package sample2;

public class SampleCalc {

	public static void main(String[] args) {
//---------------------------------------------------------------------------------------
//計算式試し
		  System.out.println("*計算式試し---------------------------");
		  int a;
		  int b;

		  //変数初期化
		  a = 0;
		  b = 0;

		  //aとbの加減算処理
		  for(int i = 1;i <= 10; i++){
			  a += i;	//aにiを加算する
			  b -= i;	//bにiを減算する
		  }
		  //aとbのうち、大きい方の数を出力
		  System.out.println("result(max) : " + Math.max(a, b));

		  //aとbのうち、小さい方の数を出力
		  System.out.println("result(min) : " + Math.min(a, b));
//---------------------------------------------------------------------------------------
//配列
		        System.out.println("*配列---------------------------");
				int list;

				list = 0;
				setArray();
				System.out.println("list = " + list);

				int intVal;
				intVal = Integer.valueOf("22").intValue();

				System.out.println("intVal = " + intVal);
	}
	public static void setArray(){
		int list[] = new int[10];
		list[0] = 1;
	}

}
