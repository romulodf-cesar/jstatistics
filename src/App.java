import javax.swing.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aula3- Switch e Loops");
        //O switch é uma estrutura de seleção múltipla
        //Um if mais organizado
        //Escolha
           //Caso
        //Para resolver listas ou constantes.
           //Menu 
              //opcao1
              //opcao2
        int op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção: \n1-Estatística Descritiva \n2-Probabilidade \n3-Modelos probabilísticos \n 4-Sair"));
        // !=  diferente
        if(op!= 4){
            switch(op){
                case 1:
                JOptionPane.showMessageDialog(null,
                 "Estatística Descritiva");break;
                case 2:
                JOptionPane.showMessageDialog(null,
                 "Probabilidade");break;
                case 3:
                 JOptionPane.showMessageDialog(null,
                  "Modelos Probabilisticos");break;
    
                default:
                JOptionPane.showMessageDialog(null,
                "Opção Inválida!");break;
            }

        }else{
            JOptionPane.showMessageDialog(null, "Encerrando sistema...");

        }


        /* Como funciona os loops */
        // while -teste no inicio
        // for - while compacto
        // do while - teste no final
        /*
         * contador  = 1
         * condição <=5 
         * incremento/decremento  i=i+1
         */
        int contador = 1;
        while(contador<3){
           JOptionPane.showMessageDialog(null,"Viva o SENAI!!!");
           contador = contador+1;          
        }
        int i = 1;
        while(i<=5){
            System.out.println(i);
            i++;
        }
        for(int cont=1;cont<=10;cont++){
            System.out.println(cont);
        }
        String sair;
        do{
           //System.out.println("sair:s ou n");
           sair = JOptionPane.showInputDialog("Digite s-sim e n-não");

        }while(!sair.equalsIgnoreCase("sim")); 



      
    }

    /*Desafio
     * 
     * Ajustar os bugs lógicos do código menu estatístico
     * 
     * Crie um loop (do while)
     * Para deixar o menu com opções do usuário escolher
     * uma nova opção ou sair
     * O usuário que vai decidir a hora de sair.  
     */
}
