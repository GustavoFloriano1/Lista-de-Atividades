import java.util.Scanner;
public class atv5p33 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Float Salario;
        float Horas;
        System.out.println(" Digite a quantidade de horas trabalhadas: ");
        Horas = ler.nextInt();
        Salario = (10.25f * Horas);
        System.out.println("O valor do salario é: " + Salario);
        if (Salario < 50f) 
        {
            System.out.println("Atenção, dirija-se à direção do Hotel!");
        }
        }
    }
