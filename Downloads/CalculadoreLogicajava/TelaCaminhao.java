import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
// dois imports adicionados:
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCaminhao extends JFrame {

  private JTextField txtComprimento;
  private JTextField txtLargura;
  private JTextField txtAltura;
  private JTextField txtOrcamento; //Cálculo inverso
  
  private JLabel lblResultadoVolume;
  private JLabel lblResultadoPreco;

  public TelaCaminhao() {
    setTitle("Calculadora de Carga de Areia");
    setSize(500, 550);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setLayout(new GridLayout(11, 2, 10, 10));
    getRootPane().setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

    //Cor de fundo
    Color corFundo = new Color(255, 230, 240);
    getContentPane().setBackground(corFundo);
    getRootPane().setBackground(corFundo);

    //Cor destaque
    Color corDestaque = new Color(200, 0, 100);
    Font fonteNegrito = new Font("Arial", Font.BOLD, 14);

     // Componentes de divisão e título
    JLabel tituloDimensoes = new JLabel("--- 📐 DIMENSÕES DO BAÚ ---");
    tituloDimensoes.setFont(fonteNegrito);
    tituloDimensoes.setForeground(corDestaque);
    add(tituloDimensoes);
    add(new JLabel(""));

     // Seção de Dimensões (Entrada de largura, comprimento e altura)
    add(new JLabel("Comprimento (m):"));
    txtComprimento = new JTextField();
    txtComprimento.setBorder(new EmptyBorder(5, 5, 5, 5));
    add(txtComprimento);

    add(new JLabel("Largura (m):"));
    txtLargura = new JTextField();
    txtLargura.setBorder(new EmptyBorder(5, 5, 5, 5));
    add(txtLargura);

    add(new JLabel("Altura (m):"));
    txtAltura = new JTextField();
    txtAltura.setBorder(new EmptyBorder(5, 5, 5, 5));
    add(txtAltura);

    //Seção de orçamento
    add(new JLabel("--- ORÇAMENTO ---"));
    add(new JLabel(""));

    add(new JLabel("Valor disponível (R$):"));
    txtOrcamento = new JTextField();
    add(txtOrcamento);

    //Seção de resultados (saídas do volume e preço)
    add(new JLabel("--- RESULTADOS ---"));
    add(new JLabel(""));

    lblResultadoVolume = new JLabel("Volume Total: 0.00 m³");
    lblResultadoVolume.setFont(new Font("Arial", Font.BOLD, 16));
    lblResultadoVolume.setForeground(corDestaque);
    add(lblResultadoVolume);

    lblResultadoPreco = new JLabel("Preço Total: R$ 0.00");
    lblResultadoPreco.setFont(new Font("Arial", Font.BOLD, 16));
    lblResultadoPreco.setForeground(corDestaque);
    add(lblResultadoPreco);

  // Botão Principal
    JButton btnCalcular = new JButton("Calcular Total");
    btnCalcular.setBackground(corDestaque);
    btnCalcular.setForeground(Color.WHITE);
    btnCalcular.setFont(fonteNegrito);
    add(btnCalcular); // Adiciona na tela  }

    // Botão Secundário (Orçamento)
    JButton btnOrcamento = new JButton("Verificar Orçamento");
    btnOrcamento.setBackground(new Color(0, 100, 200)); 
    btnOrcamento.setForeground(Color.WHITE);
    btnOrcamento.setFont(fonteNegrito);
    add(btnOrcamento); // Adiciona na tela

    btnCalcular.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                // 1. Pega os dados da tela (Pessoa 2)
                double comp = Double.parseDouble(txtComprimento.getText().replace(",", "."));
                double larg = Double.parseDouble(txtLargura.getText().replace(",", "."));
                double alt = Double.parseDouble(txtAltura.getText().replace(",", "."));

                // 2. Manda para a matemática (Pessoa 3)
                double volume = comp * larg * alt;
                double preco = volume * 53.39; // Preço fixo da lógica recebida

                // 3. Devolve para a tela
                lblResultadoVolume.setText(String.format("Volume Total: %.2f m³", volume));
                lblResultadoPreco.setText(String.format("Preço Total: R$ %.2f", preco));
              } catch (NumberFormatException erro) {
                // 4. Trata erros
                JOptionPane.showMessageDialog(null, "Por favor, digite apenas números válidos.");
            }
        }
    });

  public static void main(String[] args) {
      SwingUtilities.invokeLater(() -> {
        TelaCaminhao tela = new TelaCaminhao();
        tela.setVisible(true);
      });
  }
  
}
