import java.util.Scanner;
public class Atividade9 {
    public static void main(String[]args) {
        System.out.println("Digite o tipo de combustivel deseja: \n 1 - Alcool \n 2 - Gasolina \n 3 - Diesel \n 4 - Fim");
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        Scanner scan = new Scanner(System.in);
        int comb = scan.nextInt();
        while (comb != 4) {
            switch (comb) {
                case 1:
                    System.out.println("Alcool");
                    alcool += 1;
                    break;
                case 2:
                    System.out.println("Gasolina");
                    gasolina += 1;
                    break;
                case 3:
                    System.out.println("Diesel");
                    diesel += 1;
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
            System.out.println("Digite o tipo de combustivel deseja: \n 1 - Alcool \n 2 - Gasolina \n 3 - Diesel \n 4 - Fim");
            comb = scan.nextInt();
        }
        System.out.println("Obrigado!");
        System.out.println("Alccol:" + alcool );
        System.out.println("Gasolina:" + gasolina );
        System.out.println("Diesel:" + diesel );
        scan.close();
    }
}
