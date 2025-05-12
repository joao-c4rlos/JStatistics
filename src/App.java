import javax.swing.JOptionPane;

public class App {
        public static void main(String[] args) throws Exception {

                int jardinsGrandes = 0;

                JOptionPane.showMessageDialog(null, "Alô Jardim!!", null, JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Insira as informações dos seus jardins a seguir", null, JOptionPane.INFORMATION_MESSAGE);
                double larguraJardim1 = Double
                                .parseDouble(JOptionPane.showInputDialog("Qual é a largura do seu jardim?"));
                double comprimentoJardim1 = Double
                                .parseDouble(JOptionPane.showInputDialog("Qual é o comprimento do seu Jardim?"));
                double areaJardim1 = larguraJardim1 * comprimentoJardim1;
                if (areaJardim1 >= 100) {
                        JOptionPane.showMessageDialog(null, "Seu jardim é grande", "Classificação do jardim",
                                        JOptionPane.INFORMATION_MESSAGE);
                                        jardinsGrandes++;

                } else {
                        JOptionPane.showMessageDialog(null, "Seu jardim é pequeno", "Classificação do jardim",
                                        JOptionPane.INFORMATION_MESSAGE);
        
                }

                double larguraJardim2 = Double
                                .parseDouble(JOptionPane.showInputDialog("Qual é a largura do seu jardim?"));
                double comprimentoJardim2 = Double
                                .parseDouble(JOptionPane.showInputDialog("Qual é o comprimento do seu Jardim?"));
                double areaJardim2 = larguraJardim2 * comprimentoJardim2;
                if (areaJardim2 >= 100) {
                        JOptionPane.showMessageDialog(null, "Seu jardim é grande", "Classificação do jardim",
                                        JOptionPane.INFORMATION_MESSAGE);
                                        jardinsGrandes++;

                } else {
                        JOptionPane.showMessageDialog(null, "Seu jardim é pequeno", "Classificação do jardim",
                                        JOptionPane.INFORMATION_MESSAGE);
                }

                double larguraJardim3 = Double
                                .parseDouble(JOptionPane.showInputDialog("Qual é a largura do seu jardim?"));
                double comprimentoJardim3 = Double
                                .parseDouble(JOptionPane.showInputDialog("Qual é o comprimento do seu Jardim?"));
                double areaJardim3 = larguraJardim3 * comprimentoJardim3;
                if (areaJardim3 >= 100) {
                        JOptionPane.showMessageDialog(null, "Seu jardim é grande", "Classificação do jardim",
                                        JOptionPane.INFORMATION_MESSAGE);
                                        jardinsGrandes++;

                } else {
                        JOptionPane.showMessageDialog(null, "Seu jardim é pequeno", "Classificação do jardim",
                                        JOptionPane.INFORMATION_MESSAGE);
                }

                double mediaJardins = (areaJardim1 + areaJardim2 + areaJardim3) / 3;

                JOptionPane.showMessageDialog(null, "A média da área dos seus jardins é:" + mediaJardins,
                                "Média dos jardins",
                                JOptionPane.INFORMATION_MESSAGE);
                                JOptionPane.showMessageDialog(null, "Voce possui " + jardinsGrandes + " Jardins grandes", "Tamanho dos jardins", JOptionPane.INFORMATION_MESSAGE);

        }
}
