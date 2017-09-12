package sample2;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World！！！");
	    System.out.println("Nice to meet you!");


  //---------------------------------------------------------------------------------------
  //変数定義
          System.out.println("*変数定義---------------------------");
  		//-2147483648 から2147483647まで整数の値
  		int SampleInt = -1;

  		//128から127までの整数の値。
  		byte SampleByte = 127;

  		//'\u0000' から'\uffff'までの整数の値。（これは、0から65535である）
  		char SampleChar = '\u0000';

  		//-32768から32767の整数の値
  		short SampleShort = -32768;

  		//-9223372036854775808から9223372036854775807までの整数の値。
  		long SampleLong = -9223;

  		//32ビット単精度小数点
  		float SampleFloat = (float) 1.5;

  		//64ビット倍精度小数点
  		double SampleDouble = 32.222;

  		//真（true）か偽（false）のどちらかの値。
  		boolean  SampleBoolean = true;

	}

}
