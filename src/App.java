import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aula 3- Switch e Loops");
        // o switch é uma estrutura de seleção multipla
        // Um "if" mais organizado
        // Escolha
        // Caso
        // Indicado para resolver listas ou constantes
        // Menu
        // opção1
        // opção2
        int ap;
        do {
            ap = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite a opção: \n1- Estatística Descritiva \n 2-Probabilidade \n 3-Modelos probabilisticos\n 4-Sair",
                    "Métodos de estatística", JOptionPane.QUESTION_MESSAGE));
            if (ap == 4) {
                break; // evita cair no switch
            }

            switch (ap) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Estatística descritiva", "Métodos de estatística", ap);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Probabilidade", "Métodos de estatística", ap);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Modelos probabilisticos", "Métodos de estatística", ap);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "opção invalida", "Métodos de estatística",
                            JOptionPane.ERROR_MESSAGE);
                    break;

            }
        } while (ap != 4);

        JOptionPane.showMessageDialog(null, "Encerrando sistema...", "Métodos de estatística",
                JOptionPane.INFORMATION_MESSAGE);

        int contador = 1;

        while (contador < 3) {
            JOptionPane.showMessageDialog(null, "Viva o SENAI");
            contador = contador + 1;
        }
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
        for (int cont = 1; cont <= 10; cont++) {
            System.out.println(cont);
        }
        String sair;
        do {

            sair = JOptionPane.showInputDialog("sair? Sim ou Não");

        } while (!sair.equalsIgnoreCase("sim"));
        {

        }

    }
    /* Como funcionqm os loops */
    // while
    // for
    // do while
    /*
     * contador
     * condição
     * incremento
     */

    /*
     * Ajustar bugs logicos do codigo menu estatistico
     * crie um loop para deixar o menu com opções do usuario escolher uma nova opçao
     * ou sair o usuario que vai decidir a hora de sair
     */

}
