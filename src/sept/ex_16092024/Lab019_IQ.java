package ex_16092024;

public class Lab019_IQ {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        String Fname = "Kavita" ;
        String Lname = "Bane" ;

        //If String is before the arithmetic operation then it will concatenate the string with the operands given.won't perform the arithmetic operation
        System.out.println(Fname + Lname + a+b);  // O/p = KavitaBane1010
        //IF arithmetic operation is given before the string then it will first perform the arithmetic operation and the will concatenate the string with it
        System.out.println(a+b + Fname + Lname); // O/p = 20KavitaBane
        System.out.println(Fname + Lname + (a+b)); // KavitaBane20
    }
}
