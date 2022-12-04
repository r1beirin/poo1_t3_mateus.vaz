import java.time.LocalDate;

public class Vendedor extends Funcionario {
    public Vendedor(String nome, LocalDate dataNascimento, double valorFixo, double comissao, int vendas){
        super(nome, dataNascimento, 0);
        super.setSalario((comissao * vendas) + valorFixo);
    }

    @Override
    public double getSalario() {
        return super.getSalario();
    }

    public void setSalario(double valorFixo, double comissao, int vendas) {
        double salario = (comissao * vendas) + valorFixo;
        super.setSalario(salario);
    }
}
