package algorithm;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int start = scan.nextInt();
        int end = scan.nextInt();

        gugudan(start, end);
    }

    static void gugudan(int start, int end) {
        for (int i=start;i<=end;i++) {
            for (int j=1;j<=9;j++ ) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
            System.out.println("------------------");
        }
    }
}