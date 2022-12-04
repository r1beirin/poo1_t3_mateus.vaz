public class Horista extends Funcionario{
    public Horista(){

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
