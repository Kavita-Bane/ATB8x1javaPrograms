package ex_18092024;

import java.net.SocketOption;

public class Lab030_TypeCasting {
    public static void main(String[] args) {
        //Typecasting
        //Widening - Implicit,Explicit - lossless
        //Narrowing - Implicit,Explicit(With data type) - loss

        //Widening - Bigger basket is used automatically. Done by JVM
        byte b = 10;
        int a = b; //Valid implicit casting - Done by JVM
        System.out.println(a);
        int a1 = (int)b; //Valid explicit - Done by JVM
        System.out.println(a1);

        //Narrowing -JVM does not allow implicit narrowing - Loss of data
        int val = 300; // int required 32-bits memory
       // byte b1 = val ; //Invalid implicit casting . byte means 8-bit memory. (JVM does not allow)
        byte b2 = (byte)val; //Invalid explicit casting (we explicitly do the narrowing so it causes data loss)
       // System.out.println(b1);
        System.out.println(b2); //So here it will take last 8-bits only of int val
//Binary conversion of decimal 300 is 100101100.So here it will take last 8-bits only i.e 00101100
        // So 00101100 -> 2^7*0+2^6*0+2^5*1+2^4*0+2^3*1+2^2*1+2^1*0+2^0*0 =0+0+32+0+8+4+0+0
        // 0+0+32+0+8+4+0+0 = 44 .So the output will be 44

        long phoneno = 9876543210l ;
        //short s = phoneno ; //Narrowing implicit - JVM // Invalid
        short s1 = (short)phoneno; //Narrowing explicit - Loss of data //Invalid
        System.out.println(s1);

    }
}
