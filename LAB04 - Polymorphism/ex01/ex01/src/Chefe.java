import java.time.LocalDate;

public class Chefe extends Funcionario {
    public Chefe(String nome, LocalDate dataNascimento, double salarioFixo){
        super(nome, dataNascimento, salarioFixo);
    }

    @Override
    public double getSalario() {
        return super.getSalario();
    }

    @Override
    public void setSalario(double salarioFixo){
        super.setSalario(salarioFixo);
    }
}
