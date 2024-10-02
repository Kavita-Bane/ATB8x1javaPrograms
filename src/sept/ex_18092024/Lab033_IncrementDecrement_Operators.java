package ex_18092024;

public class Lab033_IncrementDecrement_Operators {
    public static void main(String[] args) {
        //Increment(++) & Decrement(--) Operators
        //Pre & Post
        System.out.println("***Pre-Increment Operator***");
        //pre-increment = ++operand
        //Value is incremented first and then it is stored in the result.
        int a = 10;
        System.out.println("Before increment value of a is="+a);
        int b = ++a; //++a = a+1 so a = a+1
        System.out.println("After Increment value of a and b is:");
        System.out.println("b=" +b);
        System.out.println("a=" +a);

        int c = 10;
        System.out.println("Value of c is =" +(++c)); //Fist increment the value & then it will be printed
        System.out.println(c);

        //Post-Increment
        System.out.println("***Post-Increment Operator***");
        //Print first & then the value will be incremented
        int d = 10;
        System.out.println(d++); // output=10
        System.out.println(d); // output=11
    }
}
