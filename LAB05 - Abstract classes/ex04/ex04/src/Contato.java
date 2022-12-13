import java.time.LocalDate;

public abstract class Contato {
    private String nome;
    private String apelido;
    private String email;
    private LocalDate aniversario;

    public Contato(String nome, String apelido, String email, LocalDate aniversario) {
        this.nome = nome;
        this.apelido = apelido;
        this.email = email;
        this.aniversario = aniversario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getAniversario() {
        return aniversario;
    }

    public void setAniversario(LocalDate aniversario) {
        this.aniversario = aniversario;
    }

    public String imprimirBasico(){
        return "Nome: " + nome +
                "\nApelido: " + apelido +
                "\nEmail: " + email +
                "\nAniversário: " + aniversario;
    }

    public abstract String imprimirContato();
}
