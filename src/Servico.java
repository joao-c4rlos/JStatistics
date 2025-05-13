public class Servico {
    private String nome;
    private double preco;
    public Servico(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Método para retornar o nome do serviço
    public String getNome() {
        return nome;
    }

    // Método para retornar o preço do serviço
    public double getPreco() {
        return preco;
    }

    // Método para aplicar desconto baseado na quantidade de serviços contratados
    public double aplicarDesconto(int quantidade) {
        double total = preco * quantidade;

        // Aplicando descontos
        if (quantidade >= 3) {
            total *= 0.9;  // 10% de desconto
        } else if (quantidade == 2) {
            total *= 0.95; // 5% de desconto
        }

        return total;
    }
}


