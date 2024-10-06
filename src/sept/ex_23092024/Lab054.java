package ex_23092024;

public class Lab054 {
    public static void main(String[] args) {
        int itemcode = 006;
        switch (itemcode){
            case 001 , 002, 003 :
                System.out.println("All of them are electronic gadget");
                break;
            case 004 , 005 , 006 :
                System.out.println("This is mech");
                System.out.println("Mech students");
                System.out.println("Mechanical Engineers");
                break;
            default:
                System.out.println("None of the above");

                //output= This is mech
        }
    }
}
