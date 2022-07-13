import java.util.Scanner;
public class atv4p33 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Float Salario;
        float Hora;
        System.out.println(" Digite a quantidade de horas trabalhadas: ");
        Hora = ler.nextInt();
        Salario = (10.25f * Hora);
        System.out.println("O valor do salario é: " + Salario);
        }
    }