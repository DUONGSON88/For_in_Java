import java.util.Scanner;

public class TH_Lai_Cho_Vay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bạn hãy nhập số tiền muốn gửi tiết kiệm đơn vị VND :");
        int monney = input.nextInt();
        System.out.println("Bạn hãy nhập số tháng muốn gửi:");
        int month = input.nextInt();
        if (month < 1) {
            System.out.println("Bạn hãy nhập đúng số tháng (vui lòng quý khách gửi lãi thời hạn ít nhất 1 tháng )!");
        } else if (month <= 3) {
            double interestRate = 0.3;
            double interest = monney * interestRate * month;
            System.out.println("Lãi bạn sau " + month + " tháng là " + interest);
        } else if ( month <= 6) {
            double interestRate = 0.5;
            double interest = monney * interestRate * month;
            System.out.println("Lãi bạn sau " + month + " tháng là " + interest);
        } else if ( month < 12) {
            double interestRate = 0.7;
            double interest = monney * interestRate * month;
            System.out.println("Lãi bạn sau " + month + " tháng là " + interest);
        } else {
            double interestRate = 0.9;
            double interest = monney * interestRate * month;
            System.out.println("Lãi bạn sau " + month + " tháng là " + interest);
        }

    }

}
