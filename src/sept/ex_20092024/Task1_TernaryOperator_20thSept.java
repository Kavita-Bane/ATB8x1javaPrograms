package ex_20092024;

public class Task1_TernaryOperator_20thSept {
    public static void main(String[] args) {
        //✅ By using Ternary Operators max between 3 numbers.
        int a = 90 ;
        int b = 25;
        int c = 45;
        int result= a>b? (a>c ? a:c):(b>c ? b:c);
        System.out.println(result);

    }
}
