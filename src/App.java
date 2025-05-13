import javax.swing.*;

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
        StringBuilder serviçosEscolhidosStr = new StringBuilder();

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
                serviçosEscolhidosStr.append(serviço.getNome()).append("\n"); // Adiciona o nome do serviço à lista
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } while (servicoEscolhido != 6);

        // Exibe a lista de serviços escolhidos
        JOptionPane.showMessageDialog(null, "Serviços escolhidos:\n" + serviçosEscolhidosStr.toString(), "Serviços Escolhidos", JOptionPane.INFORMATION_MESSAGE);

        // Aplica o desconto e calcula o valor total com desconto
        double valorTotalComDesconto = 0.0;
        double valorTotal = 0.0;

        // Agora calculamos o valor total baseado nos serviços escolhidos
        for (int i = 0; i < servicosEscolhidos; i++) {
            Servico serviço = servicos[i];  // Considerando que os serviços escolhidos estão no array
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
    }
}

