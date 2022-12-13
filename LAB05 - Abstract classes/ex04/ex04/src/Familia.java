import java.time.LocalDate;

public class Familia extends Contato{
    private String parentesco;

    public Familia(String nome, String apelido, String email, LocalDate aniversario, String parentesco) {
        super(nome, apelido, email, aniversario);
        this.parentesco = parentesco;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    @Override
    public String imprimirContato() {
        return imprimirBasico();
    }

    @Override
    public String toString() {
        return "Familia{\n" +
                imprimirContato() +
                "\nParentesco: " + parentesco +
                '}';
    }
}
