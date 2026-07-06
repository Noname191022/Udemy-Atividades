import java.util.Scanner;
public class Atividade4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
System.out.println("Digite o numero desejado: ");
int numero = scan.nextInt();
if (numero>0){
    System.out.println("O número é positivo.");
} else {
    System.out.println("O numero é Negativo.");
}
    }
}