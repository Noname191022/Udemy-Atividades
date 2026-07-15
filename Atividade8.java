import java.util.Scanner;
public class Atividade8 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int senha = 0;
        while (senha != 2002) {
            System.out.println("Digite a senha correta: ");
            senha = scan.nextInt();

            if (senha != 2002){
                System.out.println("Senha incorreta. Tente novamente.");
            }
        }
        System.out.println("Acesso permitido.");
        scan.close();
    }
}
