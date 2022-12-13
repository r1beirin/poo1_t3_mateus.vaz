import java.time.LocalDate;

public class Amigos extends Contato{
    private int grau;

    public Amigos(String nome, String apelido, String email, LocalDate aniversario, int grau) {
        super(nome, apelido, email, aniversario);
        this.grau = grau;
    }

    public int getGrau() {
        return grau;
    }

    public void setGrau(int grau) {
        this.grau = grau;
    }

    @Override
    public String imprimirContato() {
        return imprimirBasico();
    }

    @Override
    public String toString() {
        return "Amigos{\n" +
                imprimirContato() +
                "\nGrau: " + grau +
                '}';
    }


}
