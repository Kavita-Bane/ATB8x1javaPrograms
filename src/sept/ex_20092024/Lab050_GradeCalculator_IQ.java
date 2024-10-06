package ex_20092024;

public class Lab050_GradeCalculator_IQ {
    public static void main(String[] args) {
        //Grade Calculator
        //Write a program that calculates & displays the letter grade for a given numerical score
        // e.g A,B,C,D or E based on following grading scale:
        /* A : 90-100
           B : 80-89
           C : 70-79
           D : 60-69
           E : 0-59
         */
        //1.find user inputs
        //Score > int score = 89
        //return->data type -grade ->char
        //Basic logic
        //if (score>90 && score <=100) ->A
        //if (score>80 && score <=89) ->B
        int score = 90;
        char grade = 0;

        if(score>=90 && score<=100){
            grade = 'A';
        } else if (score>=80 && score<=89) {
            grade = 'B';
        } else if (score>=70 && score<=79) {
            grade = 'C';
        } else if (score>=60 && score<=69) {
            grade = 'D';
        }else if(score>=35 && score<=59){
            grade = 'E';
        } else if (score<=0 && score >100) {
            System.out.println("Lol !! , are you god");
        } else {
            grade = 'F' ;
        }
        System.out.println("Your grade is :" +grade);

    }
}
