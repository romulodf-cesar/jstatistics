import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        //Classe é um conjunto de objetos
        //Nosso objetivo nesse código é entender a diferença
        //entre método com o tipo void e método com o tipo String.
        Mamifero m1 = new Mamifero();
        m1.setNomeCientifico("Bos Taurus");
        JOptionPane.showMessageDialog(null, 
                                  "Nome Científico:"+m1.getNomeCientifico());
        //Exercício
        /*
         * Considerando a utilização de métodos set e get
         * Considerando a aula de hoje 
         * :anatômia de função/procedimento
         * diferença entre função e procedimento
         * set - void (procedimento)
         * get - String (função)
         * Java = Métodos
         *   void
         *   String , int, boolean
         * 
         * Desafio:
         * Crie mais dois objetos:
         * Para armazenar e mostrar os dados do 
         * Canguru
         * Peixe Boi
         * 
         * 
         */

    }
}
