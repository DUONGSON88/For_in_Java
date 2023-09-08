import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bạn hãy nhập số cần kiểm tra có phải số nguyên tố hay không : ");
        int a =input.nextInt();
        if (a<2 ){
            System.out.println(a + " là số nguyên tố ");
        }else {
            int i= 2 ;
            boolean check = true;
            while (i<=Math.sqrt(a)){
                if (a%i==0){
                    check=false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println(a + " là số nguyên tố ");
            }else {
                System.out.println( a + " không phải là số nguyên tố ");
            }
        }
    }
}
