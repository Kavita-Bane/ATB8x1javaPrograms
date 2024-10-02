package ex_18092024;

public class Lab034_IncrementOperator_Examples {
    public static void main(String[] args) {
        int a = 10;
        int result = ++a;
        System.out.println("Pre-Increment");
        System.out.println(a); //output=11
        System.out.println(result); //output=11
        int b = 10;
        int result1 =  b++;
        System.out.println("***Post-Increment***");
        System.out.println(result1); // output=10
        System.out.println(b); //output = 11
    }
}
