import java.util.concurrent.ThreadLocalRandom;

public class ControleCandidatos {

    public static void main(String[] args) {

        // analisarCandidato(1900.0);
        // analisarCandidato(2200.0);
        // analisarCandidato(2000.0);

        selecaoCandidatos();

     }

     //Selecao de candidados com base no salrio
     static void selecaoCandidatos(){
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Agusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"};
        String [] selecionados = new String[4];

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        
        while (candidatosSelecionados < 5 && candidatoAtual<candidatos.length){

            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("O candidato %s solicitou este valor de salario: %.2f \n",candidato, salarioPretendido);
            
            //Verificar se o salario base e maior que o preendido
            if (salarioBase>salarioPretendido) {
                System.out.println("O candidato "+candidato+" foi selecionado.");
                
                //Acrescenta o candidato ao vetor selecionados
                selecionados[candidatosSelecionados] = candidato;
                candidatosSelecionados++;

            } 
            candidatoAtual++;       
        }

        //Imprimindo candidatos na tela
        System.out.println("Os candidatos selecionados foram: ");    
        for(int j=0;j<=selecionados.length;j++){
            System.out.println(selecionados[j]);
        }

     }

     static double valorPretendido (){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
     }

     static void analisarCandidato (double salarioPretendido){
        double salarioBase = 2000.0;
 
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if (salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO E OFERECER CONTRA PROPOSTA");
        }else if (salarioBase < salarioPretendido){
            System.out.println("AGUARDNADO DEMAIS CANDIDATOS");
        }


     }
     

    
}