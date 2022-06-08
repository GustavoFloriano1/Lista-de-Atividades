package exer2;
import java.util.Scanner;
public class exer2 {
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
        float h, b, B, a;

        System.out.println("Digite valor da altura do trapézio: ");
        h = ler.nextInt();
        System.out.println("Digite o valor da base menor: ");
        b = ler.nextInt();
        System.out.println("Digite o valor da base maior: ");
        B = ler.nextInt();

        a = (h * (b + B)) / 2;
            
        System.out.println("A área do trapézio exata é de: " + a + " cm²");
        System.out.println("A área do trapézio arredondada é de: " + Math.round(a) + " cm²");
   
    }
    
}
