package company;

public class 標準ライブラリ {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        
String a = new String("Hello");
String b = new String("Hello");
String c = a;

//演算子の使用
System.out.println(a == b);//false, aとbは異なるオブジェクトを使用
System.out.println(a == c);//true, aとcは同じオブジェクトを使用

//equals()メソッドの使用
System.out.println(a.equals(b));//true, aとbの内容（文字列）は同じ

//toString()メソッド
Double d = 3.14;
System.out.println(d.toString());

//hashCode()メソッド
System.out.println(d.hashCode());

}

}
