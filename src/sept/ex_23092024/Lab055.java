package ex_23092024;

public class Lab055 {
    public static void main(String[] args) {
        int code = 001 ;  // JDK > 13 , arrow is used along with case
        switch (code) {
            case 001 -> System.out.println("Laptop");
            case 002 -> System.out.println("Desktop");
            case 003 , 004 -> System.out.println("Mobile");
            default -> System.out.println("Hello");
            //Output -> Laptop
        }
    }
}
