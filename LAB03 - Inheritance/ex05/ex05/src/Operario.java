public class Operario extends Funcionario{
    public Operario(){

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
