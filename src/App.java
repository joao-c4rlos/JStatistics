import javax.swing.JOptionPane;
public class App {

    public static void main(String[] args) throws Exception {
        //if
        //if else
        //switch
        //ternário ?
        int op = Integer.parseInt(JOptionPane.showInputDialog("Qual o resultado de uma populaçõa? \n1- Parâmetro \n2- Estatística"));
        if (op== 1)  {
            JOptionPane.showMessageDialog(null,"Certa resposta", "JStatistics", JOptionPane.INFORMATION_MESSAGE);
            
        }else{
            JOptionPane.showMessageDialog(null, "Resposta errada!😂", "JStatistics", JOptionPane.ERROR_MESSAGE);
        }
        //if else
        //exercicios (para cada pergunta, crie um if)
        /*Considerando os números 30, 50, 80, 90 Digite o valor da média aritmética simples?
        62,5
         * Considerando os valores 10, 40, 50, 80, 10 Digite qual é a moda?
         * 10
         * Qual a medida de tendência central que mostra o centro da amostra?
         * mediana
         */
        double media = Double.parseDouble(JOptionPane.showInputDialog(null, "Considerando os números \n30, 50, 80, 90 \nDigite o valor da média aritmética simples?", "Questão 1", JOptionPane.QUESTION_MESSAGE));
        if (media == 62.5){
            JOptionPane.showMessageDialog(null, "Resposta correta", "Questão 1", JOptionPane.INFORMATION_MESSAGE);
            
        }else{
            JOptionPane.showMessageDialog(null, "Tente novamente", "Questão 1", JOptionPane.ERROR_MESSAGE);
        }

        int moda = Integer.parseInt(JOptionPane.showInputDialog(" Considerando os valores \n10, 40, 50, 80, 10 \nDigite qual é a moda?", JOptionPane.QUESTION_MESSAGE));
        if (moda == 10) {
            JOptionPane.showMessageDialog(null, "Resposta correta", "Questão 2", JOptionPane.INFORMATION_MESSAGE);
            
        }else{
            JOptionPane.showMessageDialog(null, "Tente novamente", "Questão 2", JOptionPane.ERROR_MESSAGE);
        }

        String resposta = JOptionPane.showInputDialog(null, "Qual a medida de tendência central que mostra o centro da amostra?", "Questão 3", JOptionPane.QUESTION_MESSAGE);
        
         if (resposta.equalsIgnoreCase("mediana")) {
            JOptionPane.showMessageDialog(null, "Resposta correta", "Questão 3", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Tente novamente", "Questão 3", JOptionPane.ERROR_MESSAGE);
        }
        

            
        
       


    }
}
