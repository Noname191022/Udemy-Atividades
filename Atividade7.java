import java.util.Scanner;
public class Atividade7 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a hora inicial do jogo:");
        int horaInicial = scan.nextInt();
        System.out.println("Digite a hora final do jogo:");
        int horaFinal = scan.nextInt();
        int duracao;

        if (horaInicial > horaFinal) {
            duracao = (24 - horaInicial) - horaFinal;
        } else if (horaFinal > horaInicial) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24;
        }
        System.out.println("A duração do jogo foi de " + duracao + " horas.");
        scan.close();
    }
}
