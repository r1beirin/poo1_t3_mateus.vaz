import java.time.LocalDate;

public class Horista extends Funcionario{
    public Horista(String nome, LocalDate dataNascimento, double valorHora, int horasTrabalhadas){
        super(nome, dataNascimento, 0);
        super.setSalario(valorHora * horasTrabalhadas);
    }

    @Override
    public double getSalario() {
        return super.getSalario();
    }

    public void setSalario(double valorHora, int horasTrabalhadas){
        double salario = valorHora * horasTrabalhadas;
        super.setSalario(salario);
    }
}
