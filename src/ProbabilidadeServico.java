import java.util.Random;
import javax.swing.*;

public class ProbabilidadeServico {
    public static void main(String[] args) {
        String[] servicos = {"Corte de Grama", "Podas em Geral", "Limpeza de Terreno", "Plantio de Grama", "Projeto de Paisagismo"};
        int[] contadores = new int[servicos.length];

        Random random = new Random();
        int totalSimulacoes = 1000;

        // Simula 1000 escolhas aleatórias de serviços (exceto opção "Finalizar")
        for (int i = 0; i < totalSimulacoes; i++) {
            int escolha = random.nextInt(servicos.length); // Escolhe de 0 a 4
            contadores[escolha]++;
        }

        // Calcula a probabilidade de cada serviço ser escolhido
        StringBuilder resultado = new StringBuilder("Probabilidades de escolha dos serviços (em %):\n");
        for (int i = 0; i < servicos.length; i++) {
            double probabilidade = (double) contadores[i] / totalSimulacoes * 100;
            resultado.append(servicos[i] + ": " + String.format("%.2f", probabilidade) + "%\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString(), "Probabilidade de Escolha", JOptionPane.INFORMATION_MESSAGE);
    }
}
