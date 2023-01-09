public class Servico implements Classificavel {
    private double preco;

    public Servico(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public boolean eMenorQue(Classificavel obj) {
        Servico compara = (Servico) obj;
        return preco < compara.preco;
    }

    @Override
    public String toString() {
        return "Preço: " + preco + '\n';
    }
}
