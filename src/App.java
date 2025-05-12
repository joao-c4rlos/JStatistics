import javax.swing.JOptionPane;
public class App {
        public static void main(String[] args) throws Exception {
                int servicos;
                String[] nomesServicos = {"Cortes de grama", "Podas em geral", "Limpeza de terreno", "Plantio de grama", "Projeto de paisagismo"};
                double[] valoresServicos = {150.00, 100.00, 100.00, 200.00, 300.00};
                do {
                        servicos = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Escolha um tipo de serviço: \n1-Cortes de grama R$150 \n2-Podas em geral R$100 \n3-Limpeza de terreno R$100 \n4-Plantio de grama R$200 \n5-Projeto de paisagismo R$300\n6-Finalizar",
                                        "Tipos de serviço", JOptionPane.QUESTION_MESSAGE));
                        if (servicos == 6) {

                                break;

                        }

                        switch (servicos) {
                                case 1:
                                        JOptionPane.showMessageDialog(null, "Você escolheu cortes de grama",
                                                        "Tipos de serviço",
                                                        JOptionPane.INFORMATION_MESSAGE);

                                        break;
                                case 2:
                                        JOptionPane.showMessageDialog(null, "Podas em geral", "Tipos de serviço",
                                                        JOptionPane.INFORMATION_MESSAGE);

                                        break;
                                case 3:
                                        JOptionPane.showMessageDialog(null, "Limpeza de terreno", "Tipos de serviço",
                                                        JOptionPane.INFORMATION_MESSAGE);

                                        break;

                                case 4:
                                        JOptionPane.showMessageDialog(null, "Plantio de grama", "Tipos de serviço",
                                                        JOptionPane.INFORMATION_MESSAGE);

                                        break;
                                case 5:
                                        JOptionPane.showMessageDialog(null, "Projeto de paisagismo", "Tipos de serviço",
                                                        JOptionPane.INFORMATION_MESSAGE);

                                        break;

                        }
                } while (servicos != 6);
                JOptionPane.showMessageDialog(null, "Escolhas feitas com sucesso...", "Tipos de serviço",
                                JOptionPane.INFORMATION_MESSAGE);
                                for (int i = 0; i < valoresServicos.length - 1; i++) {
                                        for (int j = i + 1; j < valoresServicos.length; j++) {
                                            if (valoresServicos[i] > valoresServicos[j]) {
                                                // Troca os valores
                                                double tempValor = valoresServicos[i];
                                                valoresServicos[i] = valoresServicos[j];
                                                valoresServicos[j] = tempValor;
                            
                                                // Troca os nomes correspondentes
                                                String tempNome = nomesServicos[i];
                                                nomesServicos[i] = nomesServicos[j];
                                                nomesServicos[j] = tempNome;
                                            }
                                        }
                                    }
                            
                                    // Exibindo os serviços ordenados por valor
                                    StringBuilder listaOrdenada = new StringBuilder("Serviços ordenados por valor (crescente):\n");
                                    for (int i = 0; i < nomesServicos.length; i++) {
                                        listaOrdenada.append(nomesServicos[i] + " - R$" + valoresServicos[i] + "\n");
                                    }
                            
                                    JOptionPane.showMessageDialog(null, listaOrdenada.toString(), "Serviços Ordenados", JOptionPane.INFORMATION_MESSAGE);
                                }
                            

        }
