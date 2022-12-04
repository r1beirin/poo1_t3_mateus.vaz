public class Vendedor extends Funcionario {
    public Vendedor(){
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
