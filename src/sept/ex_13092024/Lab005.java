package ex_13092024;

public class Lab005 {
    public static void main(String[] args){
        //Literals
        //first type is boolean, values are true or false
        boolean is_clever = true;
        boolean is_clever_raj = false;
        System.out.println(is_clever);
        System.out.println(is_clever_raj);

//Literal integral type - decimal system
        int num=2;
        System.out.printf("Value of %d",num);
        System.out.println();
        System.out.printf("%d * %d = %d",num,1,num*1);
        System.out.println();
        System.out.printf("%d * %d = %d",num,2,num*2);
        System.out.println();
        int binary_num = 0b1010 ; //10 in decimal //Binary literal
        System.out.println(binary_num);
        //Literal type= Octal so base is 8
        int octal = 0101; //Formula= (0*8^3)+(1*8^2)+(0*8^1)+(1*8^0) = 65
        System.out.println(octal);
int hex = 0Xface; //Literal type= hexadecimal ,base=16
        //color combination in hexadecimal no
        System.out.println(hex);




    }
}
