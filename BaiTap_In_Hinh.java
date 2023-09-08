import java.util.Scanner;

public class BaiTap_In_Hinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != -0) {
            System.out.println("Menu:");
            System.out.println("1.In hinh Cn");
            System.out.println("2.In hinh tam giac");
            System.out.println("3.In hinh tam giac nguoc");
            System.out.println("4.Exit");
            System.out.println("Enter choice:");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1.In hinh Cn");
                    int chieudai = 3;
                    int chieurong = 7;
                    for (int i = 1; i <= chieudai; i++) {
                        for (int j = 0; j <= chieurong; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    int cao = 5;
                    System.out.println("2.In hinh tam giac");
                    for (int i = 1; i <= cao; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    int nguoc = 5;
                    System.out.println("3.In hinh tam giac nguoc");
                    for (int i = nguoc; i > 0; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
