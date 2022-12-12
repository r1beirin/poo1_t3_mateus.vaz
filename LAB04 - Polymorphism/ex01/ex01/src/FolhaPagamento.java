public class FolhaPagamento{
    public static void mostraFolhaPagamento(Funcionario[] funcionario){
        for(int i = 0; i < funcionario.length; i++){
            System.out.printf("Pagamento do funcionário %s é de R$%.2f\n", funcionario[i].getNome(), funcionario[i].getSalario());
        }
    }
}
