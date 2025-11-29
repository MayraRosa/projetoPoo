import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class telaCaminhao extends JFrame {

   public telaCaminhao() {
     setTitle("Tela Caminhão");
     setSize(400, 300);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setLocationRelativeTo(null);
   }
  

  public static void main(String[] args) {
      SwingUtilities.invokeLater(() -> {
        telaCaminhao tela = new telaCaminhao();
        tela.setVisible(true);
      });
  }
  
}
