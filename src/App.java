import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Aplicando lógica de programação (Aristoteles e George Boole)
        //Scanner leia = new Scanner(System.in);
        //Variavel é um espaço reservado na memoria do computador
        //Serve para guardar valores
        //Possui tipos (textoo, número, lógico ...)
        /*
         * Ex-1: Crie um algoritmo para o JStatistic que leia a opção desejada:
         * "Qual o conjunto de dados utilizado? 1-Populacional 2-amostral"
         * O valor recebido deve ser um valor inteiro
         * 
         */
         //variavel declarada em java.
        /*System.out.println("\t # \t # \t JStatistics \t # \t # \t ");
        System.out.println("Qual o conjunto de dados utilizado? 1-Populacional 2-amostral");
        opcao = leia.nextInt();
        System.out.println(opcao);*/
        int opcao;
        JOptionPane.showMessageDialog(null, "O jogo da Estatística: JStatistcs");
        opcao = Integer.parseInt(JOptionPane.showInputDialog(" Vamos começar o jogo?\n Escolha a sua estratégia:\n 1-Populacional \n 2-Amostral"));
        JOptionPane.showMessageDialog(null, "Você escolheu:"+opcao, "JStatistics", JOptionPane.DEFAULT_OPTION);
        

        /*
         * Você deve criar um menu perguntando ao usuário
         * Que tipo de variavel ele deseja cadastrar
         * 1- Quantitativa
         * 2- Qalitativa
         * 
         * O menu deve ter as quebras de linha conforme o texto acima.
         * Tudo deve ser feito em apenas um System.out.println()
         * Mostre a opção escolhida (o numero lido)
         */
        String opcaoVariavel = JOptionPane.showInputDialog("Que tipo de variavel ele deseja cadastrar\r\n" +
                        " 1- Quantitativa\r\n" + 
                        " 2- Qualitativa");
                        int opVariavel = Integer.parseInt(opcaoVariavel);
                        JOptionPane.showMessageDialog(null, "Sua escolha foi: "+ opVariavel, "JStatistics", JOptionPane.INFORMATION_MESSAGE);
        System.out.println();
                        
    }
}
