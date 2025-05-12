import javax.swing.*;

public class App {
    public static void main(String[] args) {
        // Mensagem inicial para o usuário
        JOptionPane.showMessageDialog(null, "Vamos calcular a área do seu jardim", "Área do seu jardim", JOptionPane.INFORMATION_MESSAGE);
        
        // Coleta as dimensões do jardim
        double largura = 0;
        double comprimento = 0;
        
        // Usando try-catch para garantir que os valores inseridos sejam válidos
        try {
            largura = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a largura do seu jardim:", "Área do seu jardim", JOptionPane.INFORMATION_MESSAGE));
            comprimento = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o comprimento do seu jardim:", "Área do seu jardim", JOptionPane.INFORMATION_MESSAGE));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira números válidos para as dimensões.");
            return; // Encerra o programa se houver erro
        }

        // Calcula a área do jardim
        double area = largura * comprimento;

        // Exibe a área calculada
        JOptionPane.showMessageDialog(null, "A área do seu jardim é: " + area + " metros quadrados.");
    }
}