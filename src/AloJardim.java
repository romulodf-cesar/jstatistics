import javax.swing.*;
import java.awt.*;
import java.io.InputStream;
import javax.imageio.ImageIO;

public class AloJardim {
    public static void main(String[] args) {
        try {
            // Obtém o InputStream da imagem dentro do jar (caminho relativo)
            InputStream inputStream = AloJardim.class.getResourceAsStream("/imagens/logo.png");

            // Lê a imagem do InputStream
            Image imagem = ImageIO.read(inputStream);
         

            // Redimensiona a imagem (opcional)
            Image imagemReduzida = imagem.getScaledInstance(350, 350, Image.SCALE_SMOOTH);

            // Cria o ImageIcon com a imagem redimensionada
            ImageIcon icone = new ImageIcon(imagemReduzida);

            // Mostra a imagem no JOptionPane
            JOptionPane.showMessageDialog(null, "", "JKalango - Framework Educacional",JOptionPane.PLAIN_MESSAGE,icone);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
