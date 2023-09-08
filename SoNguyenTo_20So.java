import java.util.Scanner;

public class SoNguyenTo_20So {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number :");
        int number=input.nextInt();
        if (number<2 ){
            System.out.println(number + " là số nguyên tố ");
        }else {
            int i= 2 ;
            boolean check = true;
            while (i<=Math.sqrt(number)){
                if (number%i==0){
                    check=false;
                    break;
                }
                i++;
            }
            int count =0;
            if (check){
                count++;
                System.out.println(number + " là số nguyên tố ");
            }else {
                System.out.println( number + " không phải là số nguyên tố ");
            }
        }
    }
}
