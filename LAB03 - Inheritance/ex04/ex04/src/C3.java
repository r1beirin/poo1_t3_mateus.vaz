import java.time.LocalDate;

public class C3 extends C2{
    public String nome;
    protected int idade;
    private double peso;

    public C3(){
        System.out.println("Classe C3: chamada do construtor padrao, sem parametros");
    }

    public C3(String nome, int idade, double peso){
        System.out.println("Classe C3: chamada do construtor padrao, com parametros");
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public C3(String etiqueta, double preco, LocalDate dataValidade){
        super(etiqueta, preco, dataValidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void mostrar_atributos(){
        System.out.printf("Nome: \n", getNome());
        System.out.printf("Idade: \n", getIdade());
        System.out.printf("Peso: \n", getPeso());
    }

    public void mostrar_atributos_super(){
        super.mostrar_atributos();
        System.out.printf("Nome: \n", getNome());
        System.out.printf("Idade: \n", getIdade());
        System.out.printf("Peso: \n", getPeso());
    }
}
