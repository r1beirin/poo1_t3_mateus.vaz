import java.time.LocalDate;

public class C2 extends C1{
    public String etiqueta;
    protected double preco;
    private LocalDate dataValidade;

    public C2(){
        System.out.println("Classe C2: chamada do construtor padrao, sem parametros");
    }

    public C2(String etiqueta, double preco, LocalDate dataValidade){
        System.out.println("Classe C2: chamada do construtor padrao, com parametros");
        this.etiqueta = etiqueta;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public void mostrar_atributos(){
        System.out.printf("Etiqueta: \n", getEtiqueta());
        System.out.printf("Preço: \n", getPreco());
        System.out.printf("Data de validade: \n", getDataValidade());
    }

    public void mostrar_atributos_super(){
        super.mostrar_atributos();
        System.out.printf("Etiqueta: \n", getEtiqueta());
        System.out.printf("Preço: \n", getPreco());
        System.out.printf("Data de validade: \n", getDataValidade());
    }
}
