import java.util.Scanner;

public class Produto {
    public static float alteraPreco(float preco, float porcentagem){
        float temp;

        if(porcentagem > -100){
            temp = 1 + porcentagem/100;
            preco *= temp;
            return preco;
        }
        else return -1;
    }

    public static void main(String[] args){
        String[] nome = new String[4];
        float[] preco = new float[4];
        int[] qtdEstoque = new int[4];

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 4; i++){
            System.out.printf("Nome do produto %d: ", i);
            nome[i] = sc.nextLine();
            System.out.printf("Preço do produto %d: ", i);
            preco[i] = sc.nextFloat();
            System.out.printf("Quantidade do produto %d: ", i);
            qtdEstoque[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("Aumentando o preço em 10% do produto 1 e 3");
        preco[0] = alteraPreco(preco[0], -110);
        preco[2] = alteraPreco(preco[2], 10);

        System.out.println("Reduzindo o preço em 5% do produto 2");
        if(alteraPreco(preco[1], -5) == -1){
            System.out.println("Erro: preço não alterado. Porcentagem inválida.");
        }
        else{
            System.out.println("Preço alterado com sucesso.");
        }

        System.out.println("Alterando o preço do produto 3");
        if(alteraPreco(preco[3], -110) == -1){
            System.out.println("Erro: preço não alterado. Porcentagem inválida.");
        }

        System.out.println("Produtos Cadastrados: ");
        for(int i = 0; i < 4; i++){
            System.out.printf("Produto: %s\n Preco: %f\n Estoque: %d", nome[i], preco[i], qtdEstoque[i]);
            System.out.printf("\n======================\n");
        }
    }
}