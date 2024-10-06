package ex_23092024;

public class Lab053_SwitchStmt {
    public static void main(String[] args) {
        String browser = "Chrome" ;
        switch (browser){
            case "Chrome" :
                System.out.println("Execute chrome code");
                break;
            case "edge" :
                System.out.println("Execute edge code");
                break;
            case "ie" :
                System.out.println("Execute ie code");
                break;
            default:
                System.out.println("Wrong choice");
        }
    }

}
