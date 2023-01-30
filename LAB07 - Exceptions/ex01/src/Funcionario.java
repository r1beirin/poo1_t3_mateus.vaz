public class Funcionario {
    private String cpf;
    private String nome;
    private double salario;
    private double tetoSalarial;

    public Funcionario(String cpf, String nome, double salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
        tetoSalarial = 40000;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getTetoSalarial() {
        return tetoSalarial;
    }

    public void setTetoSalarial(double tetoSalarial) {
        this.tetoSalarial = tetoSalarial;
    }

    public void aumentarSalario(double percentual){
        double foo = salario * (1 + (percentual/100));
        try{
            if(foo > tetoSalarial) throw new SalarioMaiorTeto();
            if(foo < 0) throw new SalarioNegativo();
            else setSalario(foo);
        }
        catch (SalarioMaiorTeto e){
            System.out.println("Salário maior que o teto salarial.\n");
        }
        catch (SalarioNegativo e){
            System.out.println("Salário negativo.\n");
        }
        finally {
            System.out.println(salario);
        }
    }
}
