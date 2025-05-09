import javax.swing.*;

public class App {
        public static void main(String[] args) throws Exception {
                JOptionPane.showMessageDialog(null, "Alo, ajrdim!");
                String nome = JOptionPane.showInputDialog(null, "Digite o seu nome:", "Cadastro",
                                JOptionPane.INFORMATION_MESSAGE);
                String endereço = JOptionPane.showInputDialog(null, "Digite o seu endereço:", "Cadastro",
                                JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, nome + endereço, "seu cadastro", JOptionPane.INFORMATION_MESSAGE);

                JOptionPane.showMessageDialog(null, "Vamos calcular a área do seu jardim", "Área do seu jardim",
                                JOptionPane.INFORMATION_MESSAGE);
                double largura = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a largura do seu jardim:",
                                "Área do seu jardim", JOptionPane.INFORMATION_MESSAGE));
                double comprimento = Double
                                .parseDouble(JOptionPane.showInputDialog(null, "Insira o comprimento do seu jardim:",
                                                "Área do seu jardim", JOptionPane.INFORMATION_MESSAGE));
                // Calcular a área
                double area = largura * comprimento;
                JOptionPane.showMessageDialog(null, area);

                if (area >= 200) {
                        JOptionPane.showMessageDialog(null, "Seu jardim é grande", "Classificação do jardim",
                                        JOptionPane.INFORMATION_MESSAGE);

                } else {
                        JOptionPane.showMessageDialog(null, "Seu jardim é pequeno", "Classificação do jardim",
                                        JOptionPane.INFORMATION_MESSAGE);

                }

        }
}