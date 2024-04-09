package company;

public class object {

    public static void main(String[] args) {
       
        //Length()メソッド
        String str = " Hello Wprld! ";
        System.out.println(str.length());
        
        //substring()メソッド
        System.out.println(str.substring(1,4));
        
        //contains()メソッド
        System.out.println(str.contains("llo"));
        
        //replace()メソッド
        System.out.println(str.replace('l', 'l'));
        
        //trim()メソッド
        System.out.println(str.trim());
        
        //formatted()メソッド
        String name = "Alice";
        int age = 25;
        double height = 1.7;
        
        String formattedString = "Name: %s, Age: %d, Height: %.2f".formatted(name, age, height);
        System.out.println(formattedString);
        
       
       
    }

}
