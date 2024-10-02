package ex_16092024;

public class Lab028_Task16Sept {
    public static void main(String[] args) {
         /*
        1.Difference between = and  ==?
           Answer: = assigns value to the variable whereas == compares two values

        2.byte b = 10; long l = 10l; → How much Byte will be used.
        Answer: For byte b=10----1byte and for long l=10l---8bytes
        So total 9bytes will be used

        3.Another byte b = 10; byte c = 10;  What is the answer if the perform b+c, What is the data type it will give in result.
          Answer: byte+byte= int

 */
        short s = 10;
        char c = 'A';
        int ss = s+c ;
        System.out.println(ss); //op= 75
    }
}
