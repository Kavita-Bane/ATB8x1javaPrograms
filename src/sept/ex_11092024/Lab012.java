package ex_11092024;

import java.net.SocketOption;

public class Lab012 {
    public static void main(String[] args) {
        //Primitive Data Types
        //datatype variable_name = variable_value;
        //Datatypes
        //Boolean type
        //Numerical type
        //Integral type - byte,int,short,log,char
        //Difference is based on the size = how much they can store
byte b = 127; //8 bits,1Byte
short s = 128; //16 bits , 2Byte
        int i = 1000; //32 bits , 4Byte
        long phoneno = 9876098790l; //64 bits , 8Byte
        char grade = 'A'; // 'A' ,'B','C','D' ->ASCII value - int assigned
        // 16 bits, 2Byte
        float f = 3.14f; // 32bits , 4Byte
        double d = 676543566; // 64 bits, 8Byte
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(phoneno);
        System.out.println(grade);
        System.out.println(f);
        System.out.println(d);
long distance_between_earth_and_moon = 3844000001l;
        System.out.println(distance_between_earth_and_moon);

        //Non Primitive data types
        String name = "Kavita" ; //Bunch of characters or collection of characters
        System.out.println(name);

        byte age = 122;
        int age1 = 100; //wasting memory

    }
}
