import java.util.Scanner;
public class Atividade2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite os dois valores a serem somados\n");
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();

        int soma = numero2 + numero1;
        System.out.printf("A Soma dos valores é: %d", soma);
        scan.close();
    }
}