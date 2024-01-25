package leetCode;

import java.util.Scanner;

public class Find_the_Index_of_the_First_Occurrence_in_a_String {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 2 no");
        int a = 0, b = 0, c = 0;
        a = scn.nextInt();
        b = scn.nextInt();
        try {
            System.out.println("Try start");
            int no = a / b;
            System.out.println("Try end: " + no);
        } catch (ArithmeticException ex) {
            System.out.println();
        }
        System.out.println("GET Record");

    }

}
