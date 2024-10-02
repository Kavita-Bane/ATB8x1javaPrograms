package ex_18092024;

public class Lab032_Task1_18Sept {
    public static void main(String[] args) {

        //Example of Implicit & Explicit Widening
        System.out.println("****Implicit Widening****");
        int age = 32;
        float age1 = age;
        System.out.println(age1);
        System.out.println("****Explicit Widening****");
        float profit = 30.5f;
        long total_profit = (long) profit;
        System.out.println(total_profit);
        //Example of Implicit & Explicit Narrowing
        System.out.println("****Implicit Narrowing****");

        long AadharNo = 7654321234l;
        //byte b1 = PanNo;
        System.out.println("****Explicit Narrowing****");
        short s1 = (short)AadharNo;
        System.out.println(s1);


    }
}