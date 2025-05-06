import javax.swing.*;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
       //cara ou coroa - probabilidade
       //50% cara
       //50% coroa
       //espaço amostral
       //Variavel que receba a interação do jogo
       //Random
       //Switch
       //For, do while

       String[] espacoAmostral = {"Cara","Coroa"};

       Random random = new Random();

       //Contadores para verificar a distribuição
       int contCara = 0;
       int contCoroa = 0;
       String mensagem="Espaço amostral:{Cara,Coroa}\n Probabilidade de Cara: 50% \n Probabilidade de Coroa: 50% \n Deseja lançar a moeda?";git
       //loop de lançamento
       while (true) {
        //interação com o usuario
        int opcao =JOptionPane.showConfirmDialog(null, mensagem, "Lançando moedas", JOptionPane.YES_NO_OPTION);
        if (opcao != JOptionPane.YES_OPTION) {

            //estatisticas
            String estatisticas = "Jogo Finalizado!\n Total de lançamentos:"+(contCara+contCoroa)+"\n Total de Caras:"+ contCara+ "\nTotal de coroas"+ contCoroa;
            JOptionPane.showMessageDialog(null, estatisticas, "Finalizando o jogo", JOptionPane.INFORMATION_MESSAGE);
            break;
            
        }
        int resultado = random.nextInt(2);//0-cara 1-coroa
        if (resultado  == 0){
        contCara++;
            
        }else{
            contCoroa++;
        }
        String saida = "Resultado do lançamento:"+espacoAmostral[resultado]+" \n (Indice gerado:"+resultado+")";
        JOptionPane.showMessageDialog(null, saida, "Resultado", JOptionPane.INFORMATION_MESSAGE);
       }
        
    }
}
