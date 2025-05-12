import javax.swing.JOptionPane;

public class App {
        public static void main(String[] args) throws Exception {

                int jardinsGrandes = 0;
                double[] areasJardins = new double[3];

                JOptionPane.showMessageDialog(null, "Alô Jardim!!", null, JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Insira as informações dos seus jardins a seguir", null,
                                JOptionPane.INFORMATION_MESSAGE);
                double larguraJardim1 = Double
                                .parseDouble(JOptionPane.showInputDialog("Qual é a largura do seu jardim?"));
                double comprimentoJardim1 = Double
                                .parseDouble(JOptionPane.showInputDialog("Qual é o comprimento do seu Jardim?"));
                areasJardins[0] = larguraJardim1 * comprimentoJardim1;
                if (areasJardins[0] >= 100) {
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
                areasJardins[1] = larguraJardim2 * comprimentoJardim2;
                if (areasJardins[1] >= 100) {
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
                areasJardins[2] = larguraJardim3 * comprimentoJardim3;
                if (areasJardins[2] >= 100) {
                        JOptionPane.showMessageDialog(null, "Seu jardim é grande", "Classificação do jardim",
                                        JOptionPane.INFORMATION_MESSAGE);
                        jardinsGrandes++;

                } else {
                        JOptionPane.showMessageDialog(null, "Seu jardim é pequeno", "Classificação do jardim",
                                        JOptionPane.INFORMATION_MESSAGE);
                }
                String areasExibidas = "Áreas dos jardins:\n";
                for (int i = 0; i < areasJardins.length; i++) {
                        areasExibidas += "Jardim " + (i + 1) + ": " + areasJardins[i] + " m²\n";
                }

                double mediaJardins = (areasJardins[0] + areasJardins[1] + areasJardins[2]) / 3;

                JOptionPane.showMessageDialog(null, "A média da área dos seus jardins é:" + mediaJardins,
                                "Média dos jardins",
                                JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Voce possui " + jardinsGrandes + " Jardins grandes",
                                "Tamanho dos jardins", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, areasExibidas, "Áreas dos jardins",
                                JOptionPane.INFORMATION_MESSAGE);
                double moda = 0;
                boolean temModa = true;

                if (areasJardins[0] == areasJardins[1] && areasJardins[1] == areasJardins[2]) {
                        moda = areasJardins[0];
                } else if (areasJardins[0] == areasJardins[1]) {
                        moda = areasJardins[0];
                } else if (areasJardins[0] == areasJardins[2]) {
                        moda = areasJardins[0];
                } else if (areasJardins[1] == areasJardins[2]) {
                        moda = areasJardins[1];
                } else {
                        temModa = false;
                }

                // Exibir a moda
                if (temModa) {
                        JOptionPane.showMessageDialog(null, "A moda das áreas dos jardins é: " + moda + " m²",
                                        "Moda das áreas", JOptionPane.INFORMATION_MESSAGE);
                } else {
                        JOptionPane.showMessageDialog(null, "Não há moda nas áreas dos jardins (todas são diferentes)",
                                        "Moda das áreas", JOptionPane.INFORMATION_MESSAGE);
                }

        }
}