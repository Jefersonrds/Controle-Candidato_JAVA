import java.util.InputMismatchException;
import java.util.Scanner;

public class ControleCandidatos {

    public static void main(String[] args) {
        double salarioBase = 2000.0;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Para iniciarmos, favor informar a pretencao salarial:");
            double salarioPretendido = sc.nextDouble();

            
        }catch (InputMismatchException erro){
            System.out.println("Voce nao informou um salario numerico! Favor reenviar a pretencao salarial.");
        }

        
        
     }

     

    
}