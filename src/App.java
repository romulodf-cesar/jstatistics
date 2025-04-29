import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Aplicando Lógica de Programação (Aristoteles e George Boolean)
        
        // Variável : é um espaço reservado na memória do computador
        // Variável: serve para guardar valores
        // Variável: ela tem um tipo (texto, número, lógico ...)
        /*
         * Ex-1: crie um algoritmo para o JStatitics que leia
         * a opção desejada:
         * "Qual o conjunto de dados utilizado: 1- populacional 2-amostral"
         * O valor deve ser inteiro
         * 
         */
        /*Scanner leia = new Scanner(System.in);
        int opcao; //declarei a variável em Java.
        System.out.println("\t #------- \t #------ \t JStatistics \t #----- \t #------ \t ");
        System.out.println("Qual o conjunto de dados utilizado: 1- populacional 2-amostral");
        opcao = leia.nextInt();
        System.out.println(opcao);*/
        int opcao;
        JOptionPane.showMessageDialog(null,
                                     "O Jogo da Estatística: JStatistics");
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Vamos começar o Jogo? \n Escolha a estratégia: \n 1- Populacional \n 2-Amostral"));
        JOptionPane.showMessageDialog(null, "você escolheu: "+opcao,"JStatistics",JOptionPane.DEFAULT_OPTION);
        /*
         * 
         * Ex-2.
         * Você deve criar um menu perguntando para o  usuário:
         * Que tipo de variável ele deseja cadastrar:
         * 1-Quantitativa
         * 2-Qualitativa
         * 
         * O menu deve ter as quebras de linha conforme o texto acima.
         * Tudo deve ser feito em apenas um System.out.println()
         * Mostre a opção escolhida ( o número lido)
         * 
         */
        String opcaoVariavel = JOptionPane.showInputDialog(null,
        "Que tipo de variável ele deseja cadastrar:\n 1-Quantitativa \n 2-Qualitativa");
        int opVariavel = Integer.parseInt(opcaoVariavel);
        JOptionPane.showMessageDialog(null,"Sua escolha foi: "+opVariavel,"JStatistics",JOptionPane.INFORMATION_MESSAGE);

    }
}
