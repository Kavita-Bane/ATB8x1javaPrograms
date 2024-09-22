package ex_13092024;

public class Lab007 {
    public static void main(String[] args) {
    //Literal type= char
    //Single char literal
    char c1 = 'A';  // ASCII value of A is 65
    char c2 = 'B';
    char c3 = '@';

    //Escape char
    char new_line = '\n'; //New line
    char tab = '\t'; //for tab
    char back_space = '\b';  //backspace
    char car_r = '\r';
   System.out.println("Kavita" + new_line + "Bane");
    System.out.println("Kavita" + tab + "Bane");
    System.out.println("Kavita" + back_space + "Bane");
    System.out.println("Kavita" + car_r + "Bane"); //Delete first word
System.out.println("----Without Declaring Variable----");
    //Without declaring variable
        System.out.println("Priyansh" + '\n' + "Bane");
        System.out.println("Priyansh" + '\t' + "Bane");
        System.out.println("Priyansh" + '\b' + "Bane");
        System.out.println("Priyansh" + '\r' + "Bane");
    }

}
