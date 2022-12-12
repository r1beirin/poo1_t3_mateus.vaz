import java.time.LocalDate;

public class Empresa {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[4];

        //  Chefe: nome, dataNascimento, salarioFixo
        funcionarios[0] = new Chefe("Mateus", LocalDate.of(2000, 10, 10), 5000);
        //  Vendedor: nome, dataNascimento, valorFixo, comissao, vendas
        funcionarios[1] = new Vendedor("Pedro", LocalDate.of(2000, 10, 10), 2000, 100, 15);
        //  Operario: nome, dataNascimento, valorProducao, qtdProduzida
        funcionarios[2] = new Operario("João", LocalDate.of(2000, 10, 10), 1000, 2);
        //  Horista: nome, dataNascimento, valorHora, horasTrabalhadas
        funcionarios[3] = new Horista("Marcelo", LocalDate.of(2000, 10, 10), 90, 30);

        FolhaPagamento.mostraFolhaPagamento(funcionarios);
    }
}