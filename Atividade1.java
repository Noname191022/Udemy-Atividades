import java.util.Scanner;
public class Atividade1{
    public static void main(String[] args){
        System.out.println("Digite o raio do circulo:\n");
        Scanner scan = new Scanner(System.in);
        float raio = scan.nextFloat();
        double pi = 3.14159;
        double result = pi * raio * raio;
System.out.printf("Resultado: %f", result);
scan.close();
    }
}