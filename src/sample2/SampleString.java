package sample2;

public class SampleString {
	public static void main(String[] args) {

				//---------------------------------------------------------------------------------------
				//文字列の結合
				//「+」,.concat()
				System.out.println("*文字列の結合---------------------------");
				System.out.println("*「+」,.concat()---------------------------");
				String str1 = "こんにちは。";// [1]
				String str2 = "山田さん。";// [2]
				String str3 = "お元気ですか？";// [3]
				String message;// [4]

				message = str1 + str2; // [5]
				System.out.println(message); // [6]

				message = message.concat(str3);// [7]
				System.out.println(message);// [8]

				//---------------------------------------------------------------------------------------
				//文字列の比較
				//「==」演算子,.equals()
				System.out.println();
				System.out.println("*文字列の比較---------------------------");
				System.out.println("*「==」演算子,.equals()---------------------------");
				String str4 = "朝"; //[1]
				String str5 = "朝"; //[2]
				String str6 = new String("朝"); //[3]
				String str7 = "朝日"; //[4]
				String str8 = str4 + "日"; //[5]

				System.out.println(str4 == str5); //[6]
				System.out.println(str5 == str6); //[7]
				System.out.println(str4 == str6); //[8]
				System.out.println(str7 == str8); //[9]

				System.out.println("---------------------------");

				System.out.println(str4.equals(str5)); //[10]
				System.out.println(str5.equals(str6)); //[11]
				System.out.println(str4.equals(str6)); //[12]
				System.out.println(str7.equals(str8)); //[13]

				//---------------------------------------------------------------------------------------
				//文字数取得
				//.length()
				System.out.println();
				System.out.println("*文字数check---------------------------");
				System.out.println("*.length()--------------------------------");
				String message2 ;
				message2 = "おはようございます。気持ちのいい朝です。";
				int num = message2.length();
				System.out.println("「" + message2 + "」の文字数は" + num + "です。" );
				for (int i = 1; i <= message2.length(); i++) {
				System.out.println(i + "回目の処理です。" );
				}

				//---------------------------------------------------------------------------------------
				//文字トリム
				//.trim()
				System.out.println();
				System.out.println("*文字トリム---------------------------");
				System.out.println("*.trim()-------------------------------");
				String message3 ;
				message3 = "   おはようございます。気持ちのいい朝です。  ";//[1]
				String result = message3.trim();//[2]
				System.out.println("もとの文字列：" + message3 + "です。" ); //[3]
				System.out.println("空白を取り除いた文字列：" +result+ "です。" ); //[4]

				//空白が全角の場合
				System.out.println("----------------------" );
				String message4 ;
				message4 = "　　　おはようございます。気持ちのいい朝です。　　";//[5]
				String result1 = message4.trim();//[6]
				System.out.println("もとの文字列：" + message4 + "です。" ); //[7]
				System.out.println("空白を取り除いた文字列：" +result1+ "です。" ); //[8]

				//比較
				System.out.println("----------------------" );
				String inputStr ; //[1]
				inputStr = "福岡県 ";//[2]
				String compareStr = "福岡県";//[3]
				System.out.println("trimを使用しない場合の結果：" + compareStr.equals(inputStr) + "です。" ); //[4]
				System.out.println("trimを使用した場合の結果：" + compareStr.equals(inputStr.trim()) + "です。" ); //[5]

				//---------------------------------------------------------------------------------------
				//文字の間を取得
				//.substring()
				System.out.println();
				System.out.println("*文字の間を取得---------------------------");
				System.out.println("*.substring()------------------------");
				String message5 ; //[1]
				message5 = "おはようございます。気持ちのいい朝です。";//[2]
				String result3 = message5.substring(4);//[3]
				System.out.println("取得したのは「" + result3 + "」です。" ); //[4]
				String result4 = message5.substring(0,4);//[3]
				System.out.println("取得したのは「" + result4 + "」です。" ); //[4]

				System.out.println("----------------------" );
				String date ; //[1]
				date = "20160101";//[2]
				String year = date.substring(0,4);//[3]
				String month = date.substring(4,6);//[4]
				String day = date.substring(6);//[5]
				System.out.println("もとの文字列：" + date);
				System.out.println("日付は" + year + "年" + month + "月" + day  + "日です。"); //[6]

				//---------------------------------------------------------------------------------------
				//大文字・小文字変換
				//.toUpperCase(),.toLowerCase()
				System.out.println();
				System.out.println("*大文字・小文字変換---------------------------");
				System.out.println("*.toUpperCase(),.toLowerCase()--------------");
				String komoji ;
				String oonmoji ;
				komoji = "hello";
				oonmoji = "HI";
				String resultKomoji = komoji.toUpperCase();//[1]
				String resultOomoji = oonmoji.toLowerCase();//[2]
				System.out.println(komoji + "は「" + resultKomoji + "」に変換。" ); //[3]
				System.out.println(oonmoji + "は「" + resultOomoji + "」に変換。"  ); //[4]

				//---------------------------------------------------------------------------------------
				//文字置換
				//.replaceFirst(),.replaceAll()
				System.out.println();
				System.out.println("*文字置換---------------------------");
				System.out.println("*.replaceFirst(),.replaceAll()-------");
				String message6 ;
				message6 = "ABCABCABCABCABC";//[1]
				String result5 = message6.replaceFirst("A","YYY");//[2]
				String result6 = message.replaceAll("A","YYY");//[2]
				System.out.println("もとの文字列：" + message6);
				System.out.println("置換した文字列(replaceFirst)：" + result5);//[3]
				System.out.println("置換した文字列(replaceAll)：" + result6);//[3]
				System.out.println("正規表現-------------------------");
				String message7 ;
				message7 = "A.B.C.D";//[1]

				String result7 = message7.replaceAll(".","1");//[2]
				System.out.println("もとの文字列：" + message7);
				System.out.println("エスケープなしで置換した文字列：" + result7);//[3]

				String result8 = message7.replaceAll("\\.","1");//[4]
				System.out.println("もとの文字列：" + message7);
				System.out.println("エスケープして置換した文字列：" + result8);//[5]

				//---------------------------------------------------------------------------------------
				//文字分割
				//.split()
				System.out.println();
				System.out.println("*文字分割---------------------------");
				System.out.println("*.split()-------------------");
				String message8;
				message8 = "赤1青2黄色3白5緑";
				String[] resultArray = message8.split("[0-9]");
				System.out.println(resultArray[0]);
				for (int i = 0; i < resultArray.length; i++) {
				    System.out.println(resultArray[i]);
				}
				System.out.println("--------------------------");
				String message9;
				message9 = "@@@@,###,1,komeda,coffee";
				String[] resultArray2 = message9.split(",",4);
				for (int i = 0; i < resultArray2.length; i++) {
				    System.out.println(resultArray2[i]);
				}

	}

}