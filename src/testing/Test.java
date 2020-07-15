package testing;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int currentNum = 100, finish = 999, arm;
        System.out.println("Armstrong numbers between " + currentNum + " and " + finish);
        while (currentNum <= finish) {
            arm = isArmstrong(currentNum);
            if (arm == currentNum) {
                System.out.println(currentNum);
            }
            currentNum++;
        }
    }

    static int isArmstrong(int num) {
        int x, a = 0;
        while (num != 0) {
            x = num % 10;
            a = a + (x*x*x);
            num /= 10;
        }
        return a;
    }
}
