import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Faça o seu cadastro", "", JOptionPane.INFORMATION_MESSAGE);
        String nome = JOptionPane.showInputDialog("Insira o seu nome:");
        String endereco = JOptionPane.showInputDialog("Insira o seu endereço:");
        String telefone = JOptionPane.showInputDialog("Digite o seu telefone:");

        Cliente cliente = new Cliente(nome, endereco, telefone);

        cliente.exibir();
    }
}