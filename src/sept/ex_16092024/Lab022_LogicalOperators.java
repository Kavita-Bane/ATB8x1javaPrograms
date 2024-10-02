package ex_16092024;

public class Lab022_LogicalOperators {
    public static void main(String[] args) {
        // Logical Operators ->  && , ! , ||
        boolean a = true ;
        boolean b = true ;
        // Logical AND operator &&
        System.out.println("----Logical AND Operator---");
        boolean c = true &&  false ; //Op= false
        boolean d = true && true ; //Op= true
        boolean e = false && true ;//Op= false
        boolean f = false && false ; //Op= false
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

//Logical OR Operator ||
        System.out.println("----Logical OR Operator----");
        boolean g = true || false ; //OP = true
        boolean h = true || true ; //Op = true
        boolean i = false || false ; //Op = false
        boolean j = false || true ; //Op = true
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
// Not Operator !
        System.out.println("----Not Operator----");
        System.out.println(!true);
        System.out.println(!false);



    }
}
