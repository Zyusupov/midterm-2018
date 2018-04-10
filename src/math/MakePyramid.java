package math;
import java.util.Scanner;

public class MakePyramid {
    public static void main(String[] args) {

        //   Implement a large Pyramid of stars in the screen with java.
        //
        //                    *
        //                   * *
        //                  * * *
        //                 * * * *
        //                * * * * *
        //               * * * * * *

        //Start Here
        for (int i = 7, k = 0; i > 0 && k < 7; i--, k++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < k; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}