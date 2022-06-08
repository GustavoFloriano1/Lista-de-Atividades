package exercicio2;
import java.util.Scanner;
//linha do public class é o método principal 
public class exer2 {
    public static void main(String[] args) {
        float h,b,b2,a;
        Scanner exer2= new Scanner(System.in); 
        System.out.println("Digite altura do trapézio:");
        h = exer2.nextInt(); 

        System.out.println("Digite base menor do trapézio:");
        b = exer2.nextInt(); 

        System.out.println("Digite base maior do trapézio:");
        b2 = exer2.nextInt(); 

        a= (h*(b+b2))/2f;


        System.out.println("A área do trapézio é de: " + a);




    }
    
}
