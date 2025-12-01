import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class telaCaminhao extends JFrame {

  private JTextField txtComprimento;
  private JTextField txtLargura;
  private JTextField txtAltura;
  private JTextField xtxOrcamento; //Cálculo inverso
  
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

     // Seção de Dimensões (Entrada de largura, comprimento e altura)
     add(new JLabel("Comprimento (m):"));
     txtComprimento = new JTextField();
     add(txtComprimento);

     add(new JLabel("Largura (m):"));
     txtLargura = new JTextField();
     add(txtLargura);

     add(new JLabel("Altura (m):"));
     txtAltura = new JTextField();
     add(txtAltura);

    //Seção de orçamento
    add(new JLabel("--- CÁLCULO POR ORÇAMENTO ---"));
    add(new JLabel(""));
    add(new JLabel("Valor disponível (R$):"));
    txtOrcamento = new JTextField();
    add(txtOrcamento);
   }
  

  public static void main(String[] args) {
      SwingUtilities.invokeLater(() -> {
        telaCaminhao tela = new telaCaminhao();
        tela.setVisible(true);
      });
  }
  
}
