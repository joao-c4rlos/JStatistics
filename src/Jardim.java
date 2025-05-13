public class Jardim {
    private double largura;
    private double comprimento;

    public Jardim (double largura, double comprimento){
        this.largura = largura;
        this.comprimento = comprimento;
    }
    public double calcularArea(){
        return largura *comprimento;
    }

}
