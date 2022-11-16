import java.sql.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Figurinhas[] jogadorSel1 = new Figurinhas[11];
        Figurinhas[] jogadorSel2 = new Figurinhas[11];
        Selecao selecao1 = new Selecao("Brasil", "Luxemburgo");
        Selecao selecao2 = new Selecao("Mexico", "Pelé");

        for(int i = 0; i < 11; i++){
            jogadorSel1[i] = new Figurinhas("Brasil");
            jogadorSel2[i] = new Figurinhas("Mexico");
        }

        //  Instanciação jogadores seleção 1
        System.out.println("========== Jogadores da seleção 1 ====================");
        for(int i = 0; i < 11; i++){
            System.out.printf("Digite o nome do jogador %d: ", i+1);
            jogadorSel1[i].setName(sc.nextLine());
            System.out.printf("Digite a data de nascimento (ano-mes-dia) do jogador %d: ", i+1);
            jogadorSel1[i].setBirthday(Date.valueOf(sc.nextLine()));
            System.out.printf("Digite a altura do jogador %d: ", i+1);
            jogadorSel1[i].setHeight(sc.nextFloat());
            System.out.printf("Digite o peso do jogador %d: ", i+1);
            jogadorSel1[i].setWeight(sc.nextFloat());
            sc.nextLine();
            System.out.printf("Digite a posição do jogador %d: ", i+1);
            jogadorSel1[i].setPosition(sc.nextLine());
            System.out.println();
        }
        selecao1.setJogador(jogadorSel1);

        //  Instanciação jogadores seleção 2
        System.out.println("========== Jogadores da seleção 2 ====================");
        for(int i = 0; i < 11; i++){
            System.out.printf("Digite o nome do jogador %d: ", i+1);
            jogadorSel2[i].setName(sc.nextLine());
            System.out.printf("Digite a data de nascimento (ano-mes-dia) do jogador %d: ", i+1);
            jogadorSel2[i].setBirthday(Date.valueOf(sc.nextLine()));
            System.out.printf("Digite a altura do jogador %d: ", i+1);
            jogadorSel2[i].setHeight(sc.nextFloat());
            System.out.printf("Digite o peso do jogador %d: ", i+1);
            jogadorSel2[i].setWeight(sc.nextFloat());
            sc.nextLine();
            System.out.printf("Digite a posição do jogador %d: ", i+1);
            jogadorSel2[i].setPosition(sc.nextLine());
            System.out.printf("Digite o pais do jogador %d: ", i+1);
            System.out.println();
        }
        selecao2.setJogador(jogadorSel2);
    }
}