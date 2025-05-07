import java.util.Random;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        String[] espacoAmostral = { "1", "2", "3", "4", "5", "6" };

        Random random = new Random();

        // Contadores para verificar a distribuição dos dados🎲
        int contUm = 0;
        int contDois = 0;
        int contTres = 0;
        int contQuatro = 0;
        int contCinco = 0;
        int contSeis = 0;
        String mensagem = "Espaço amostral:{1,2,3,4,5,6}\nDeseja lançar o dado?🎲";
        // loop de lançamento dos dados🎲
        while (true) {
            // interação com o usuario
            int opcao = JOptionPane.showConfirmDialog(null, mensagem, "Lançando dados", JOptionPane.YES_NO_OPTION);
            if (opcao != JOptionPane.YES_OPTION) {
                int lançamentos = contUm + contDois + contTres + contQuatro + contCinco + contSeis;
                double total = (contUm * 1) + (contDois * 2) + (contTres * 3) + (contQuatro * 4) + (contCinco * 5) + (contSeis * 6);
                double media = 0;
                if (total>0) {
                    media = total/lançamentos; 
                }


                // estatisticas
                String estatisticas = "Jogo Finalizado!\nTotal de lançamentos:"
                        + (contUm + contDois + contTres + contQuatro + contCinco + contSeis) + "\nTotal de 1: " + contUm
                        + "\nTotal de 2: " + contDois + "\nTotal de 3: " + contTres + "\nTotal de 4: " + contQuatro
                        + "\nTotal de 5: " + contCinco + "\nTotal de 6: " + contSeis+"\nMédia com base nos lançamentos:"+ media;
                JOptionPane.showMessageDialog(null, estatisticas, "Finalizando o jogo",
                        JOptionPane.INFORMATION_MESSAGE);
                break;

            }
            int resultado = random.nextInt(6);// 0-1, 1-2, 2-3, 3-4, 4-5, 5-6
            if (resultado == 0) {
                contUm++;

            }
            if (resultado == 1) {
                contDois++;

            }
            if (resultado == 2) {
                contTres++;

            }
            if (resultado == 3) {
                contQuatro++;

            }
            if (resultado == 4) {
                contCinco++;

            }
            if (resultado == 5) {
                contSeis++;

            }
            String saida = "Resultado do lançamento:" + espacoAmostral[resultado];
            JOptionPane.showMessageDialog(null, saida, "Resultado", JOptionPane.INFORMATION_MESSAGE);

            
        }
    }
}
