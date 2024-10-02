package ex_18092024;

public class Lab031_TypeCastingExample {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
        //int total_price = course + GST; //Implicit Narrowing - JVM // Invalid
        float total_price = course + GST ; // Implicit Widening
        System.out.println(total_price);
        int price = course + (int)GST; // Explicit Narrowing - Loss of data
        System.out.println(price);
    }
}
