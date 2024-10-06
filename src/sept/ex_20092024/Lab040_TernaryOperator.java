package ex_20092024;

public class Lab040_TernaryOperator {
    public static void main(String[] args) {
        // (condition) ? expression_if_true : expression_if_false
        int a1 = (30>40) ? 10:20;
        System.out.println(a1);  // a1 =20
        int tushar = 4 ;
        int prabhu = 7 ;
        String result = tushar > prabhu ? "tushar won" : "prabhu won";
        System.out.println(result);  //prabhu won

        String str =  10 > 20 ? "10" : "Twenty" ;
        System.out.println(str); // str = Twenty

    }
}
