import java.util.Scanner;
public class Atividade6 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite se o numero é multiplo de outro:");
        System.out.println("Digite o primeiro numero:");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo numero:");
        int num2 = scan.nextInt();
        if (num2 % num1 == 0 || num1 % num2 == 0) {
            System.out.println("O segundo numero é multiplo do primeiro.");
        } else {
            System.out.println("O segundo numero não é multiplo do primeiro.");
        }
        scan.close();
    }
}
