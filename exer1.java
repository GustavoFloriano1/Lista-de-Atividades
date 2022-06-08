package exercicio1;
import java.util.Scanner;
public class exer1 {

    public static void main(String[] args) {
    float resto,despe,salideal,sal,alu,trans,alim,agua,luz,medico,remedio,gas,inte;
    Scanner i= new Scanner(System.in);
    System.out.println("Digite o seu salário: ");
    sal = i.nextFloat();
    System.out.println("Digite o valor do aluguel: ");
    alu = i.nextFloat();
    System.out.println("Digite o valor do transporte: ");
    trans = i.nextFloat();
    System.out.println("Digite o valor dos alimentos: ");
    alim = i.nextFloat();
    System.out.println("Digite o valor da água: ");
    agua = i.nextFloat();   
    System.out.println("Digite o valor da energia: ");
    luz = i.nextFloat();
    System.out.println("Digite o valor das despezas médicas: ");
    medico = i.nextFloat();
    System.out.println("Digite o valor do gás: ");
    gas = i.nextFloat();
    System.out.println("Digite o valor da internet: ");
    inte = i.nextFloat();
    System.out.println("Digite o valor do remédio: ");
    remedio = i.nextFloat();
   
    salideal = (sal*2f);
    
    despe = (alu+trans+alim+agua+luz+medico+gas+inte+remedio);

    resto = (salideal-despe); 

    System.out.println("Sobrou para voce: R$"+resto);
    }
}