public class Main {
    public static void main(String[] args){
        Produto[] produtos = new Produto[3];
        Cliente[] clientes = new Cliente[3];
        Servico[] servicos = new Servico[3];

        produtos[0] = new Produto(123);
        produtos[1] = new Produto(1);
        produtos[2] = new Produto(53);

        clientes[0] = new Cliente("Thiago");
        clientes[1] = new Cliente("Zeus");
        clientes[2] = new Cliente("Mateus");

        servicos[0] = new Servico(10.4);
        servicos[1] = new Servico(0.3);
        servicos[2] = new Servico(1.2);

        Classificador.ordena(produtos);
        Classificador.ordena(clientes);
        Classificador.ordena(servicos);

        for(int i = 0; i < 3; i++){
            System.out.print(produtos[i]);
        }
        for(int i = 0; i < 3; i++) {
            System.out.print(clientes[i]);
        }
        for(int i = 0; i < 3; i++) {
            System.out.print(servicos[i]);
        }
    }
}
