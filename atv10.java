package exemploComandoNovo;
import javax.swing.JOptionPane;
public class atv10 {
  public static void main(String[] args) {
    String dia = JOptionPane.showMessageDialog(null,"digite numero entre 1 a 7: ");
    
    if (dia!= null) {
        try{
           int diasemana = Integer.parseInt(dia);
           if (diasemana == 1) 
               dia = "Domingo";
               else if (diasemana == 2)
               dia = "Segunda";
               else if (diasemana == 3)
               dia = "Terça";
               else if (diasemana == 4)
               dia = "Quarta";
               else if (diasemana == 5)
               dia = "Quinta";
               else if (diasemana == 6)
               dia = "Sexta";
               else if (diasemana == 7)
               dia = "Sabado";
               else 

               dia = "Desconheço my brother";
               JOptionPane.showMessageDialog(null,dia);

               
           }

           catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null,"formato invalidow");
           }
        }
    } 

}
