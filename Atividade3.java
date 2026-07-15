import java.util.Scanner;
public class Atividade3 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite os quatro valores desejados:");
        int var1 = scan.nextByte();
        int var2 = scan.nextByte();
        int var3 = scan.nextByte();
        int var4 = scan.nextByte();
        int result = (var1 * var2 - var3 * var4);

        System.out.printf("Diferença: %d", result);
        scan.close();
    }
}
