import javax.swing.*;
import java.awt.*;
import java.io.InputStream;
import javax.imageio.ImageIO;

public class AloJardim {
    public static void main(String[] args) {
        try {
            // Obtém o InputStream da imagem dentro do jar (caminho relativo)
            InputStream inputStream = AloJardim.class.getResourceAsStream("/imagens/joptionpane.png");

            if (inputStream == null) {
                System.err.println("Erro: A imagem não foi encontrada.");
                return;
            }

            // Lê a imagem do InputStream
            Image imagem = ImageIO.read(inputStream);

            if (imagem == null) {
                System.err.println("Erro: A imagem não pôde ser lida.");
                return;
            }

            // Redimensiona a imagem (opcional)
            Image imagemReduzida = imagem.getScaledInstance(400, 300, Image.SCALE_SMOOTH);

            // Cria o ImageIcon com a imagem redimensionada
            ImageIcon icone = new ImageIcon(imagemReduzida);

            // Mostra a imagem no JOptionPane
            JOptionPane.showMessageDialog(null, "", "Jardim", JOptionPane.PLAIN_MESSAGE, icone);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
