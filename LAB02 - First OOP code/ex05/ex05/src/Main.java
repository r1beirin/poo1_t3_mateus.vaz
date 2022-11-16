import java.sql.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Figurinhas[] jogadoresSel1;
        Figurinhas[] jogadoresSel2;

        //  No construtor é feito a instanciação de um vetor de Figurinhas de tamanho 11.
        //  No construtor também é feito a leitura e armazenamento dos jogadores respectivos a cada seleção.
        System.out.println("========== Jogadores da seleção 1 ====================");
        Selecao selecao1 = new Selecao("Brasil", "Luxemburgo");

        //  Caso seja necessário tratar dados dos jogadores da seleção
        //  temos que declarar um vetor de jogadores e esse vetor receber o getter de jogadores
        //  da seleção desejada, como no exemplo abaixo.
        //  Um exemplo é utilizar o for para acessar informações contidas em jogadoresSel1[i].
        jogadoresSel1 = selecao1.getJogador();

        //  No construtor é feito a instanciação de um vetor de Figurinhas de tamanho 11.
        //  No construtor também é feito a leitura e armazenamento dos jogadores respectivos a cada seleção.
        System.out.println("========== Jogadores da seleção 2 ====================");
        Selecao selecao2 = new Selecao("Mexico", "Pelé");

        //  Caso seja necessário tratar dados dos jogadores da seleção
        //  temos que declarar um vetor de jogadores e esse vetor receber o getter de jogadores
        //  da seleção desejada, como no exemplo abaixo.
        //  Um exemplo é utilizar o for para acessar informações contidas em jogadoresSel2[i].
        jogadoresSel2 = selecao2.getJogador();
    }
}