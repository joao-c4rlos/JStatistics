import javax.swing.*;

public class App {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Faça o seu cadastro", "", JOptionPane.INFORMATION_MESSAGE);
        String nome = JOptionPane.showInputDialog("Insira o seu nome:");
        String endereco = JOptionPane.showInputDialog("Insira o seu endereço:");
        String telefone = JOptionPane.showInputDialog("Digite o seu telefone:");

        JOptionPane.showMessageDialog(null,
                "Esses são os seus dados cadastrados:" + "\n" + nome + "\n" + endereco + "\n" + telefone,
                "Dados cadastrados", JOptionPane.INFORMATION_MESSAGE);

    }
}