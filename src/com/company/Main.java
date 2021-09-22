package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Find total marks
        System.out.println("What are the total marks?");
        float maxMarks = input.nextFloat();

        //Find student marks
        System.out.println("What marks did the student get?");
        float stuMarks = input.nextFloat();

        //Divide them and multiply by 100 for a percentage
        float stuPercent = ((stuMarks / maxMarks))*100;
        System.out.println("The student got "+stuPercent+"%.");


        //Clarify what each percentage means as a result
        if((stuPercent >= 80)&&(stuPercent <= 100)){
            System.out.println("The student got an A!");
        }

        if((stuPercent < 80)&&(stuPercent >= 70)){
            System.out.println("The student got a B!");
        }

        if((stuPercent < 70)&&(stuPercent >= 60)){
            System.out.println("The student got a C.");
        }

        if((stuPercent < 60)&&(stuPercent >= 50)){
            System.out.println("The student got a D.");
        }

        if((stuPercent < 50)&&(stuPercent >= 40)){
            System.out.println("The student got an E.");
        }

        if((stuPercent < 40)&&(stuPercent >= 0)){
            System.out.println("The student got a U.");
        }

        if((stuPercent < 0)||(stuPercent > 100)){
            System.out.println("Invalid results - please try again.");
        }

    }
}
