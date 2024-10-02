package ex_18092024;

public class Lab038_Task4_18thSept {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a-- + a-- + a--);//10+9+8 =27
        System.out.println(a);//a=7
        //a-- =print 10 then decrement by 1 so a=9
        //a-- =print 9 and then decrement by 1 so a=8
        //a-- print 8 and then decrement by 1 so a=7
    }
}
