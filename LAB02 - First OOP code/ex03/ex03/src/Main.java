import java.sql.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Figurinhas[] jogador = new Figurinhas[3];

        for(int i = 0; i < 3; i++){
            jogador[i] = new Figurinhas();
        }

        for(int i = 0; i < 3; i++){
            System.out.printf("Digite o nome do jogador %d: ", i+1);
            jogador[i].setName(sc.nextLine());
            System.out.printf("Digite a data de nascimento (ano-mes-dia) do jogador %d: ", i+1);
            jogador[i].setBirthday(Date.valueOf(sc.nextLine()));
            System.out.printf("Digite a altura do jogador %d: ", i+1);
            jogador[i].setHeight(sc.nextFloat());
            System.out.printf("Digite o peso do jogador %d: ", i+1);
            jogador[i].setWeight(sc.nextFloat());
            sc.nextLine();
            System.out.printf("Digite a posição do jogador %d: ", i+1);
            jogador[i].setPosition(sc.nextLine());
            System.out.printf("Digite o pais do jogador %d: ", i+1);
            jogador[i].setCountry(sc.nextLine());
            System.out.println();
        }

        for(int i = 0; i < 3; i++){
            System.out.printf("Nome do jogador %d: %s\n", i+1, jogador[i].getName());
            System.out.printf("Data de nascimento do jogador %d: %s\n", i+1, jogador[i].getBirthday());
            System.out.printf("Altura do jogador %d: %.2f\n", i+1, jogador[i].getHeight());
            System.out.printf("Peso do jogador %d: %.2f\n", i+1, jogador[i].getWeight());
            System.out.printf("Posição do jogador %d: %s\n", i+1, jogador[i].getPosition());
            System.out.printf("País do jogador %d: %s\n", i+1, jogador[i].getCountry());
            if(i == 2) continue;
            else System.out.println("========================================");
        }
    }
}
