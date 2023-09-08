import java.util.Scanner;

public class TH_Uoc_Max {
    public static void main(String[] args) {
        int x, y;

        Scanner input = new Scanner(System.in);
        System.out.println("number 1 :");
        x = input.nextInt();
        System.out.println("number 2 :");
        y = input.nextInt();
        x = Math.abs(x);
        y = Math.abs(y);
        if (x == 0 || y == 0) {
            System.out.println("Không tìm ra ước chung lớn nhất!");
        }

        while (x != y) {
            if (x > y) {
                x = x - y;
            } else {
                y = y - x;
            }

        }
        System.out.println("Ước chung lớn nhất của 2 số là  " + x);

    }
}

