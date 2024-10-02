package ex_16092024;

public class Lab020_CompoundAssignmentOperator {
    public static void main(String[] args) {
        //Compound Assignment Operator
        int a = 10;
        // += , -=,  *=, /=
        a +=20; // a=a+20 hence the op will be 30
        System.out.println(a);
        int b=10;
        b -= 20;
        System.out.println(b); //a=a-20
        int c=20;
        c *=10;
        System.out.println(c);
        int d=40;
        d /= 20;
        System.out.println(d);

    }
}
