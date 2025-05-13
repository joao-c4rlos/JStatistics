import javax.swing.JOptionPane;

public class Cliente {
    private String nome;
    private String endereco;
    private String telefone;

    public Cliente (String nome, String endereco, String telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;

    }
    public void exibir () {
        JOptionPane.showMessageDialog(null,
                "Esses são os seus dados cadastrados:" + "\n" + nome + "\n" + endereco + "\n" + telefone,
                "Dados cadastrados", JOptionPane.INFORMATION_MESSAGE);
    }


}
