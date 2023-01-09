public class Cliente implements Classificavel {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean eMenorQue(Classificavel obj) {
        Cliente compara = (Cliente) obj;
        return nome.compareTo(compara.nome) < 0;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + '\n';
    }
}
