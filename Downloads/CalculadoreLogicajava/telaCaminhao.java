import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class telaCaminhao extends JFrame {

  private JTextField txtComprimento;
  private JTextField txtLargura;
  private JTextField txtAltura;
  private JTextField xtxOrcamento;
  
  private JLabel lblResultadoVolume;
  private JLabel lblResultadoPreco;

   public telaCaminhao() {
     setTitle("Tela Caminhão");
     setSize(400, 300);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setLocationRelativeTo(null);

     // Componentes de divisão e título
     add(new JLabel("--- DIMENSÕES DO BAÚ ---"));
     add(new JLabel(""));
   }
  

  public static void main(String[] args) {
      SwingUtilities.invokeLater(() -> {
        telaCaminhao tela = new telaCaminhao();
        tela.setVisible(true);
      });
  }
  
}
