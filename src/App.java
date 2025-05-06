import java.util.Random;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        //Cara ou Coroa -  probabilidade
        /*
         * 
         * O espaço amostral (geralmente representado por Ω ou S) é o conjunto de todos 
         * os resultados possíveis de um experimento aleatório.
         * Pense nele como uma lista completa de tudo 
         * que pode acontecer quando você faz algo como 
         * jogar um dado, tirar uma carta ou sortear algo.
         * 
         * 
         */
        //50% cara
        //50% coroa
        //espaço amostral
        // Variável que receba a interação do jogo
        //Random
        //Switch
        //For , do While e While
        String[] espacoAmostral = {"Cara","Coroa"};

        //objeto Random...
        //sorteio
        Random random = new Random();

        //Contadores para verificar a distribuição
        int contCara = 0;
        int contCoroa =0;
        String mensagem="Espaço amostral:{Cara,Coroa}\n"+
                        "Probabilidade de Cara: 50% \n"+
                        "Probabilidade de Coroa: 50% \n"+
                        "Deseja lançar a moeda?";
        //loop de lançamento
        while(true){
            // interação com usuário
            
            int opcao = JOptionPane.showConfirmDialog(null,mensagem,"Lançando moedas",JOptionPane.YES_NO_OPTION);
            if(opcao != JOptionPane.YES_OPTION){

                //estatísticas
                String estatisticas = "Jogo finalizado!\n"+
                "Total de lançamentos:"+(contCara+contCoroa)+"\n"+
                "Caras:"+contCara+"\n"+
                "Coroas:"+contCoroa;
                JOptionPane.showMessageDialog(null, estatisticas, "Finalizando Jogo", JOptionPane.INFORMATION_MESSAGE);  


                break;
            }
            int resultado = random.nextInt(2);//0-cara 1-coroa
            if(resultado == 0){
                contCara++;
            }else{
                contCoroa++;
            }
            String saida = "Resultado do lançamento:"+espacoAmostral[resultado]+
                           "\n(Índice gerado:"+resultado+")";
            JOptionPane.showMessageDialog(null,saida,"Resultado",JOptionPane.INFORMATION_MESSAGE); 
        
        }

    }
}
