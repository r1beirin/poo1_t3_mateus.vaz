public class Produto implements Classificavel{
    private int codigo;

    public Produto(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean eMenorQue(Classificavel obj) {
        Produto compara = (Produto) obj;
        return codigo < compara.codigo;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + '\n';
    }
}
