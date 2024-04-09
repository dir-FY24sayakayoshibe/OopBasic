package company;

public class 文字列 {
    
    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
    
 // Length()メソッド
    String str = " Hello World! ";
    System.out.println(str.length());
    // 14

    // substring()メソッド
    System.out.println(str.substring(1, 4));
    // "Hel"

    // contains()メソッド
    System.out.println(str.contains("llo")); // true

    // replace()メソッド
    System.out.println(str.replace('l', 'L')); // " HeLLo WorLd! "

    // trim()メソッド
    System.out.println(str.trim()); // "Hello World!"

    // formatted()メソッド
    var name = "Alice";
    int age = 25;
    double height = 1.7;

    var formattedvar = "Name: %s, Age: %d, Height: %.2f".formatted(name, age, height);
    System.out.println(formattedvar);

}
}

