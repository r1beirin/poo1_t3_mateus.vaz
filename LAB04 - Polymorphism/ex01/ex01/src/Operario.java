import java.time.LocalDate;

public class Operario extends Funcionario{
    public Operario(String nome, LocalDate dataNascimento, double valorProducao, int qtdProduzida){
        super(nome, dataNascimento, 0);
        super.setSalario(valorProducao * qtdProduzida);
    }

    @Override
    public double getSalario() {
        return super.getSalario();
    }

    public void setSalario(double valorProducao, int qtdProduzida){
        double salario = valorProducao * qtdProduzida;
        super.setSalario(salario);
    }
}
