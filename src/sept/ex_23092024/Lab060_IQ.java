package ex_23092024;

public class Lab060_IQ {
    public static void main(String[] args) {
        char ch = 'A';
        switch (ch){
            case 65 :
                System.out.println("A =" +"65");
                break;
            // case 'A' :   //Duplicate case label as ch A automatically converted into int so A =65
              //  System.out.println("A");
               // break;
            default:
                System.out.println("Default");
                break;
        }
    }
}
