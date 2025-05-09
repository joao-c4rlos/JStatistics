import javax.swing.JOptionPane;

public class App {
        public static void main(String[] args) throws Exception {
                JOptionPane.showMessageDialog(null, "Alo, ajrdim!");
                String nome = JOptionPane.showInputDialog(null, "Digite o seu nome:", "Cadastro",
                                JOptionPane.INFORMATION_MESSAGE);
                String endereço = JOptionPane.showInputDialog(null, "Digite o seu endereço:", "Cadastro",
                                JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, nome + endereço, "seu cadastro", JOptionPane.INFORMATION_MESSAGE);
        }
}