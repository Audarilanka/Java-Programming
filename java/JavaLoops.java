package java;

import java.util.*;


public class JavaLoops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        for (int i = 1; i < 11; i++) {
            int y = n * i;
            System.out.println(n + " x " + i + " = " + y);
        }
    }
}
