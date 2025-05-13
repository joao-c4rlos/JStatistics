import java.util.ArrayList;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        JOptionPane.showMessageDialog(null, "Alô Jardim!!", null, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Insira as informações dos seus jardins a seguir", null,
                JOptionPane.INFORMATION_MESSAGE);

        ArrayList<Double> areas = new ArrayList<>();

        boolean continuar = true;

        while (continuar) {
            double largura = Double.parseDouble(JOptionPane.showInputDialog("Qual é a largura do seu jardim?"));
            double comprimento = Double.parseDouble(JOptionPane.showInputDialog("Qual é o comprimento do seu Jardim?"));
            areas.add(largura * comprimento);
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro jardim?", "Cadastrar jardim",
                    JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.NO_OPTION)

            {
                continuar = false;
            }
        }

        double mediaJardins = calcularMedia(areas);

        JOptionPane.showMessageDialog(null, "A média da área dos seus jardins é: " + mediaJardins, "Média dos jardins",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static double calcularMedia(ArrayList<Double> valores) {
        double soma = 0;
        for (double valor : valores) {
            soma += valor;
        }
        return soma / valores.size();
    }
}