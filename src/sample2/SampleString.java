package sample2;

public class SampleString {

	public static void main(String[] args) {

//---------------------------------------------------------------------------------------
//文字列の結合
        System.out.println("*文字列の結合---------------------------");
        String str1 = "こんにちは。";// [1]
        String str2 = "山田さん。";// [2]
        String str3 = "お元気ですか？";// [3]
        String message;// [4]

        //「+」演算子を使用
        message = str1 + str2; // [5]
        System.out.println(message); // [6]

        //concatメソッドを使用
        message = message.concat(str3);// [7]
        System.out.println(message);// [8]
//---------------------------------------------------------------------------------------
//文字列の比較
        System.out.println("*文字列の比較---------------------------");
        String str4 = "朝"; //[1]
        String str5 = "朝"; //[2]
        String str6 = new String("朝"); //[3]
        String str7 = "朝日"; //[4]
        String str8 = str4 + "日"; //[5]

        //「==」演算子を使用
        System.out.println(str4 == str5); //[6]
        System.out.println(str5 == str6); //[7]
        System.out.println(str4 == str6); //[8]
        System.out.println(str7 == str8); //[9]

        System.out.println("---------------------------");

        //.equalsメソッドを使用
        System.out.println(str4.equals(str5)); //[10]
        System.out.println(str5.equals(str6)); //[11]
        System.out.println(str4.equals(str6)); //[12]
        System.out.println(str7.equals(str8)); //[13]

//---------------------------------------------------------------------------------------
//文字数
        System.out.println("*文字数---------------------------");
        String message2 ;
        message2 = "おはようございます。気持ちのいい朝です。";
        int num = message2.length();
        System.out.println("「" + message2 + "」の文字数は" + num + "です。" );
        for (int i = 1; i <= message2.length(); i++) {
            System.out.println(i + "回目の処理です。" );
        }

	}

}
