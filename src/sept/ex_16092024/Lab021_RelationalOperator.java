package ex_16092024;

public class Lab021_RelationalOperator {
    public static void main(String[] args) {
        //Relational operator = boolean
        //always returns boolean value
        // < , >, <==, >==, ==, != --> true or false
        int a = 10;
        int b = 20;
        boolean c = a > b ;
        System.out.println(c);
        int age_a1 = 25;
        int age_b1 = 30;
        boolean result1 = age_b1 > age_b1 ;
        System.out.println(result1);
        boolean result2 = age_a1 >= age_a1;
        System.out.println(result2);


    }
}
