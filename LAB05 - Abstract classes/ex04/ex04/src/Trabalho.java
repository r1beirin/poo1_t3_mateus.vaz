import java.time.LocalDate;

public class Trabalho extends Contato{
    private String tipo;

    public Trabalho(String nome, String apelido, String email, LocalDate aniversario, String tipo) {
        super(nome, apelido, email, aniversario);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String imprimirContato() {
        return imprimirBasico();
    }

    @Override
    public String toString() {
        return "Trabalho{\n" +
                imprimirContato() +
                "\nTipo: " + tipo +
                '}';
    }
}
