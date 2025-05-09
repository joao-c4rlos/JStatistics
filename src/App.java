import javax.swing.*;

public class App {
        public static void main(String[] args) throws Exception {
                JOptionPane.showMessageDialog(null, "Alo, Jardim!");
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

                int servicos;
                int numeroServicos = 0;
                do {
                        servicos = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Escolha um tipo de serviço: \n1-Cortes de grama \n2-Podas em geral \n3-Limpeza de terreno \n4-Plantio de grama \n5-Projeto de paisagismo \n6-Finalizar",
                                        "Tipos de serviço", JOptionPane.QUESTION_MESSAGE));
                        if (servicos == 6) {

                                break;

                        }

                        switch (servicos) {
                                case 1:
                                        JOptionPane.showMessageDialog(null, "Você escolheu cortes de grama",
                                                        "Tipos de serviço",
                                                        JOptionPane.INFORMATION_MESSAGE);
                                        numeroServicos++;

                                        break;
                                case 2:
                                        JOptionPane.showMessageDialog(null, "Podas em geral", "Tipos de serviço",
                                                        JOptionPane.INFORMATION_MESSAGE);
                                        numeroServicos++;

                                        break;
                                case 3:
                                        JOptionPane.showMessageDialog(null, "Limpeza de terreno", "Tipos de serviço",
                                                        JOptionPane.INFORMATION_MESSAGE);
                                        numeroServicos++;
                                        break;

                                case 4:
                                        JOptionPane.showMessageDialog(null, "Plantio de grama", "Tipos de serviço",
                                                        JOptionPane.INFORMATION_MESSAGE);
                                        numeroServicos++;
                                        break;
                                case 5:
                                        JOptionPane.showMessageDialog(null, "Projeto de paisagismo", "Tipos de serviço",
                                                        JOptionPane.INFORMATION_MESSAGE);
                                        numeroServicos++;
                                        break;

                        }
                } while (servicos != 6);
                JOptionPane.showMessageDialog(null, "Escolhas feitas com sucesso...", "Tipos de serviço",
                                JOptionPane.INFORMATION_MESSAGE);

                double desconto = 0.0;
                if (numeroServicos >= 3) {
                        desconto = 0.1; // 10% de desconto se 3 ou mais serviços
                        JOptionPane.showMessageDialog(null, "Você tem um desconto de 10% por fidelidade!",
                                        "Desconto Aplicado", JOptionPane.INFORMATION_MESSAGE);
                } else if (numeroServicos == 2) {
                        desconto = 0.05; // 5% de desconto se 2 serviços
                        JOptionPane.showMessageDialog(null, "Você tem um desconto de 5% por fidelidade!",
                                        "Desconto Aplicado", JOptionPane.INFORMATION_MESSAGE);
                }

                double precoServico = 100.0; // Cada serviço custa 100 reais
                double valorTotal = numeroServicos * precoServico;
                double valorComDesconto = valorTotal * (1 - desconto);

                // Exibindo o valor com o desconto aplicado
                JOptionPane.showMessageDialog(null,
                                "Valor total dos serviços: R$ " + valorTotal + "\nValor com desconto: R$ "
                                                + valorComDesconto,
                                "Resumo", JOptionPane.INFORMATION_MESSAGE);

        }
}