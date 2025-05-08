import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // Classe é um conjunto de objetos
        // Nosso objetivo nesse código é entender a diferença
        // Entre método com o tipo void e método com tipo String
        Mamifero m1 = new Mamifero();
        m1.setNomeCientifico("Bos Taurus");
        Mamifero m2 = new Mamifero();
        m2.setNomeCientifico("Macropus");
        Mamifero m3 = new Mamifero();
        m3.setNomeCientifico("Trichechus");

        JOptionPane.showMessageDialog(null, "Nome cientifico:" + m1.getNomeCientifico(), "linhagem dos mamíferos",
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Nome cientifico:" + m2.getNomeCientifico(), "linhagem dos mamíferos",
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Nome cientifico:" + m3.getNomeCientifico(), "linhagem dos mamíferos",
                JOptionPane.INFORMATION_MESSAGE);

    }
}
