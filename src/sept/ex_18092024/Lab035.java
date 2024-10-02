package ex_18092024;

public class Lab035 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Valu of a=" +(a++ + a)); // a++ =10 + 11 = 21
        int b = 10;
        System.out.println("Value of b=" +(b++ + ++b));
        //b++ =10  ,after this the value ob b =11
        // ++b = 11+1 = 22

        int c=10;
        System.out.println("Value of c=" +(++c + ++c));// 11+12 =23
        System.out.println(c);
        //++c = 11
        //++c = 12

        int d=10;
        System.out.println("Value of d =" +(++d + d++ + d++)); // 11+11+12 =34
        System.out.println(d);
        //++d = 11
        //d++ = print 11 and then increment 12
        //d++ = print 12 and the increment 13
        //d= 13
    }
}
