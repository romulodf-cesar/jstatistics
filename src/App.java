import java.util.Random;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Sozinhos\r\n" + //
                        "Faça como eu fiz\r\n" + //
                        "\r\n" + //
                        "Criar um jogo de lançar dados similar ao jogo do cara ou cora.\r\n" + //
                        "=============================================================\r\n" + //
                        "Estudar , pesquisar e escolher um dos métodos estatísticos\r\n" + //
                        "\r\n" + //
                        "Bonus+\r\n" + //
                        "\r\n" + //
                        "-P(A) - calculo simples\r\n" + //
                        "-Teorema de Bayes. avançado");
     
        

        //Vendo a probabilidade de sair o lado 6
        double probabilidade6 = (1.0 / 6.0)*100; // Probabilidade de tirar 6 em um dado
        JOptionPane.showMessageDialog(null,"P(l) = " + probabilidade6);
       
        //176 - quantidade de vezes que jogou
        //múltiplas jogadas
        // 6

        //qual a possibilidade de sair um par
        //1 2 3 4 5 6 {2,4,6}
        double probabilidadePar = (3.0 / 6.0)*100; // Probabilidade de tirar 6 em um dado
        JOptionPane.showMessageDialog(null,"P(par/impar) = " + probabilidadePar);
        //1 2 3 4 5 6 -- QUal a probabilidade de sair um número maior que 4?
        double probabilidadeMaior4 = (2 / 6.0)*100; // Probabilidade de tirar 6 em um dado
        JOptionPane.showMessageDialog(null,"P(acima de 4) = " + probabilidadeMaior4);
       
        //Lançando dados
        Random random = new Random();
        int dado = random.nextInt(6) + 1; // Simula um dado de  naturalmente
        System.out.println("Resultado do dado: " + dado);
        JOptionPane.showMessageDialog(null, "Resultado do dado"+dado);
        // de sair 6 
        // manter esse equilibro
        // de NÃO 6
    }
}
