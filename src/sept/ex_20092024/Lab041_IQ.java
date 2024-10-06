package ex_20092024;

public class Lab041_IQ {
    //Max , Min between two numbers using ternary operator
    public static void main(String[] args) {
        int tushar_salary = 4;
        int prabhu_salary = 7;
        int max = tushar_salary > prabhu_salary ? tushar_salary : prabhu_salary ;
        System.out.println( max);  //will print prabhu salary
        String min = tushar_salary < prabhu_salary ? "tushar_salary" : "prabhu_salary" ;
        System.out.println(min);

    }
}
