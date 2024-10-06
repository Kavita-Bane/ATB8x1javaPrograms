package ex_23092024;

public class Task1_Calculator_23rdSept {
    public static void main(String[] args) {
        //Create a simple calculator that performs addition, subtraction, multiplication, and division, modus based on user input using switch statements.
        //Inputs :   num 1, num 2, +
        //Output :  num1+num2 → print information.

        int num1 = 10;
        int num2 = 20;
        int ch = '*' ;
        switch(ch) {
            case '+' :
                System.out.println("Addition :" +(num1+num2));
                break;
            case '-' :
                System.out.println("Subtraction :" +(num1-num2));
                break;
            case '*' :
                System.out.println("Multiplication :" +(num1*num2));
                break;
            case '/' :
                System.out.println("Division :" +(num1/num2));
                break;
            case '%' :
                System.out.println("Modulus :" +(num1%num2));
                break;
            default:
                System.out.println("Default");
                break;
        }
    }
}
