import javax.swing.*;
import java.util.*;

public class App {
    public static void main(String[] args) {
        // Preços dos serviços
        Servico corteDeGrama = new Servico("Corte de Grama", 150.00);
        Servico podaEmGeral = new Servico("Podas em Geral", 100.00);
        Servico limpezaDeTerreno = new Servico("Limpeza de Terreno", 100.00);
        Servico plantioDeGrama = new Servico("Plantio de Grama", 200.00);
        Servico projetoDePaisagismo = new Servico("Projeto de Paisagismo", 300.00);

        // Lista de serviços disponíveis
        Servico[] servicos = {corteDeGrama, podaEmGeral, limpezaDeTerreno, plantioDeGrama, projetoDePaisagismo};

        // Contador de serviços escolhidos
        int servicosEscolhidos = 0;  
        int servicoEscolhido;
        
        // Usamos uma lista para armazenar os serviços escolhidos
        List<Servico> servicosSelecionados = new ArrayList<>();

        do {
            // Menu para o usuário escolher o serviço
            StringBuilder menu = new StringBuilder("Escolha um tipo de serviço:\n");
            for (int i = 0; i < servicos.length; i++) {
                menu.append((i + 1) + "- " + servicos[i].getNome() + " R$" + servicos[i].getPreco() + "\n");
            }
            menu.append("6- Finalizar");

            servicoEscolhido = Integer.parseInt(JOptionPane.showInputDialog(null, menu.toString(), "Tipos de Serviço", JOptionPane.QUESTION_MESSAGE));

            if (servicoEscolhido == 6) {
                break;
            }

            // Caso escolha um serviço válido
            if (servicoEscolhido >= 1 && servicoEscolhido <= 5) {
                Servico serviço = servicos[servicoEscolhido - 1];  // Obtém o serviço escolhido
                JOptionPane.showMessageDialog(null, "Você escolheu: " + serviço.getNome(), "Serviço Escolhido", JOptionPane.INFORMATION_MESSAGE);
                servicosEscolhidos++; // Conta o número de serviços escolhidos
                servicosSelecionados.add(serviço); // Adiciona o serviço à lista
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } while (servicoEscolhido != 6);

        // Exibe a lista de serviços escolhidos
        StringBuilder servicosEscolhidosStr = new StringBuilder("Serviços escolhidos:\n");
        for (Servico s : servicosSelecionados) {
            servicosEscolhidosStr.append(s.getNome()).append("\n");
        }
        JOptionPane.showMessageDialog(null, servicosEscolhidosStr.toString(), "Serviços Escolhidos", JOptionPane.INFORMATION_MESSAGE);

        // Aplica o desconto e calcula o valor total com desconto
        double valorTotalComDesconto = 0.0;
        double valorTotal = 0.0;

        // Calcula o valor total baseado nos serviços escolhidos
        for (Servico serviço : servicosSelecionados) {
            valorTotal += serviço.getPreco();
        }

        // Aplicando o desconto automaticamente baseado na quantidade de serviços escolhidos
        if (servicosEscolhidos >= 3) {
            valorTotalComDesconto = valorTotal * 0.9;  // 10% de desconto
        } else if (servicosEscolhidos == 2) {
            valorTotalComDesconto = valorTotal * 0.95; // 5% de desconto
        } else {
            valorTotalComDesconto = valorTotal;  // Sem desconto
        }

        // Exibe o valor final com desconto
        JOptionPane.showMessageDialog(null, "Valor total dos serviços: R$ " + valorTotal + "\nValor com desconto: R$ " + valorTotalComDesconto, "Resumo dos Serviços", JOptionPane.INFORMATION_MESSAGE);

        // Preços fixos dos serviços para as estatísticas
        double[] valoresServicos = {150.00, 100.00, 100.00, 200.00, 300.00};

        // Estatísticas Descritivas dos preços dos serviços
        double media = calcularMedia(valoresServicos);
        double moda = calcularModa(valoresServicos);
        double mediana = calcularMediana(valoresServicos);
        double maximo = Collections.max(Arrays.asList(150.00, 100.00, 100.00, 200.00, 300.00));
        double minimo = Collections.min(Arrays.asList(150.00, 100.00, 100.00, 200.00, 300.00));

        // Exibe as estatísticas
        String estatisticas = "Estatísticas Descritivas dos Serviços:\n" +
                "Média: R$ " + media + "\n" +
                "Moda: R$ " + moda + "\n" +
                "Mediana: R$ " + mediana + "\n" +
                "Máximo: R$ " + maximo + "\n" +
                "Mínimo: R$ " + minimo;

        JOptionPane.showMessageDialog(null, estatisticas, "Estatísticas Descritivas", JOptionPane.INFORMATION_MESSAGE);
    }

    // Método para calcular a média
    public static double calcularMedia(double[] valores) {
        double soma = 0.0;
        for (double valor : valores) {
            soma += valor;
        }
        return soma / valores.length;
    }

    // Método para calcular a moda (valor mais frequente)
    public static double calcularModa(double[] valores) {
        // Ordena os valores
        Arrays.sort(valores);

        double moda = valores[0];
        int frequenciaMaxima = 0;
        int frequenciaAtual = 1;

        for (int i = 1; i < valores.length; i++) {
            if (valores[i] == valores[i - 1]) {
                frequenciaAtual++;
            } else {
                frequenciaAtual = 1;
            }

            if (frequenciaAtual > frequenciaMaxima) {
                moda = valores[i];
                frequenciaMaxima = frequenciaAtual;
            }
        }

        return moda;
    }

    // Método para calcular a mediana
    public static double calcularMediana(double[] valores) {
        Arrays.sort(valores);
        int tamanho = valores.length;
        if (tamanho % 2 == 0) {
            return (valores[tamanho / 2 - 1] + valores[tamanho / 2]) / 2.0;
        } else {
            return valores[tamanho / 2];
        }
    }
}

class Servico {
    private String nome;
    private double preco;

    public Servico(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
